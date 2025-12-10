// Import the Scanner class from java.util package
// Scanner allows us to read user input from the console
import java.util.Scanner;

// Define the main class for our program
// The class name must match the filename (SimpleInterestCalculator.java)
public class SimpleInterestCalculator {
    
    // The main method - entry point of any Java application
    // 'public' means this method can be accessed from outside
    // 'static' means it belongs to the class, not an instance
    // 'void' means it doesn't return any value
    // 'String[] args' can accept command-line arguments
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from System.in (keyboard)
        // 'scanner' is the variable name we can use to access the Scanner methods
        Scanner scanner = new Scanner(System.in);
        
        // Display program title
        // System.out.println() prints text and moves to the next line
        System.out.println("=== SIMPLE INTEREST CALCULATOR ===");
        
        // --- GET PRINCIPAL AMOUNT ---
        // Prompt the user to enter the principal amount
        // System.out.print() prints text without moving to the next line
        System.out.print("Enter principal amount: ");
        // Read a double value (decimal number) entered by the user
        // nextDouble() waits for user to type a number and press Enter
        // The value is stored in the 'principal' variable
        double principal = scanner.nextDouble();
        
        // --- GET INTEREST RATE ---
        // Prompt for annual interest rate
        System.out.print("Enter annual interest rate (%): ");
        // Read the interest rate as a double
        double rate = scanner.nextDouble();
        
        // --- GET TIME PERIOD ---
        // Prompt for time period
        System.out.print("Enter time period (in years): ");
        // Read the time period as a double
        double time = scanner.nextDouble();
        
        // --- CALCULATE SIMPLE INTEREST ---
        // Simple Interest Formula: (P × R × T) / 100
        // P = Principal, R = Rate, T = Time
        // This calculates the interest amount only
        double simpleInterest = (principal * rate * time) / 100;
        
        // --- CALCULATE TOTAL AMOUNT ---
        // Total Amount = Principal + Simple Interest
        // This calculates the final amount after adding interest
        double totalAmount = principal + simpleInterest;
        
        // --- DISPLAY RESULTS ---
        // Print a separator and results header
        System.out.println("\n=== CALCULATION RESULTS ===");
        
        // Display principal with currency formatting
        // printf() allows formatted output
        // %.2f means: display as floating point with 2 decimal places
        // %n means: new line (platform-independent)
        System.out.printf("Principal Amount: $%.2f%n", principal);
        
        // Display interest rate with percentage symbol
        System.out.printf("Annual Interest Rate: %.2f%%%n", rate);
        // Note: %% prints a literal % symbol
        
        // Display time period
        System.out.printf("Time Period: %.2f years%n", time);
        
        // Print a separator line
        System.out.println("----------------------------");
        
        // Display calculated simple interest
        System.out.printf("Simple Interest: $%.2f%n", simpleInterest);
        
        // Display total amount (principal + interest)
        System.out.printf("Total Amount: $%.2f%n", totalAmount);
        
        // --- CLEAN UP ---
        // Close the Scanner object to free system resources
        // This prevents memory leaks and is good practice
        scanner.close();
    }
}