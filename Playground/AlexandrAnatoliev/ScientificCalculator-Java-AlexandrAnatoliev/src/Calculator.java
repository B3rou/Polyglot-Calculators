/**
* Class for computing simple mathematical expressions 
* 
* Support basic arifmetic operations: 
*   addition, substraction, multiplication, and division
*
* @version  0.1.0
* @since    23.11.2025
* @author   AlexandrAnatoliev
*/
public class Calculator {
    public double number1;
    public double number2;

    /**
    * Construct a Calculator with two operands
    *
    * @param number1 First operand 
    * @param number2 Second operand
    */
    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    /**
    * Perfoms addition of two numbers
    *
    * @return Sum of number1 and number2
    */
    public double add() {
        return number1 + number2;
    }
    
    /**
    * Perfoms substraction of two numbers
    *
    * @return Difference between number1 and number2
    */
    public double sub() {
        return number1 - number2;
    }
    
    /**
    * Perfoms multiplication of two numbers
    *
    * @return Product of number1 and number2
    */
    public double mult() {
        return number1 * number2;
    }
    
    /**
    * Perfoms division of two numbers
    *
    * @return Quotient of number1 divided by number2
    */
    public double div() {
        if(number2 != 0) {
            return number1 / number2;
        }
        else {
            System.out.println("You cannot divide by zero");
            return 0;
        }
    }
}
