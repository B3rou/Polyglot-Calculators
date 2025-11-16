# BMI Calculator (C++)

A simple Body Mass Index (BMI) calculator written in C++ that calculates BMI based on weight and height, and provides a health category classification.

## Features

- Calculate BMI from weight (kg) and height (meters)
- Classify BMI into health categories: Underweight, Normal weight, Overweight, Obese
- Output BMI formatted to 2 decimal places

## Prerequisites

You need a C++ compiler installed on your machine:

- **Windows**: Visual Studio, MinGW, or MSVC
- **macOS**: Clang (included with Xcode) or GCC
- **Linux**: GCC or Clang

## Compilation Instructions

### Windows (using MSVC/Visual Studio)

```bash
cl.exe main.cpp /Fe:main.exe
```

Then run:
```bash
main.exe
```

### Windows (using MinGW)

```bash
g++ main.cpp -o main.exe
main.exe
```

### macOS and Linux (using GCC or Clang)

```bash
g++ main.cpp -o main
./main
```

Or with Clang:
```bash
clang++ main.cpp -o main
./main
```

## Running the Program

1. **Compile** the code using the appropriate command for your system (see above)
2. **Run** the compiled executable
3. **Enter** your weight in kilograms when prompted
4. **Enter** your height in meters when prompted
5. The program will display your BMI and health classification

### Example:

```
Enter weight in kg:
70
Enter height in metres:
1.75
BMI:22.86 (Normal weight)
```

## BMI Categories

- **Underweight**: BMI < 18.5
- **Normal weight**: 18.5 ≤ BMI < 25
- **Overweight**: 25 ≤ BMI < 30
- **Obese**: BMI ≥ 30

## Author

avijitj14
