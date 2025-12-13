# Java Calculator Projects

## Overview
This repository contains two beginner-friendly Java applications: a Simple Interest Calculator and a Temperature Converter. Both programs demonstrate core Java concepts through practical, command-line implementations.

---

## Project 1: Simple Interest Calculator

### Description
A Java program that calculates simple interest and total amount using the standard mathematical formula. This project is perfect for learning Java basics, financial calculations, or educational purposes.

### Features
- Takes user input for principal, rate, and time
- Calculates simple interest using the standard formula
- Calculates total amount (principal + interest)
- Displays results in a clean, formatted way

### Formula
The program uses these mathematical formulas:

**Simple Interest = (Principal × Rate × Time) / 100**  
**Total Amount = Principal + Simple Interest**

Where:
- **Principal**: Initial amount of money
- **Rate**: Annual interest rate (in percentage)
- **Time**: Time period (in years)

### Prerequisites
- Java Development Kit (JDK) installed
- Any text editor or IDE (VS Code, IntelliJ, Eclipse, etc.)

### How to Run

1. **Save the program** as `SimpleInterestCalculator.java`

2. **Compile the program:**
   ```bash
   javac SimpleInterestCalculator.java
   ```

3. **Run the compiled program:**
   ```bash
   java SimpleInterestCalculator
   ```

### Sample Output
```
=== SIMPLE INTEREST CALCULATOR ===
Enter principal amount: 1000
Enter annual interest rate (%): 5
Enter time period (in years): 3

=== CALCULATION RESULTS ===
Principal Amount: $1000.00
Annual Interest Rate: 5.00%
Time Period: 3.00 years
----------------------------
Simple Interest: $150.00
Total Amount: $1150.00
```

### Possible Enhancements
- Adding input validation to prevent incorrect inputs
- Allowing different time units (months, days) for more flexibility
- Adding compound interest calculation for extra functionality
- Creating a GUI version with a visual interface

---

## Project 2: Temperature Converter

### Description
An advanced command-line Java application designed to perform temperature conversions across the three most common scales: Celsius, Fahrenheit, and Kelvin. This version features a clear, user-friendly menu utilizing full unit names for ease of use.

### Features
- **Comprehensive Conversion:** Supports all six possible conversions: Celsius ↔ Fahrenheit, Celsius ↔ Kelvin, and Fahrenheit ↔ Kelvin
- **User-Friendly Menu:** The menu uses the full unit names ("Celsius," "Fahrenheit," "Kelvin") instead of abbreviations, enhancing clarity
- **Input Handling:** Utilizes the `java.util.Scanner` class for interactive input of choice and temperature value
- **High Precision Output:** Outputs the converted temperature formatted to two decimal places
- **Documentation:** All methods and the main logic are documented using Javadoc style comments

### Prerequisites
- **Java Development Kit (JDK):** Version 8 or newer is required

### How to Run

1. **Save the Java source code** into a file named `Temprature_converter.java`

2. **Compile the Java file:**
   ```bash
   javac TemperatureConverter.java
   ```

3. **Execute the compiled class file:**
   ```bash
   java TemperatureConverter
   ```

### Sample Output
```
--- Full Temperature Converter Menu ---
Select conversion type:
1: Celsius -> Fahrenheit    4: Fahrenheit -> Celsius
2: Celsius -> Kelvin        5: Fahrenheit -> Kelvin
3: Kelvin -> Celsius        6: Kelvin -> Fahrenheit
Enter choice (1-6): 4
Enter temperature value: 4

Result:
4.00 °F (Fahrenheit) is equal to -15.56 °C (Celsius)
```

---

## Project Structure

```
polygot-calculators/
│
├── Playground/
│   │
│   ├── daniel-oyoo/
│   │   ├── SimpleInterestCalculator.java     # Main Java source code
│   │   ├── SimpleInterestCalculator.class    # Compiled bytecode (generated)
│   │   ├── Temprature_converter.java         # Temperature converter source code
│   │   └── README.md                         # This documentation file
│   │
│   └── (other developer folders)/
│
└── (other project directories)/
```

---

## Learning Outcomes

These projects help beginners understand:
- Basic Java syntax and structure
- User input handling with Scanner class
- Mathematical operations in Java
- Conditional statements and switch cases
- String formatting and output presentation
- Program compilation and execution process

Both programs are designed to be easily extendable, allowing learners to add features and modifications as they advance their Java skills.

---

## Notes
- Ensure you have the correct file names when compiling
- The temperature converter uses degree symbols (°) in output, which may display differently depending on your terminal/console
- Both programs include comprehensive error handling and user-friendly prompts

---

## Contributing
Feel free to fork this repository and enhance the calculators with additional features or improvements.