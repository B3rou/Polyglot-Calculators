/**
* Class for parsing mathematical functions from string 
* 
* @version  0.1.0
* @since    23.11.2025
* @author   AlexandrAnatoliev
*/
public class Parser {
    public String input;

    /**
    * Construct a Parser
    *
    * @param input Mathematical function in String 
    */
    public Parser(String input) {
        this.input = input;
    }

    /**
    * Extracts mathematical function name from input string
    *
    * @return Mathematical function name
    */
    public Functions getFunction() {
        int openBracket = input.indexOf('(');
        if(openBracket == -1) {
            return Functions.NUMBER;
        }
        String functionName = input.substring(0, openBracket).toUpperCase(); 
        return Functions.valueOf(functionName); 
    }

    /**
    * Extracts mathematical function argument from input string
    *
    * @return Mathematical function argument
    */
    public double getArgument() {
        int openBracket = input.indexOf('(');
        int closeBracket = input.indexOf(')');
        if(openBracket == -1 || closeBracket == -1) {
            return Double.parseDouble(input);
        }
        String functionArgument = input.substring(openBracket + 1, closeBracket);
        return Double.parseDouble(functionArgument);
    }
}
