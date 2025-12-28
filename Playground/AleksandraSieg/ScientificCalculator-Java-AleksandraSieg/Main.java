import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        int mathOperation;
        double x;
        double result;

        Scanner scanner = new Scanner(System.in);

        // Display available mathematical operations for the user
        System.out.println("Choose mathematical operation");
        System.out.println("sinus - 1");
        System.out.println("cosinus - 2");
        System.out.println("tangens - 3");
        System.out.println("square root - 4");
        System.out.println("logarithm base 10 - 5");
        System.out.println("natural logarithm - 6");
        System.out.println("exponential e^x - 7");
        System.out.println("Factorial - 8");

        // Read user's choice (menu option)
        mathOperation = scanner.nextInt();

        // Handle selected mathematical operation
        switch(mathOperation) {
            case 1:
                x = readDouble(scanner);
                result = MathOperations.sinus(x);
                System.out.println("Your result is: " + result);
                break;
            case 2:
                x = readDouble(scanner);
                result = MathOperations.cosinus(x);
                System.out.println("Your result is: " + result);
                break;
            case 3:
                x = readDouble(scanner);

                // Threshold used to detect values close to tangent asymptotes
                double epsilon = 1e-8;

                // Tangent is undefined for pi/2 + k*pi.
                // If cos(x) is close to zero, the result may be very large or unstable.
                if(Math.abs(Math.cos(x)) < epsilon) {
                    System.out.println(
                            "Warning: tan(x) is undefined for pi/2 + k*pi." +
                                    "You are very close to an asymptote; the result may be unstable."
                    );
                }

                result = MathOperations.tangens(x);
                System.out.println("Your result is: " + result);
                break;
            case 4:
                x = readDouble(scanner);
                result = MathOperations.square_root(x);
                System.out.println("Your result is: " + result);
                break;
            case 5:
                x = readDouble(scanner);
                result = MathOperations.logarithmBase10(x);
                System.out.println("Your result is: " + result);
                break;
            case 6:
                x = readDouble(scanner);
                result = MathOperations.naturalLogarithm(x);
                System.out.println("Your result is: " + result);
                break;
            case 7:
                x = readDouble(scanner);
                result = MathOperations.exponential(x);
                System.out.println("Your result is: " + result);
                break;
            case 8:
                x = readDouble(scanner);
                result = MathOperations.factorial(x);
                System.out.println("Your result is: " + result);
                break;
            default:
                System.out.println("Invalid option. Please choose a number from the menu.");
                break;
        }

    }

    /**
     * Reads a numeric value from user input.
     * Keeps asking until a valid double value is provided.
     */
    private static double readDouble(Scanner scanner) {
        // Prompt user to enter a value
        System.out.println("Enter value");

        // Validate input: repeat until user enters a valid double
        while(!scanner.hasNextDouble()){
            System.out.println("Please enter a valid number:");
            scanner.next();
        }

        // Return the validated numeric value
        return scanner.nextDouble();
    }
}