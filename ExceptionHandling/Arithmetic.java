public class Arithmetic {

    public static void main(String args[]) {
        try {
            int a = 30, b = 0;
            int c = a / b; // cannot divide by zero
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        }
    }
}
