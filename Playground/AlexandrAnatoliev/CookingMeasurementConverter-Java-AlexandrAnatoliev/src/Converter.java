/**
* Cooking Measurement Converter 
* 
* Simple utility to convert between common cooking measurements
*
* USAGE:
* Input format:
*   [value] [from units] [to units]
* Units:
*   Milliliters -> ml
*   Cups -> cup
*   Tablespoons -> tbsp
*   Teaspoons -> tsp
* Example use:
*   java -cp bin/ Converter 1 cup tbsp
*
* @version  0.1.0
* @since    2.12.2025
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
                int value = Integer.parseInt(args[0]);
                Measures from = parse(args[1]);
                Measures to = parse(args[2]);

                if (from == Measures.ERROR || to == Measures.ERROR) {
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
    * @param value  Value of user's product
    * @param from   Units need to convert from
    * @param to     Units need to convert to
    * @return int   Result of converting 
    */
    public static int convert(int value, Measures from, Measures to) {
        return value * from.inMl / to.inMl;
    }

    /**
    * Parses input string to Measures value
    *
    * @param input  Measure in string
    * @throws IllegalArgumentException If input is illegal argument
    * @return int   Result of parsing 
    */
    public static Measures parse(String input) {
        try {
            return Measures.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println(Colors.RED.apply("ERROR: " + e.getMessage()));
            return Measures.ERROR;
        }
    }

    /**
    * Prints usage instructions
    */
    public static void printExample() {
        System.out.println(Colors.YELLOW.apply("\nInput format:"));
        System.out.println("Converter [value] [from units] [to units]");
        System.out.println(Colors.YELLOW.apply("Units:"));
        System.out.println("Milliliters -> ml");
        System.out.println("Cups -> cup");
        System.out.println("Tablespoons -> tbsp");
        System.out.println("Teaspoons -> tsp");
        System.out.println(Colors.YELLOW.apply("Example use:"));
        System.out.println("java -cp bin/ Converter 1 cup tbsp");
    }
}
