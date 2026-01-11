import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Scientific Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power (x^y)");
            System.out.println("6. Square Root");
            System.out.println("7. Logarithm (log10)");
            System.out.println("8. Sine");
            System.out.println("9. Cosine");
            System.out.println("10. Tangent");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    System.out.println("Result: " + (sc.nextDouble() + sc.nextDouble()));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    System.out.println("Result: " + (sc.nextDouble() - sc.nextDouble()));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    System.out.println("Result: " + (sc.nextDouble() * sc.nextDouble()));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    if (b == 0) {
                        System.out.println("Error: Division by zero");
                    } else {
                        System.out.println("Result: " + (a / b));
                    }
                    break;

                case 5:
                    System.out.print("Enter base and exponent: ");
                    System.out.println("Result: " + Math.pow(sc.nextDouble(), sc.nextDouble()));
                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    System.out.println("Result: " + Math.sqrt(sc.nextDouble()));
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    System.out.println("Result: " + Math.log10(sc.nextDouble()));
                    break;

                case 8:
                    System.out.print("Enter angle in degrees: ");
                    System.out.println("Result: " + Math.sin(Math.toRadians(sc.nextDouble())));
                    break;

                case 9:
                    System.out.print("Enter angle in degrees: ");
                    System.out.println("Result: " + Math.cos(Math.toRadians(sc.nextDouble())));
                    break;

                case 10:
                    System.out.print("Enter angle in degrees: ");
                    System.out.println("Result: " + Math.tan(Math.toRadians(sc.nextDouble())));
                    break;

                case 0:
                    System.out.println("Calculator exited.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
