import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        int year = scanner.nextInt();
        System.out.println("Enter your birth month: ");
        int month = scanner.nextInt();
        System.out.println("Enter your birth day: ");
        int day = scanner.nextInt();
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        System.out.println("Your age is: " + period.getYears() + " years, " +
                period.getMonths() + " months, "
                + period.getDays() + " days.");
    }
}
