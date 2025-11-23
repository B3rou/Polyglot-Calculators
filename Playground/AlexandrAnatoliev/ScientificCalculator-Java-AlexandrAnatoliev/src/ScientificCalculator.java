/**
* A command-line utility for computing simple expressions 
* 
* Support:
*   Trigonometric functions: sin(x), cos(x), tan(x)
*   Logarithms: log(x) for base 10, ln(x) for natural log
*   Exponentials and roots: exp(x) and sqrt(x)
*   Factorials: fact(x)
*
* @version  0.1.0
* @since    23.11.2025
* @author   AlexandrAnatoliev
*/
import java.util.Locale;

public class ScientificCalculator {
    /**
    * Main method that handles command-line arguments and 
    *   computing simple expressions
    *
    * @param args Command-line arguments in the format:
    *   [mathFunction1] [operator] [mathFunction2]
    *   Example: "sin(10)" + "cos(2)"
    *   [mathFunction]
    *   Example: "tan(1)"
    */
    public static void main(String args[]) {    

        Locale.setDefault(Locale.US);

        if(args.length == 1) {
            Parser parser = new Parser(args[0]);
            MathFunction mathFunction = new MathFunction(
                    parser.getFunction(),
                    parser.getArgument());
            System.out.println(mathFunction.function + "(" +
                    mathFunction.argument + ")" + 
                    " = " + mathFunction.getValue());
            
        } else if (args.length == 3) {
            Parser parser1 = new Parser(args[0]);
            String operator = args[1];
            Parser parser2 = new Parser(args[2]);
            
            MathFunction mathFunction1 = new MathFunction(
                    parser1.getFunction(),
                    parser1.getArgument());
            MathFunction mathFunction2 = new MathFunction(
                    parser2.getFunction(),
                    parser2.getArgument());

            Calculator calculator = new Calculator(
                    mathFunction1.getValue(),
                    mathFunction2.getValue());

            System.out.print(
                parser1.getFunction() + "("
                + parser1.getArgument() + ")"
                + " " + operator + " " + 
                parser2.getFunction() + "("
                + parser2.getArgument() + ")"
                + " = ");

            if(operator.equals("+")) {
                System.out.println(calculator.add());
            } else if(operator.equals("-")) {
                System.out.println(calculator.sub());
            } else if(operator.equals("x")) {
                System.out.println(calculator.mult());
            } else if(operator.equals("/")) {
                System.out.println(calculator.div());
            } else {
                System.out.println(
                        "Use '+', '-', 'x' or '/' operators");
            }
        } else {
            System.out.println("Usage examples:");
            System.out.println("java ScientificCalculator \"sin(3)\"");
            System.out.println("java ScientificCalculator cos\\(1\\)");
            System.out.println("java ScientificCalculator \"sqrt(9)\"");
            System.out.println("java ScientificCalculator 2 + 2");
            System.out.println("java ScientificCalculator \"tan(4)\" / 2");
            System.out.println("java ScientificCalculator \"log(5)\" x \"ln(6)\"");
        }
    }
}
