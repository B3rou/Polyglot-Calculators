## Scientific Calculator (Java)

### Overview
This project is a **console-based scientific calculator** written in **Java**.  
It was implemented as a task within the **Awesome-Calculators** repository, which contains multiple calculator projects maintained by **B3rou**.

The goal of this task was to design and implement a **scientific calculator module**:
- mathematical correctness,
- clean and readable code,
- input validation,
- exception handling,
- and unit testing.

This implementation is intended to be **educational**, demonstrating good programming practices and clear separation of responsibilities.

---

## Features

### Supported Operations

#### Trigonometric Functions
- `sin(x)`
- `cos(x)`
- `tan(x)`  
  _(displays a warning when the input value is close to an asymptote)_

#### Logarithms
- `log10(x)` – base 10 logarithm
- `ln(x)` – natural logarithm

#### Exponentials and Roots
- `exp(x)` – calculates \( e^x \)
- `sqrt(x)` – square root (validated for non-negative values)

#### Factorial
- `x!` – defined only for **non-negative integers**

---

## Input Validation & Error Handling
- Invalid numeric input is rejected and re-prompted.
- Mathematical domain errors (e.g. `log(x)` for `x ≤ 0`, factorial of negative numbers) result in clear exceptions.
- Tangent calculation warns the user when the input value is close to an asymptote (`π/2 + kπ`).

---

## Testing
The project includes **unit tests written with JUnit 5**, covering:
- correct results for valid inputs,
- edge cases (e.g. `0`, `1`),
- exception handling for invalid arguments.

Floating-point comparisons use an appropriate **delta** to handle precision errors.

---

## 🛠️ Technologies Used
- Java
- JUnit 5
- IntelliJ IDEA

---

## How to Run
1. Compile and run the `Main` class.
2. Choose a mathematical operation from the menu.
3. Enter the required numeric value.
4. View the result or validation message in the console.
