import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMICalculator calculator = new BMICalculator();

        System.out.println("=== Calculadora de Índice de Masa Corporal (BMI) ===");
        
        try {
            System.out.print("Introduce tu peso en kilogramos (ej: 70.5): ");
            double weight = Double.parseDouble(scanner.nextLine());

            System.out.print("Introduce tu altura en metros (ej: 1.75): ");
            double height = Double.parseDouble(scanner.nextLine());

            String classification = calculator.calculateBMI(height, weight);
            
            double bmiValue = weight / Math.pow(height, 2);

            System.out.println("\n------------------------------------");
            System.out.printf("Tu valor de BMI es: %.2f\n", bmiValue);
            System.out.println("Clasificación: " + classification);
            System.out.println("------------------------------------");

        } catch (Exception e) {
            System.err.println("Error" + e);
        } finally {
            scanner.close();
        }
    }
}