# Simple Console Calculator in Java

A basic, robust command-line calculator written in **Java** that performs the four fundamental arithmetic operations. This project contributes to the Awesome-Calculators repository to fulfill the need for a simple Java implementation.

## ✨ Features

-   **Four Basic Operations:** Supports Addition (`+`), Subtraction (`-`), Multiplication (`*`), and Division (`/`).
    
-   **Decimal Support:** Uses the `double` data type for both input and calculation to handle precise, floating-point numbers.
    
-   **Zero-Division Checking:** Includes an explicit check to prevent division by zero errors.
    
-   **Clean and Commented Code:** The logic is straightforward and clearly documented in `Main.java`.
    

## ⚙️ How to Run

### Prerequisites

You must have the **Java Development Kit (JDK)** installed on your system to compile and execute the code.

### 1\. Compile the Code

Navigate to the directory containing `Main.java` and use the Java compiler (`javac`) to build the class file:

    javac Main.java
    

### 2\. Execute the Program

Run the compiled class file using the Java Virtual Machine (`java`):

    java Main
    

## 🚀 Example Usage

The program will first ask the user to enter two numbers on separate lines, and then prompt for the operation to perform.

    Please enter 2 numbers:
    15.5
    3.5
    Select the operation you want to perform (+, -, *, /): +
    The result of your operation: 19.00
    

**Example of Division with Zero Check:**
-   
    

    Please enter 2 numbers:
    100
    0
    Select the operation you want to perform (+, -, *, /): /
    Error: Division by zero is not allowed!
    

## 🤝 Contribution

This code was contributed by `Perouvianoss` as part of the Open Source community effort.