public class Calculator {
    public long number1;
    public long number2;

    public Calculator(long number1, long number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public long add() {
        return number1 + number2;
    }
    
    public long sub() {
        return number1 - number2;
    }
    
    public long mult() {
        return number1 * number2;
    }
    
    public double div() {
        if(number2 != 0) {
            return (double) number1 / (double) number2;
        }
        else {
            System.out.println("You cannot divide by zero");
            return 0;
        }
    }
}

    
