
import java.util.Scanner;
public class Main {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Enter two numbers: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            int result = 0;
            switch (operator) {
                case '+':
                    result = add(a, b);
                    break;
                case '-':
                    result = subtract(a, b);
                    break;
                case '*':
                    result = multiply(a, b);
                    break;
                case '/':
                    result = divide(a, b);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    return;
            }
            System.out.println("Result: " + result);
            System.out.println("Do you want to continue? (y/n): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'n') {
                run = false;
            }
        }
        scanner.close();
    }
    
}