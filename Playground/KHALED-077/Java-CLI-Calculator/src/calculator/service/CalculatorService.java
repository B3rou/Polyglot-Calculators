package calculator.service;

import calculator.domain.Operator;
import calculator.exception.IllegalOperatorException;

/**
 * Service class that performs arithmetic calculations.
 * 
 * This class handles basic operations: addition, subtraction,
 * multiplication, division, and modulo.
 */
public class CalculatorService {

    /**
     * Performs a calculation based on two numbers and an operator.
     *
     * @param num1 First operand
     * @param num2 Second operand
     * @param operator Arithmetic operator
     * @return Result of the calculation
     * @throws IllegalOperatorException if the operator is invalid
     * @throws ArithmeticException if division or modulo by zero occurs
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
