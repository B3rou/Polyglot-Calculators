public class Main {
    public static void main(String args[]) {
        long number1;
        String operator;
        long number2;

        if (args.length > 2) {
            number1 = Long.parseLong(args[0]);
            operator =args[1];
            number2 = Long.parseLong(args[2]);
            
            System.out.print(
                number1 + " " + operator + " " + number2 + " = ");

            Calculator calculator = new Calculator(number1, number2);
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

        }
        else {
            System.out.println(
                    "Run Main 2 + 2 to calculate 2 + 2 expression");
        }
    }
}
