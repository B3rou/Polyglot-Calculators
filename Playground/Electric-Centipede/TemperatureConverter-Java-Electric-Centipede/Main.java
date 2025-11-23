// TemperatureConverter.java
// A simple console-based temperature converter
// 支持摄氏 ↔ 华氏互转

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("Please enter 1 or 2 to choose:");
        System.out.println("1.  Celsius to Fahrenheit");
        System.out.println("2.  Fahrenheit to Celsius");
        int choice = scanner.nextInt();

        double temperature;
        double result;

        if (choice == 1) {
            // From °C to °F
            System.out.print("Please enter the temperature (°C): ");
            temperature = scanner.nextDouble();
            result = (temperature * 9.0 / 5.0) + 32;
            System.out.printf("%.2f°C = %.2f°F%n", temperature, result);
        } else if (choice == 2) {
            // From °F to °C
            System.out.print("Please enter the temperature (°F): ");
            temperature = scanner.nextDouble();
            result = (temperature - 32) * 5.0 / 9.0;
            System.out.printf("%.2f°F = %.2f°C%n", temperature, result);
        } else {
            System.out.println(" Wrong！Please enter 1 or 2。");
        }

        scanner.close();
    }
}