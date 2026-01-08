package calculator.service;

import calculator.domain.Operator;
import calculator.exception.IllegalOperatorException;

public class CalculatorService {
	
	/**
     * Performs the arithmetic calculation based on the provided operator.
     * Handles division and modulo safety checks.
     */
	public double calculate(double num1, double num2, Operator operator) throws IllegalOperatorException {

		return switch (operator) {
		case ADD -> num1 + num2;
		case SUB -> num1 - num2;
		case MUL -> num1 * num2;
		case DIV -> {
			if (num2 == 0)
				throw new ArithmeticException("Division by zero");
			yield num1 / num2;
		}
		case MOD -> {
			if (num2 == 0)
				throw new ArithmeticException("Modulo by zero");
			yield num1 % num2;
		}
		};
	}
}
