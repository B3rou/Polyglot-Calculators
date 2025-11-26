/**
* Parses quadratic equations from string input
* 
* Expected format: "ax^2 + bx + c" where:
*   Coefficients  can be integers or decimals
*   '+' and '-' signs are supported
*   Spaces are optional but recommended for readability
*
* @version  0.1.0
* @since    25.11.2025
* @author   AlexandrAnatoliev
*/
public class Parser {
    String input;

    /**
    * Construct a Parser
    *
    * @param input quadratic equation in String 
    */
    public Parser(String input) {
        this.input = input;
    }

    /**
    * Validates if the input string represents a valid quadratic polynomial
    *
    * Checks for:
    *   Presence of 'x' variables
    *   Non-zero coefficient 'a'
    *   Basic polynomial structure
    *
    * @return true if input is a valid quadratic polynomial
    *         false otherwise          
    */
    public boolean isPolynomial() {
        if(getFirstXIndex() == -1) {
            printExample();
            return false;
        }
        if(getSecondXIndex() == -1) {
            printExample();
            return false;
        }
        if(getA() == 0) {
            printExample();
            return false;
        }
        return true;
    }

    /**
    * Extracts first 'x' index from input string
    *
    * @return int index 
    */
    private int getFirstXIndex() {
        return input.indexOf('x');
    }

    /**
    * Extracts second 'x' index from input string
    *
    * @return int index 
    */
    private int getSecondXIndex() {
        int start = getFirstXIndex() + 1;
        int finish = input.length();
        return start + input.substring(start, finish).indexOf('x');
    }

    /**
    * Extracts exponent operator '^' index from input string
    *
    * @return int index 
    */
    private int getExponentOperatorIndex() {
        return input.indexOf('^');
    }

    /**
    * Prints right input examples
    */
    private void printExample() {
        System.out.println("Examples of use:");
        System.out.println("java QRCalculator \"2x^2 + 3x - 4\"");
        System.out.println("java QRCalculator \"-3x^2-4x+6\"");
    }

    /**
    * Extracts numeric value from text containing a coefficient
    *
    * Handles cases like:
    *   "3" -> 3.0
    *   "-2" -> -2.0
    *   "x" -> 1.0
    *   "" -> 1.0
    *   "-x" -> -1.0
    *
    * @param text the string containing a coefficient
    * @return double value (default to 1.0 for missing explicit coefficients) 
    */
    private double getNumber(String text) {
        String number = text.replaceAll("[^0-9.-]","");
        if(number.isEmpty()) {
            return 1;
        }
        return Double.parseDouble(number);
    }

    /**
    * Extracts first coefficient 'a' from input string
    *
    * @return double number 
    */
    public double getA() {
        return getNumber(input.substring(0, getFirstXIndex()));
    }

    /**
    * Extracts second coefficient 'b' from input string
    *
    * @return double number 
    */
    public double getB() {
        return getNumber(input.substring(
                    getExponentOperatorIndex() + 2, 
                    getSecondXIndex()));
    }

    /**
    * Extracts third coefficient 'c' from input string
    *
    * @return double number 
    */
    public double getC() {
        return getNumber(input.substring(
                    getSecondXIndex() + 1,
                    input.length()));
    }
}
