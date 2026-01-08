package calculator.exception;

/**
 * Thrown to indicate that the user has provided an arithmetic operator that is
 * not supported by the system.
 */
public class IllegalOperatorException extends RuntimeException {

	/**
	 * Constructs a new IllegalOperatorException with the specified detail message.
	 *
	 * @param message Detailed message explaining the exception.
	 */
	public IllegalOperatorException(String message) {
		super(message);
	}
}
