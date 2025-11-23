/**
* Class for computing scientific mathematical operations 
* 
* Support basic scientific mathematical operations: 
*   Trigonometric functions: sin(x), cos(x), tan(x)
*   Logarithms: log(x) for base 10, ln(x) for natural log
*   Exponentials and roots: exp(x) and sqrt(x)
*   Factorials: fact(x)
*
* @version  0.1.0
* @since    23.11.2025
* @author   AlexandrAnatoliev
*/
public class MathFunction {
    public Functions function;
    public double argument;

    /**
    * Construct a MathFunction
    *
    * @param function Function name 
    * @param argument Function argument
    */
    public MathFunction(Functions function, double argument) {
        this.function = function;
        this.argument = argument;
    }

    /**
    * Performs computation of scientific mathematical function
    *
    * @return Value of mathematical function
    */
    public double getValue() {
        switch (function) {
            case SIN:
                return Math.sin(argument);
            case COS:
                return Math.cos(argument);
            case TAN:
                return Math.tan(argument);
            case COT:
                return 1/Math.tan(argument);
            case LOG:
                return Math.log10(argument);
            case LN:
                return Math.log(argument);
            case EXP:
                return Math.exp(argument);
            case SQRT:
                return Math.sqrt(argument);
            case FACT:
                return getFactorial(argument);
            default:
                return argument;
        }
    }

    /**
    * Performs computation of integer factorial
    *
    * @param num Number to compute factorial for 
    * @return Factorial value of the number
    * @throws IllegalArgumentException if number is less then zero
    */
    public double getFactorial(double num) {
        if (num < 0) {
            throw new IllegalArgumentException(
                    "Factorial is defined only for non-negative integers");
        }
        double result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

}
