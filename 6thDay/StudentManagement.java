import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String option = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("A. View Students");
            System.out.println("B. Add Student");
            System.out.println("C. Update Details");
            System.out.println("D. Delete Student");
            System.out.println("E. Exit");
            System.out.println("===============================");
            System.out.println("Enter an option: ");
            option = scanner.nextLine();
            switch (option) {
                case "A":
                    viewStudents();
                    break;
                case "B":
                    addStudent();
                    break;
                case "C":
                    System.out.println("Enter student ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    updateStudent(id);
                    break;
                case "D":
                    System.out.println("Delete Student");
                    break;
                case "E":
                    System.out.println("***************** Bye! Bye!! Bye!!! *****************");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (!option.equals("E"));
    }

    public static void viewStudents() {
        List<Student> students = readDataFromCSV("students.txt");
        String leftAlignFormat = "| %-3d | %-18s  | %-26s |%n";
        System.out.format("+-----+---------------------+----------------------------+%n");
        System.out.format("| ID  | Name                |   College                  |%n");
        System.out.format("+-----+---------------------+----------------------------+%n");

        for (Student student : students) {
            System.out.format(leftAlignFormat, student.getId(), student.getName(), student.getCollege());
        }
        System.out.println("-----------------------------------------------------------");

    }

    public static void updateStudent(int id) {
        try {
            List<Student> students = readDataFromCSV("students.txt");
            for (Student student : students) {
                if (student.getId() == id) {
                    System.out.println("Enter new name: ");
                    String name = reader.readLine();
                    student.setName(name);
                    System.out.println("Enter new college: ");
                    String college = reader.readLine();
                    student.setCollege(college);
                    String data = id + "," + name + "," + college;
                    writeDataToCSV("students.txt", data);
                } else {
                    System.out.println("Student not found");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void addStudent() {
        try {
            System.out.println("------------------------------------------------");
            System.out.println("Enter Student ID: ");
            int id = Integer.parseInt(reader.readLine());
            System.out.println("------------------------------------------------");
            System.out.println("Enter Student Name: ");
            String name = reader.readLine();
            System.out.println("------------------------------------------------");
            System.out.println("Enter Student College: ");
            String college = reader.readLine();
            System.out.println("------------------------------------------------");
            String data = id + "," + name + "," + college;
            writeDataToCSV("students.txt", data);
            Student student = new Student(id, name, college);
            List<Student> students = readDataFromCSV("students.txt");
            students.add(student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static List<Student> readDataFromCSV(String fileName) {
        List<Student> students = new ArrayList<Student>();
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String Line = br.readLine();
            while (Line != null) {
                String[] attributes = Line.split(",");
                Student student = createStudent(attributes);
                students.add(student);
                Line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return students;
    }

    private static void writeDataToCSV(String fileName, String data) {
        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("students.txt", true));
            fileWriter.newLine();
            fileWriter.write(data);
            fileWriter.close();
            System.out.println("Data written to file successfully");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    private static Student createStudent(String[] metaData) {
        int id = Integer.parseInt(metaData[0]);
        String name = metaData[1];
        String college = metaData[2];

        return new Student(id, name, college);
    }

}

class Student {
    private int id;
    private String name;
    private String college;

    public Student(int id, String name, String college) {
        this.id = id;
        this.name = name;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "|\t" + id + "\t|\t" + name + "\t|\t" + college + "\t|";
    }
}