package calculator.ui;

import calculator.domain.Operator;
import calculator.exception.IllegalOperatorException;
import calculator.service.CalculatorService;

public class CalculatorApp {

	private static final InputValidator in = new InputValidator();
	private static final CalculatorService service = new CalculatorService();

	public static void main(String[] args) {
		printHeader();
		try {
			start();
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}
		in.close();
	}

	private static void start() {
		while (true) {
			try {
				performCalculation();
			} catch (IllegalOperatorException | ArithmeticException e) {
				System.out.println("Error: " + e.getMessage());
			}

			System.out.println("\n(Type 'q' to quit or press any key to continue)");
			String control = in.readString("> ");
			
			if (control.equalsIgnoreCase("q")) {
				break;
			}
		}
	}

	private static void performCalculation() {
		double num1 = in.readDouble("Enter first number: ");
		double num2 = in.readDouble("Enter second number: ");

		char opChar = in.readChar("Enter operator (+ - * / %): ");

		Operator operator = Operator.fromChar(opChar);

		double result = service.calculate(num1, num2, operator);
		printResult(result);
	}

	private static void printHeader() {
		String line = "===============================";
		System.out.println(line);
		System.out.println("   Java CLI Calculator v1.0");
		System.out.println(line);
	}

	private static void printResult(double result) {
		String line = "-------------------------------";
		System.out.println(line);
		System.out.println("Result: " + result);
		System.out.println(line);
	}
}
