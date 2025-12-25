import java.util.Scanner;

public class TemperatureConverter{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose one Option 1)Celsius to Fahrenheit 2)Fahrenheit to Celsius");
        int choice = input.nextInt();
        System.out.println("Enter the temperature to convert");
        double temp = input.nextDouble();
        if(choice == 1)
        {
           double F = temp*(9.0/5) + 32;
           System.out.println("temperature in Fahrenheit is : " + F);
        }
        else if(choice == 2)
        {
            double C = (temp - 32)*(5.0/9);
            System.out.println("temperature in Celsius is : " + C);
        }
        else{
            System.out.println("invalid choice");
        }
    }
}