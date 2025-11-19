import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Mass Converter CLI in Java
 *
 * Supports: gram (g), kilogram (kg), milligram (mg), pound (lb), ounce (oz), tonne (t/ton/tonne)
 *
 * Usage:
 *  - Interactive: `java Main` then enter lines like: 500 gram kg
 *  - Single-shot: `java Main 500 gram kg`
 *
 * Examples:
 *  500 gram kg    -> 0.5
 *  2 pound ounce  -> 32
 *  1 kilogram pound -> 2.20462
 */
public class Main {
    private static final Map<String, Double> TO_GRAMS = new HashMap<>();
    static {
        TO_GRAMS.put("g", 1.0);
        TO_GRAMS.put("gram", 1.0);
        TO_GRAMS.put("grams", 1.0);
        TO_GRAMS.put("kg", 1000.0);
        TO_GRAMS.put("kilogram", 1000.0);
        TO_GRAMS.put("kilograms", 1000.0);
        TO_GRAMS.put("mg", 0.001);
        TO_GRAMS.put("milligram", 0.001);
        TO_GRAMS.put("milligrams", 0.001);
        TO_GRAMS.put("lb", 453.59237);
        TO_GRAMS.put("pound", 453.59237);
        TO_GRAMS.put("pounds", 453.59237);
        TO_GRAMS.put("oz", 28.349523125);
        TO_GRAMS.put("ounce", 28.349523125);
        TO_GRAMS.put("ounces", 28.349523125);
        TO_GRAMS.put("t", 1_000_000.0);
        TO_GRAMS.put("ton", 1_000_000.0);
        TO_GRAMS.put("tonne", 1_000_000.0);
    }

    private static String normalize(String u) throws IllegalArgumentException {
        if (u == null) throw new IllegalArgumentException("empty unit");
        String key = u.trim().toLowerCase();
        if (TO_GRAMS.containsKey(key)) return key;
        // try stripping trailing period or plural 's'
        key = key.replaceAll("\\.$", "").replaceAll("s$", "");
        if (TO_GRAMS.containsKey(key)) return key;
        throw new IllegalArgumentException("Unknown unit: '" + u + "'");
    }

    private static double convert(double value, String from, String to) {
        String f = normalize(from);
        String t = normalize(to);
        double grams = value * TO_GRAMS.get(f);
        return grams / TO_GRAMS.get(t);
    }

    private static String formatResult(double v) {
        DecimalFormat df = new DecimalFormat("0.######");
        return df.format(v);
    }

    private static void interactive() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mass Converter — enter conversions like: 500 gram kg");
        System.out.println("Type 'exit' or Ctrl-C to quit.");
        while (true) {
            System.out.print("Enter conversion: ");
            String line = br.readLine();
            if (line == null) break;
            line = line.trim();
            if (line.isEmpty()) continue;
            if (line.equalsIgnoreCase("exit") || line.equalsIgnoreCase("quit")) break;
            String[] parts = line.split("\\s+");
            if (parts.length != 3) {
                System.out.println("Please provide exactly three tokens: <value> <from_unit> <to_unit>");
                continue;
            }
            try {
                double val = Double.parseDouble(parts[0]);
                if (val < 0) {
                    System.out.println("Please enter a non-negative number.");
                    continue;
                }
                double out = convert(val, parts[1], parts[2]);
                System.out.println(parts[0] + " " + parts[1] + " = " + formatResult(out) + " " + parts[2]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            try {
                interactive();
            } catch (IOException e) {
                System.err.println("I/O error: " + e.getMessage());
                System.exit(1);
            }
            return;
        }
        if (args.length != 3) {
            System.err.println("Provide exactly three arguments: <value> <from_unit> <to_unit>");
            System.exit(2);
        }
        try {
            double val = Double.parseDouble(args[0]);
            if (val < 0) {
                System.err.println("Error: value must be non-negative.");
                System.exit(2);
            }
            double result = convert(val, args[1], args[2]);
            System.out.println(formatResult(result));
        } catch (NumberFormatException e) {
            System.err.println("Error: value must be a number.");
            System.exit(2);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.exit(2);
        }
    }
}
