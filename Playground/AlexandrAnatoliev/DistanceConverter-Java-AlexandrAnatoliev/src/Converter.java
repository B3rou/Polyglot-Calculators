/**
* Distances Converter 
* 
* Simple utility to convert between common distance units
*
* USAGE:
* Input format:
*   [value] [from units] [to units]
* Distances:
*   MM      millimeter
*   CM      centimeter
*   DM      decimeter
*   M       meter
*   KM      kilometer
*   IN      inch
*   FT      foot 
*   YD      yard
*   MI      mile
*   NMI     nautical mile
*   VRSH    vershok
*   PYA     pyad
*   LOK     lokot
*   ARS     arshin
*   SAZ     sazhen
*   VRST    versta
* Example use:
*   java -cp bin/ Converter 1 m mm
*
* @version  0.1.0
* @since    6.12.2025
* @author   AlexandrAnatoliev
*/
public class Converter {
    /** Main entry point for the Converter application
    *
    * @param args command line arguments 
    *   [value]         Value of user's distance     
    *   [from units]    Units need to convert from     
    *   [to units]      Units need to convert to     
    */
    public static void main(String[] args) {
        if (args.length > 2) {
            try {
                double value = Double.parseDouble(args[0]);
                Distances from = parse(args[1]);
                Distances to = parse(args[2]);

                if (value == 0 || from == Distances.ERROR || to == Distances.ERROR) {
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
    * @param    value   Value of user's distance
    * @param    from    Units need to convert from
    * @param    to      Units need to convert to
    * @return   double  Result of converting 
    */
    public static double convert(double value, Distances from, Distances to) {
        return value * from.inM / to.inM;
    }

    /**
    * Parses input string to Distances value
    */
    public static Distances parse(String input) {
        try {
            return Distances.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println(Colors.RED.apply("ERROR: " + e.getMessage()));
            return Distances.ERROR;
        }
    }

    /**
    * Prints usage instructions
    */
    public static void printExample() {
        System.out.println(
                Colors.YELLOW.apply(
                    """
                    Input format:
                    Converter [value] [from units] [to units]

                    value != 0

                    Distances:
                    MM      millimeter
                    CM      centimeter
                    DM      decimeter
                    M       meter
                    KM      kilometer
                    IN      inch
                    FT      foot 
                    YD      yard
                    MI      mile
                    NMI     nautical mile
                    VRSH    vershok
                    PYA     pyad
                    LOK     lokot
                    ARS     arshin
                    SAZ     sazhen
                    VRST    versta

                    Example use:
                    java -cp bin/ Converter 1 M MM
                    """
                    ));
    }
}
