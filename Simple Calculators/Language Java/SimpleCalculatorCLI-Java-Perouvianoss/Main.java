import java.util.Scanner;

/**
 * SimpleCalculator - A basic calculator that performs addition, subtraction,
 * multiplication, and division on two numbers.
 * 
 * This is a Java implementation for the Awesome-Calculators repository.
 */
public class Main {
    
    /**
     * Main method that runs the calculator program.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first, second;  // Two numbers to be used in the operation
        char op;               // The operator character (+, -, *, /)
        
        // Ask the user for two numbers
        System.out.println("Please enter 2 numbers:");
        first = scanner.nextDouble();
        second = scanner.nextDouble();
        
        // Consume the newline character left in the input buffer
        scanner.nextLine();
        
        // Ask the user to choose an operation
        System.out.print("Select the operation you want to perform (+, -, *, /): ");
        String input = scanner.nextLine();
        op = input.charAt(0);  // Get the first character as the operator
        
        // Perform the chosen operation
        switch (op) {
            case '+':
                System.out.printf("The result of your operation: %.2f", first + second);
                break;
            case '-':
                System.out.printf("The result of your operation: %.2f", first - second);
                break;
            case '*':
                System.out.printf("The result of your operation: %.2f", first * second);
                break;
            case '/':
                // Check for division by zero
                if (second != 0) {
                    System.out.printf("The result of your operation: %.2f", first / second);
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                }
                break;
            default:
                System.out.println("Invalid operator entered!");
                break;
        }
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}