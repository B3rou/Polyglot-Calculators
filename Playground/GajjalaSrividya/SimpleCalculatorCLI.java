package GajjalaSrividya;

import java.util.*;

public class SimpleCalculatorCLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("enter integer 1");
            int num1 = sc.nextInt();
            System.out.println("enter integer 2");
            int num2 = sc.nextInt();
            System.out.println("Enter operation (+, -, *, /, %): ");
            char ch = sc.next().charAt(0);
            int res = 0;
            switch (ch) {
                case '+':
                    res = num1 + num2;
                    break;
                case '-':
                    res = num1 - num2;
                    break;
                case '*':
                    res = num1 * num2;
                    break;
                case '/':
                    res = num1 / num2;
                    break;
                case '%':
                    res = num1 % num2;
                    break;
                default:
                    System.out.println("Invalid operation!");// operations other than (+, -, *, /, %)
                    return;
            }
            System.out.println("Result" + res);
            System.out.print("Do you want to perform another operation? (Y/N): ");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        sc.close();
    }
}
