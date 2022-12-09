import java.util.Scanner;

public class CalculateDivision {
    public static String Division(float percentage) {
        String division = "";
        if (percentage >= 80) {
            division = "Distinction";
        } else if (percentage >= 70) {
            division = "First Division";
        } else if (percentage >= 55) {
            division = "Second Division";
        } else {
            division = "Pass";
        }
        return division;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        int total = m1 + m2 + m3 + m4 + m5;
        float percentage = total / 5;
        System.out.println("Percentage is " + percentage);
        System.out.println(Division(percentage));
    }
}
