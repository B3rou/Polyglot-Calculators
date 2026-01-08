# Java CLI Calculator

A simple command-line calculator implemented in Java for the **Polyglot-Calculators Playground**.  
This project is intended as a **learning example** for beginners exploring Java, enums, exception handling, and CLI applications.

## Features

- Basic arithmetic operations: `+`, `-`, `*`, `/`, `%`
- Enum-based operator handling (`ADD`, `SUB`, `MUL`, `DIV`, `MOD`)
- Input validation via `InputValidator`
- Exception handling for division/modulo by zero
- Clear separation of concerns: domain, service, UI, and exception layers
- Interactive CLI interface

## 🚦 Getting Started

### Requirements
- **Java 17** or higher (required for switch expressions).

### Compilation
From the root of the project, compile all Java source files into the `out` directory:

```bash
javac -d out src/calculator/**/*.java
```

### Running the App
From the project root, use the following command to start the application:

```bash
java -cp out calculator.ui.CalculatorApp
```

## Example Usage
```
===============================
   Java CLI Calculator v1.0
===============================

Enter first number: 10
Enter second number: 3
Enter operator (+ - * / %): /

-------------------------------
Result: 3.3333333333333335
-------------------------------

(Type 'q' to quit or press any key to continue)
> 

Enter first number: 5
Enter second number: 0
Enter operator (+ - * / %): /
Error: Division by zero

(Type 'q' to quit or press any key to continue)
> q
Exiting calculator. Goodbye!
```

## Project Structure
```
Java-CLI-Calculator/
├── README.md
└── src/
     └── calculator/
          ├── domain/Operator.java
          ├── exception/IllegalOperatorException.java
          ├── service/CalculatorService.java
          └── ui/
               ├── CalculatorApp.java
               └── InputValidator.java
```

## Notes

- This project is **beginner-friendly** and designed for learning.
- All inputs are validated.
- Division and modulo by zero throw an `ArithmeticException`.
- Feedback and improvements are welcome!

Author
KHALED-077 – first-time contributor to Polyglot-Calculators
