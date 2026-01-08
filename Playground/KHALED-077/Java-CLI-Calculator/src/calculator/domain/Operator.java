package calculator.domain;

import calculator.exception.IllegalOperatorException;

/**
 * Enum representing arithmetic operators.
 * Maps a character symbol to the corresponding operation type.
 */
public enum Operator {
    ADD('+'),
    SUB('-'),
    MUL('*'),
    DIV('/'),
    MOD('%');

    private final char symbol;

    /**
     * Constructor to assign the character symbol to the operator.
     *
     * @param symbol Character representing the operator.
     */
    private Operator(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Returns the character symbol associated with the operator.
     *
     * @return The operator symbol as a char.
     */
    public char getSymbol() {
        return symbol;
    }

    /**
     * Converts a character input into an Operator enum.
     *
     * @param c Character input by the user.
     * @return Corresponding Operator enum.
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

