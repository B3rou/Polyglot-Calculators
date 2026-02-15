import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LifeTimeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("        LIFE TIME CALCULATOR");
        System.out.println("========================================");

        LocalDate dob = null;

        while (dob == null) {
            try {
                System.out.print("\nEnter your Date of Birth (YYYY-MM-DD): ");
                String input = sc.nextLine().trim();

                // Replace common separators with dash
                input = input.replace("/", "-").replace(" ", "-");

                // Formatter allows single digit month/day
                DateTimeFormatter formatter =
                        DateTimeFormatter.ofPattern("yyyy-M-d");

                dob = LocalDate.parse(input, formatter);

                if (dob.isAfter(LocalDate.now())) {
                    System.out.println("Date of birth cannot be in the future.");
                    dob = null;
                }

            } catch (DateTimeParseException e) {
                System.out.println("Invalid date. Try again.");
                System.out.println("Examples: 2003/5/7 | 2003-05-07 | 2003 5 7");
            }
        }

        LocalDate today = LocalDate.now();
        Period age = Period.between(dob, today);

        long totalDays = ChronoUnit.DAYS.between(dob, today);
        long totalHours = totalDays * 24;
        long totalMinutes = totalHours * 60;

        System.out.println("\n----------------------------------------");
        System.out.println("              YOUR AGE");
        System.out.println("----------------------------------------");
        System.out.printf("Years   : %d%n", age.getYears());
        System.out.printf("Months  : %d%n", age.getMonths());
        System.out.printf("Days    : %d%n", age.getDays());

        System.out.println("\n----------------------------------------");
        System.out.println("          TOTAL TIME LIVED");
        System.out.println("----------------------------------------");
        System.out.printf("Days    : %,d%n", totalDays);
        System.out.printf("Hours   : %,d%n", totalHours);
        System.out.printf("Minutes : %,d%n", totalMinutes);

        System.out.println("\n========================================");
        System.out.println("   \"Time is the most valuable asset\"");
        System.out.println("========================================");

        sc.close();
    }
}
