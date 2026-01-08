package calculator.ui;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Supplier;

/**
 * Utility class for robust CLI input handling.
 * It ensures the application doesn't crash on invalid user input.
 */
public class InputValidator {

	private final Scanner in = new Scanner(System.in);

	/**
     * Generic helper to repeat a prompt until a valid value is provided.
     */
	public <T> T readValue(String prompt, Supplier<T> reader, String errorMessage) {
		T input;
		while (true) {
			System.out.print(prompt);
			try {
				input = reader.get();
				in.nextLine(); // Clear the buffer
				return input;
			} catch (InputMismatchException e) {
				System.out.println(errorMessage);
				in.nextLine(); // Clear the buffer
			}
		}
	}

	public int readInt(String prompt) {
		return readValue(prompt, in::nextInt, "Invalid input! please enter a integer number");
	}

	public float readFloat(String prompt) {
		return readValue(prompt, in::nextFloat, "Invalid input! please enter a number");
	}

	public double readDouble(String prompt) {
		return readValue(prompt, in::nextDouble, "Invalid input! please enter a number");
	}
	
	/**
     * Matches user input against a specific Enum type.
     */
	// This method isn't used in current project
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
	
	public String readString(String prompt) {
	    System.out.print(prompt);
	    return in.nextLine().trim();
	}
	
	public char readChar(String prompt) {
		while (true) {
			String input = readString(prompt);
			if (input.length() == 1) {
				return input.charAt(0);
			}
			System.out.println("Invalid input! Please enter a single character.");
		}
	}

	public void close() {
		in.close();
	}
}
