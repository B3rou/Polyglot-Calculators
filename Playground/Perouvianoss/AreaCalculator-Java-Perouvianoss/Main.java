import java.util.Scanner;

/**
 * AreaCalculator - A basic calculator that finds the area of simple geometric shapes.
 * Supports Circle, Square, Rectangle, and Triangle.
 * 
 * This is a Java implementation for the Awesome-Calculators repository.
 */
public class Main {
    
    /**
     * Main method that runs the area calculator program.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Area Calculator ===");
        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                calculateCircleArea(scanner);
                break;
            case 2:
                calculateSquareArea(scanner);
                break;
            case 3:
                calculateRectangleArea(scanner);
                break;
            case 4:
                calculateTriangleArea(scanner);
                break;
            default:
                System.out.println("Invalid choice! Please select 1-4.");
                break;
        }
        
        scanner.close();
    }
    
    /**
     * Calculates and displays the area of a circle.
     * 
     * @param scanner Scanner object for user input
     */
    private static void calculateCircleArea(Scanner scanner) {
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        if (radius < 0) {
            System.out.println("Error: Radius cannot be negative!");
            return;
        }
        
        double area = Math.PI * radius * radius;
        System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, area);
    }
    
    /**
     * Calculates and displays the area of a square.
     * 
     * @param scanner Scanner object for user input
     */
    private static void calculateSquareArea(Scanner scanner) {
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        
        if (side < 0) {
            System.out.println("Error: Side length cannot be negative!");
            return;
        }
        
        double area = side * side;
        System.out.printf("The area of the square with side %.2f is: %.2f%n", side, area);
    }
    
    /**
     * Calculates and displays the area of a rectangle.
     * 
     * @param scanner Scanner object for user input
     */
    private static void calculateRectangleArea(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        if (length < 0 || width < 0) {
            System.out.println("Error: Length and width cannot be negative!");
            return;
        }
        
        double area = length * width;
        System.out.printf("The area of the rectangle (%.2f x %.2f) is: %.2f%n", length, width, area);
    }
    
    /**
     * Calculates and displays the area of a triangle.
     * 
     * @param scanner Scanner object for user input
     */
    private static void calculateTriangleArea(Scanner scanner) {
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        
        if (base < 0 || height < 0) {
            System.out.println("Error: Base and height cannot be negative!");
            return;
        }
        
        double area = 0.5 * base * height;
        System.out.printf("The area of the triangle (base: %.2f, height: %.2f) is: %.2f%n", base, height, area);
    }
}