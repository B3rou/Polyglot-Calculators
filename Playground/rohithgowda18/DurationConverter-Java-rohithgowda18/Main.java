import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Duration Converter CLI in Java
 *
 * Supports: second (sec, s), minute (min, m), hour (hr, h), day (d), week (w)
 *
 * Usage:
 *  - Interactive: `java Main` then enter lines like: 3600 sec hour
 *  - Single-shot: `java Main 3600 sec hour`
 *
 * Examples:
 *  3600 sec hour -> 1
 *  2 hour minute  -> 120
 *  3 day hour     -> 72
 */
public class Main {
    private static final Map<String, Double> TO_SECONDS = new HashMap<>();
    static {
        TO_SECONDS.put("s", 1.0);
        TO_SECONDS.put("sec", 1.0);
        TO_SECONDS.put("second", 1.0);
        TO_SECONDS.put("seconds", 1.0);

        TO_SECONDS.put("m", 60.0);
        TO_SECONDS.put("min", 60.0);
        TO_SECONDS.put("minute", 60.0);
        TO_SECONDS.put("minutes", 60.0);

        TO_SECONDS.put("h", 3600.0);
        TO_SECONDS.put("hr", 3600.0);
        TO_SECONDS.put("hour", 3600.0);
        TO_SECONDS.put("hours", 3600.0);

        TO_SECONDS.put("d", 86400.0);
        TO_SECONDS.put("day", 86400.0);
        TO_SECONDS.put("days", 86400.0);

        TO_SECONDS.put("w", 604800.0);
        TO_SECONDS.put("wk", 604800.0);
        TO_SECONDS.put("week", 604800.0);
        TO_SECONDS.put("weeks", 604800.0);
    }

    private static String normalize(String u) {
        if (u == null) throw new IllegalArgumentException("empty unit");
        String key = u.trim().toLowerCase();
        if (TO_SECONDS.containsKey(key)) return key;
        // strip trailing period or plural 's'
        key = key.replaceAll("\\.$", "").replaceAll("s$", "");
        if (TO_SECONDS.containsKey(key)) return key;
        throw new IllegalArgumentException("Unknown unit: '" + u + "'");
    }

    private static double convert(double value, String from, String to) {
        String f = normalize(from);
        String t = normalize(to);
        double seconds = value * TO_SECONDS.get(f);
        return seconds / TO_SECONDS.get(t);
    }

    private static String formatResult(double v) {
        DecimalFormat df = new DecimalFormat("0.######");
        return df.format(v);
    }

    private static void interactive() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Duration Converter — enter conversions like: 3600 sec hour");
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
