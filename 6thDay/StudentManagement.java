import java.util.Scanner;

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
                    System.out.println("View Students");
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

}