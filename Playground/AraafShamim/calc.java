import java.util.Scanner;
public class calc
{
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the operation to be performed");
        String op = sc.next();
System.out.println("enter the next number ");
int num2 = sc.nextInt();
int sum = 0 ;
if(op.equals("+"))
    {sum = num1 + num2;
        System.out.println(sum);
    }
    if (op.equals("-"))
    {
        System.out.println(sum=num1-num2);
    }
    if(op.equals("*"))
        System.out.println(sum=num1*num2);
    if (op.equals("/"))
        System.out.println(sum=num1/num2);
    sc.close();
}
}