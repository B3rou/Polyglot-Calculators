# Area Calculator in Java

This project is a basic command-line application written in **Java** that calculates the area of common geometric shapes. It serves as a contribution to the Awesome-Calculators repository to fulfill the request for a simple Area Calculator.

The code is contained within the `Main.java` file and is intended to be placed in a directory named `AreaCalculator-Java`.

## ✨ Features

-   **Supported Shapes:** Calculates the area for **Circle**, **Square**, **Rectangle**, and **Triangle**.
    
-   **Decimal Support:** Uses the `double` data type for accurate input and output.
    
-   **Input Validation:** Checks for and prevents calculation with **negative dimensions** (radius, side, length, width, base, or height).
    
-   **π Constant:** Utilizes Java's built-in `Math.PI` constant for precise circle area calculations.
    
-   **Clean and Modular Code:** Logic is separated into dedicated methods for each shape (`calculateCircleArea`, `calculateSquareArea`, etc.) for readability.
    

## ⚙️ How to Run

### Prerequisites

You must have the **Java Development Kit (JDK)** installed on your system to compile and execute the code.

### 1\. Compile the Code

Navigate to the directory containing `Main.java` and use the Java compiler (`javac`) to build the class file:

    javac Main.java
    

### 2\. Execute the Program

Run the compiled class file using the Java Virtual Machine (`java`):

    java Main
    

## 🚀 Example Usage (Circle)

The program presents a menu and then prompts for the necessary inputs based on the user's choice.

    === Area Calculator ===
    Choose a shape to calculate area:
    1. Circle
    2. Square
    3. Rectangle
    4. Triangle
    Enter your choice (1-4): 1
    Enter the radius of the circle: 5.5
    The area of the circle with radius 5.50 is: 95.03
    

## 🚀 Example Usage (Triangle)

    === Area Calculator ===
    Choose a shape to calculate area:
    1. Circle
    2. Square
    3. Rectangle
    4. Triangle
    Enter your choice (1-4): 4
    Enter the base of the triangle: 10
    Enter the height of the triangle: 4
    The area of the triangle (base: 10.00, height: 4.00) is: 20.00
    

## 🤝 Contribution

This code was contributed by `Perouvianoss` as part of the Open Source community effort.