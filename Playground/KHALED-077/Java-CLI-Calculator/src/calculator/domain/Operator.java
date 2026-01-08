package calculator.domain;

import calculator.exception.IllegalOperatorException;

/**
 * Maps arithmetic symbols to their respective operation types.
 */
public enum Operator {
	ADD('+'),
	SUB('-'),
	MUL('*'),
	DIV('/'),
	MOD('%');
	
	private final char symbol;

	private Operator(char symbol) {
		this.symbol = symbol;
	}
	
	public char getSymbol() {
        return symbol;
    }

	/**
     * Converts a character input into an Operator enum.
     * @throws IllegalOperatorException if the character is not supported.
     */
    public static Operator fromChar(char c) throws IllegalOperatorException {
        for (Operator op : values()) {
            if (op.symbol == c) {
                return op;
            }
        }
        throw new IllegalOperatorException("Invalid operator: " + c);
    }
}
