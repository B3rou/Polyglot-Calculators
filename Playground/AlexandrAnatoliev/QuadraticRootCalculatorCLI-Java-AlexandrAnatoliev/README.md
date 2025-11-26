# Quadratic Root Calculator CLI 
Command-line utility to calculate roots of quadratic equations written in Java.

> **Author:** Alexandr Anatoliev
> **GitHub:** [AlexandrAnatoliev](https://github.com/AlexandrAnatoliev)

---

## Features 
* Parses quadratic equations from string input
* Calculates real roots using the quadratic formula
* Handles both positive and negative coefficients
* Provides clear error messages for invalid input

---

## Project structure 

```
QuadraticRootCalculatorCLI-Java-AlexandrAnatoliev/
├── README.md
└── src/
   ├── Parser.java
   └── QRCalculator.java
```

---

## Compilation
To compile the source classes:
```
javac -d bin src/*.java
```

---

## Usage

* Navigate to `bin/` directory
```
cd bin/
```
* Run program
```
java QRCalculator <arguments>
```
* Run from root directory
```
java -cp bin QRCalculator <arguments>
```

---

## Input format
The program accepts quadratic equations int the format:
* "ax^2 + bx +c"
* "ax^2+bx+c" (spaces are optional)
* Coefficients can be positive or negative
* Coefficient 'a' must not be zero

---

## Examples of use
```
java -cp bin/ QRCalculator 
No arguments
java -cp bin/ QRCalculator "2x^2 + 3x - 4"
x1 = 0.8507810593582121
x2 = -2.350781059358212
java -cp bin/ QRCalculator "-3x^2-5x+6"
x1 = -2.474809633632684
x2 = 0.8081429669660173
java -cp bin/ QRCalculator "x^2 - 4x  + 4"
x = 2.0
java -cp bin/ QRCalculator "x^2 + x + 1"
No real roots exists
```

---

## Requirements
* Java 8 or higher
