package calculator.ui;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Supplier;

/**
 * Utility class for robust CLI input handling.
 * Ensures the application does not crash on invalid user input.
 */
public class InputValidator {

	private final Scanner in = new Scanner(System.in);

	/**
	 * Generic helper to repeat a prompt until a valid value is provided.
	 *
	 * @param prompt       The message displayed to the user.
	 * @param reader       Supplier providing the input parsing logic.
	 * @param errorMessage Error message displayed on invalid input.
	 * @param <T>          Type of value to read.
	 * @return The successfully read value of type T.
	 */
	public <T> T readValue(String prompt, Supplier<T> reader, String errorMessage) {
		T input;
		while (true) {
			System.out.print(prompt);
			try {
				input = reader.get();
				in.nextLine(); // Clear the scanner buffer
				return input;
			} catch (InputMismatchException e) {
				System.out.println(errorMessage);
				in.nextLine(); // Clear the scanner buffer
			}
		}
	}

	/**
	 * Reads an integer from CLI, repeatedly prompting until valid input is entered.
	 *
	 * @param prompt The message displayed to the user.
	 * @return The entered integer value.
	 */
	public int readInt(String prompt) {
		return readValue(prompt, in::nextInt, "Invalid input! Please enter an integer number.");
	}

	/**
	 * Reads a float from CLI, repeatedly prompting until valid input is entered.
	 *
	 * @param prompt The message displayed to the user.
	 * @return The entered float value.
	 */
	public float readFloat(String prompt) {
		return readValue(prompt, in::nextFloat, "Invalid input! Please enter a number.");
	}

	/**
	 * Reads a double from CLI, repeatedly prompting until valid input is entered.
	 *
	 * @param prompt The message displayed to the user.
	 * @return The entered double value.
	 */
	public double readDouble(String prompt) {
		return readValue(prompt, in::nextDouble, "Invalid input! Please enter a number.");
	}

	/**
	 * Reads a string input from the user.
	 *
	 * @param prompt Message displayed to the user.
	 * @return The trimmed string entered by the user.
	 */
	public String readString(String prompt) {
		System.out.print(prompt);
		return in.nextLine().trim();
	}

	/**
	 * Reads a single character from the user. Keeps prompting until a valid single
	 * character is entered.
	 *
	 * @param prompt Message displayed to the user.
	 * @return The entered character.
	 */
	public char readChar(String prompt) {
		while (true) {
			String input = readString(prompt);
			if (input.length() == 1) {
				return input.charAt(0);
			}
			System.out.println("Invalid input! Please enter a single character.");
		}
	}

	/**
	 * Matches user input against a specific Enum type. Currently unused in this
	 * project.
	 *
	 * @param prompt   Message displayed to the user.
	 * @param enumType Enum class to match input against.
	 * @param <E>      Type of Enum.
	 * @return Enum constant corresponding to user input.
	 */
	// this is not used in current project
	public <E extends Enum<E>> E readEnum(String prompt, Class<E> enumType) {
		String input;
		while (true) {
			try {
				input = readString(prompt);
				return Enum.valueOf(enumType, input.toUpperCase());
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid input! Valid values are:");
				for (E constant : enumType.getEnumConstants()) {
					System.out.println(constant + " ");
				}
				System.out.println();
			}
		}
	}

	/**
	 * Closes the internal Scanner. Should be called at the end of program
	 * execution.
	 */
	public void close() {
		in.close();
	}
}
