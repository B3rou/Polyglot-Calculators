import java.util.Scanner;
public class tempconverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.println("if want to convert in farhenhiet type '1'or if in celsius type'2'");
        int f = sc.nextInt();
        if(f==1)
        {
        System.out.println("enter the celsius temp");
        double cel = sc.nextDouble();
         sum = (cel*9/5)+32;
        System.out.println("your temp in farhenhiet is : "+ sum);
        }
        else if (f==2)
        {
            System.out.println("enter the farenhiet temp");
            double far = sc.nextDouble();
            sum = (far-32)*5/9;
            System.out.println("your temp in celsius :"+sum);
        }
        sc.close();
    }
    
}
