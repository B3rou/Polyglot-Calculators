import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (meters): ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

        sc.close();
    }
}
