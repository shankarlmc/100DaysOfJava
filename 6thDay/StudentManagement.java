import java.util.Scanner;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
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
                    System.out.println("Add Student");
                    break;
                case "C":
                    System.out.println("Update Details");
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
        System.out.println("========================= Available Students ====================");
        for (Student student : students) {
            System.out.println(student);

        }
        System.out.println("====================================================");

    }

    public static void addStudent() {
        // add student record to the file

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
        return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
    }
}