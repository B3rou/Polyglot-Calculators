package calculator.exception;

/**
 * Thrown to indicate that the user has provided an arithmetic operator
 * that is not supported by the system.
 */
public class IllegalOperatorException extends RuntimeException {

	public IllegalOperatorException(String message) {
		super(message);
	}
	
}
