import java.util.Scanner; // Required for reading user input

/**
 * The FullWordConverter class provides a command-line interface for converting
 * temperatures between Celsius, Fahrenheit, and Kelvin. This version uses
 * full names for units in the menu for improved clarity.
 * TemperatureConverter
 */
public class TemperatureConverter {

    // --- Conversion Methods ---

    /**
     * Converts temperature from Celsius to Fahrenheit.
     * Formula: F = C * 9/5 + 32
     * @param celsius The temperature in Celsius.
     * @return The equivalent temperature in Fahrenheit.
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32.0;
    }

    /**
     * Converts temperature from Fahrenheit to Celsius.
     * Formula: C = (F - 32) * 5/9
     * @param fahrenheit The temperature in Fahrenheit.
     * @return The equivalent temperature in Celsius.
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0/9.0;
    }

    /**
     * Converts temperature from Celsius to Kelvin.
     * Formula: K = C + 273.15
     * @param celsius The temperature in Celsius.
     * @return The equivalent temperature in Kelvin.
     */
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    /**
     * Converts temperature from Kelvin to Celsius.
     * Formula: C = K - 273.15
     * @param kelvin The temperature in Kelvin.
     * @return The equivalent temperature in Celsius.
     */
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    /**
     * Converts temperature from Fahrenheit to Kelvin (using Celsius as an intermediary).
     * @param fahrenheit The temperature in Fahrenheit.
     * @return The equivalent temperature in Kelvin.
     */
    public static double fahrenheitToKelvin(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        return celsiusToKelvin(celsius);
    }

    /**
     * Converts temperature from Kelvin to Fahrenheit (using Celsius as an intermediary).
     * @param kelvin The temperature in Kelvin.
     * @return The equivalent temperature in Fahrenheit.
     */
    public static double kelvinToFahrenheit(double kelvin) {
        double celsius = kelvinToCelsius(kelvin);
        return celsiusToFahrenheit(celsius);
    }

    /**
     * The main method handles the user interaction, input, and output for the converter.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // 1. Initialize the Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        String unitFrom, unitTo;
        double temperature;
        double result;

        // 2. Display the user menu with full unit names
        System.out.println("--- Full Temperature Converter Menu ---");
        System.out.println("Select conversion type:");
        System.out.println("1: Celsius -> Fahrenheit    4: Fahrenheit -> Celsius");
        System.out.println("2: Celsius -> Kelvin        5: Fahrenheit -> Kelvin");
        System.out.println("3: Kelvin -> Celsius        6: Kelvin -> Fahrenheit");
        System.out.print("Enter choice (1-6): ");

        // Input validation for choice
        if (!scanner.hasNextInt()) {
            System.err.println("Invalid input. Please enter a number between 1 and 6.");
            scanner.close();
            return;
        }

        int choice = scanner.nextInt();

        // 3. Get the temperature value
        System.out.print("Enter temperature value: ");
        if (!scanner.hasNextDouble()) {
            System.err.println("Invalid input. Please enter a numerical temperature.");
            scanner.close();
            return;
        }
        temperature = scanner.nextDouble();

        // 4. Perform conversion and set unit strings
        try {
            switch (choice) {
                case 1: // C -> F
                    result = celsiusToFahrenheit(temperature);
                    unitFrom = "°C (Celsius)"; unitTo = "°F (Fahrenheit)";
                    break;
                case 2: // C -> K
                    result = celsiusToKelvin(temperature);
                    unitFrom = "°C (Celsius)"; unitTo = "K (Kelvin)";
                    break;
                case 3: // K -> C
                    result = kelvinToCelsius(temperature);
                    unitFrom = "K (Kelvin)"; unitTo = "°C (Celsius)";
                    break;
                case 4: // F -> C
                    result = fahrenheitToCelsius(temperature);
                    unitFrom = "°F (Fahrenheit)"; unitTo = "°C (Celsius)";
                    break;
                case 5: // F -> K
                    result = fahrenheitToKelvin(temperature);
                    unitFrom = "°F (Fahrenheit)"; unitTo = "K (Kelvin)";
                    break;
                case 6: // K -> F
                    result = kelvinToFahrenheit(temperature);
                    unitFrom = "K (Kelvin)"; unitTo = "°F (Fahrenheit)";
                    break;
                default:
                    System.err.println("Invalid choice. Please run the program again and enter a number between 1 and 6.");
                    scanner.close();
                    return;
            }

            // 5. Print Result (using printf for formatting to two decimal places)
            System.out.printf("\nResult:\n%.2f %s is equal to %.2f %s\n", temperature, unitFrom, result, unitTo);

        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // 6. Close the scanner resource
            scanner.close();
        }
    }
}