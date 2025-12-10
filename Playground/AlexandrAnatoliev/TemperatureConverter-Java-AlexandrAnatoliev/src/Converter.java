/**
* Temperature Converter 
* 
* USAGE:
* Input format:
*   [value] [from scale] 
* Scales:
*   F   Fahrenheit
*   C   Celsius
* Example use:
*   java -cp bin/ Converter 34 Celsius
*   bin$ java Converter 44 F
*
* @version  0.1.0
* @since    8.12.2025
* @author   AlexandrAnatoliev
*/
public class Converter {
    /** Main entry point for the Converter application
     *
     * @param args command line arguments
     *   [value]         Value of temperature
     *   [from scale]    Temperature scale
     */
    public static void main(String[] args) {
        if (args.length > 1) {
            try {
                double value = Double.parseDouble(args[0]);
                Scale from = parse(args[1]);

                if (from == Scale.ERROR) {
                    printExample();
                }
                else {
                    System.out.println(value + " " + from + " = "
                            + convert(value, from) + " " 
                            + (from == Scale.C ? "F" : "C"));
                }
            } catch (IllegalArgumentException e) {
                System.out.println(Colors.RED.apply(
                            "\nERROR: " + e.getMessage()));
                printExample();
            }
        } 
        else {
            printExample();
        }
    }

    /**
    * Converts temperature value from one scale to other scale
    *
    * @param    value   Value of temperature
    * @param    from    Temperature scale need to convert from
    * @return   double  Result of converting 
    */
    public static double convert(double value, Scale from) {
        switch (from) {
            case F:
                return (value - 32) * 5 / 9;
            default:
                return (value * 9 / 5) + 32;
        }
    }

    /**
    * Parses input string to Scale value
    *
    * @param    input   Temperature scale in string
    * @throws IllegalArgumentException If input is illegal argument
    * @return   Scale   Result of parsing 
    */
    public static Scale parse(String input) {
        try {
            return Scale.valueOf(input.toUpperCase().substring(0,1));
        } catch (IllegalArgumentException e) {
            System.out.println(Colors.RED.apply("ERROR: " + e.getMessage()));
            return Scale.ERROR;
        }
    }

    /**
    * Prints usage instructions
    */
    public static void printExample() {
        System.out.println(Colors.YELLOW.apply(
                    """
                    Input format:
                    Converter [value] [from scale]
                    Scales:
                    F   Fahrenheit
                    C   Celsius
                    Example use:
                    java -cp bin/ Converter 34 Celsius
                    bin$ java Converter 44 F
                    bin$ java Converter 21 celsius into fahrenheit
        """));
    }
}
