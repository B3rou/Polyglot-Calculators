package calculator.ui;

import calculator.domain.Operator;
import calculator.exception.IllegalOperatorException;
import calculator.service.CalculatorService;

/**
 * Main class for the Java CLI Calculator.
 * 
 * This class handles user interaction via the console. It reads inputs,
 * performs calculations, and displays results.
 */
public class CalculatorApp {

	private static final InputValidator in = new InputValidator();
	private static final CalculatorService service = new CalculatorService();

	/**
	 * Entry point of the application.
	 */
	public static void main(String[] args) {
		printHeader();
		try {
			start();
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}
		in.close();
	}

	/**
	 * Main loop: asks for calculation input repeatedly until the user chooses to
	 * quit.
	 */
	private static void start() {
		while (true) {
			try {
				performCalculation();
			} catch (IllegalOperatorException | ArithmeticException e) {
				System.out.println("Error: " + e.getMessage());
			}

			System.out.println("\n(Type 'q' to quit or press Enter to continue)");
			String control = in.readString("> ");

			if (control.equalsIgnoreCase("q")) {
				break;
			}
		}
	}

	/**
	 * Reads two numbers and an operator from the user, performs the calculation,
	 * and prints the result.
	 */
	private static void performCalculation() {
		double num1 = in.readDouble("Enter first number: ");
		double num2 = in.readDouble("Enter second number: ");

		char opChar = in.readChar("Enter operator (+ - * / %): ");
		Operator operator = Operator.fromChar(opChar);

		double result = service.calculate(num1, num2, operator);
		printResult(result);
	}

	/**
	 * Prints a header for the calculator.
	 */
	private static void printHeader() {
		String line = "===============================";
		System.out.println(line);
		System.out.println("   Java CLI Calculator v1.0");
		System.out.println(line);
	}

	/**
	 * Prints the result of the calculation with formatting.
	 */
	private static void printResult(double result) {
		String line = "-------------------------------";
		System.out.println(line);
		System.out.println("Result: " + result);
		System.out.println(line);
	}
}
