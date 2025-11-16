import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // Conversion factors to grams
    private static final Map<String, Double> TO_GRAMS = new HashMap<>();

    static {
        TO_GRAMS.put("microgram", 0.000001);
        TO_GRAMS.put("µg", 0.000001);
        TO_GRAMS.put("ug", 0.000001);

        TO_GRAMS.put("milligram", 0.001);
        TO_GRAMS.put("mg", 0.001);

        TO_GRAMS.put("gram", 1.0);
        TO_GRAMS.put("g", 1.0);

        TO_GRAMS.put("kilogram", 1000.0);
        TO_GRAMS.put("kg", 1000.0);

        TO_GRAMS.put("ton", 1_000_000.0);
        TO_GRAMS.put("t", 1_000_000.0);

        TO_GRAMS.put("pound", 453.59237);
        TO_GRAMS.put("lb", 453.59237);

        TO_GRAMS.put("ounce", 28.3495231);
        TO_GRAMS.put("oz", 28.3495231);

        TO_GRAMS.put("stone", 6350.29318);
        TO_GRAMS.put("st", 6350.29318);

        TO_GRAMS.put("carat", 0.2);
        TO_GRAMS.put("ct", 0.2);
    }

    /**
     * Convert a mass value from one unit to another.
     */
    public static double convert(double value, String fromUnit, String toUnit) {
        double inGrams = value * TO_GRAMS.get(fromUnit);
        return inGrams / TO_GRAMS.get(toUnit);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Mass Converter ===");
        System.out.println("Supported units:");
        System.out.println("  microgram  (µg, ug)");
        System.out.println("  milligram  (mg)");
        System.out.println("  gram       (g)");
        System.out.println("  kilogram   (kg)");
        System.out.println("  ton        (t)");
        System.out.println("  pound      (lb)");
        System.out.println("  ounce      (oz)");
        System.out.println("  stone      (st)");
        System.out.println("  carat      (ct)");
        System.out.println();

        System.out.print("Enter value: ");
        double value = scanner.nextDouble();

        if (value < 0) {
            System.out.println("Error: Value must be positive.");
            return;
        }

        System.out.print("Convert from (unit): ");
        String fromUnit = scanner.next().toLowerCase();

        System.out.print("Convert to (unit): ");
        String toUnit = scanner.next().toLowerCase();

        if (!TO_GRAMS.containsKey(fromUnit) || !TO_GRAMS.containsKey(toUnit)) {
            System.out.println("Error: Unsupported unit.");
            return;
        }

        double result = convert(value, fromUnit, toUnit);

        System.out.println("\nResult:");
        System.out.println(value + " " + fromUnit + " = " + result + " " + toUnit);
    }
}
