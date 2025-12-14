/**
 * Data Storage Converter 
 * 
 * Simple utility to convert between different units of digital data storage
 *
 * USAGE:
 * Input format:
 *   [value] [from units] [to units]
 * Units:
 *   Bits        ->  b
 *   Bytes       ->  B
 *   Kilobytes   ->  KB
 *   Megabytes   ->  MB
 *   Gigabytes   ->  GB
 *   Terabytes   ->  TB
 *   Petabytes   ->  PB
 * Example use:
 *   java -cp bin/ Converter 1 MB KB
 *
 * @version  0.1.1
 * @since    14.12.2025
 * @author   AlexandrAnatoliev
 */
public class Converter {
    /** Main entry point for the Converter application
     *
     * @param args command line arguments 
     *   [value]         Value of user's product     
     *   [from units]    Units need to convert from     
     *   [to units]      Units need to convert to     
     */
    public static void main(String[] args) {
        if (args.length > 2) {
            try {
                long value = Long.parseLong(args[0]);
                DataUnit from = parse(args[1]);
                DataUnit to = parse(args[2]);

                if (from == DataUnit.ERROR || to == DataUnit.ERROR) {
                    printExample();
                }
                else {
                    System.out.println(value + " " + args[1] + " = "
                            + convert(value, from, to) + " " + args[2]);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(Colors.RED.apply("\nERROR: " + e.getMessage()));
                printExample();
            }
        } 
        else {
            printExample();
        }
    }

    /**
     * Converts value from one units to other units
     *
     * @param   value   Value of user's data
     * @param   from    Units need to convert from
     * @param   to      Units need to convert to
     * @return  long    Result of converting 
     */
    public static long convert(long value, DataUnit from, DataUnit to) {
        return value * from.inBit / to.inBit;
    }

    /**
     * Parses input string to Measures value
     *
     * @param   input       Measure in string
     * @throws IllegalArgumentException If input is illegal argument
     * @return  DataUnit    Result of parsing 
     */
    public static DataUnit parse(String input) {
        try {
            return DataUnit.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println(Colors.RED.apply("ERROR: " + e.getMessage()));
            return DataUnit.ERROR;
        }
    }

    /**
     * Prints usage instructions
     */
    public static void printExample() {
        System.out.println(Colors.YELLOW.apply("""

                    Input format:
                    Converter [value] [from units] [to units]

                    Units:
                    Bits        ->  b
                    Bytes       ->  B
                    Kilobytes   ->  KB
                    Megabytes   ->  MB
                    Gigabytes   ->  GB
                    Terabytes   ->  TB
                    Petabytes   ->  PB

                    Example use:
                    java -cp bin/ Converter 1 MB KB
                    """));
    }
}
