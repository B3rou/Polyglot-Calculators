#  Quadratic Equation Roots Calculator (C)

This calculator computes the **real and complex roots** of a quadratic equation of the form:

```math
ax² + bx + c = 0
```


---

## Features

* Accepts coefficients `a`, `b`, and `c`
* Validates input (ensures numeric values)
* Prevents invalid equations (`a ≠ 0`)
* Calculates the **discriminant**
* Handles all cases:

  * Two real roots
  * One real root
  * Two complex roots
* Clear error and exception handling

---

##  File Structure

```
quadratic_calculator.c
README.md
```

---

##  How It Works

1. Reads coefficients `a`, `b`, and `c`
2. Computes the discriminant
   Δ = b² − 4ac
   (The program prints the discriminant before showing the roots.)
3. Determines root type:

   * **D > 0** → Two real roots
   * **D = 0** → One real root
   * **D < 0** → Two complex roots

---

##  Compile & Run

### Compile

```bash
gcc quadratic_calculator.c -o quadratic -lm
```

### Run

```bash
./quadratic
```

---

## Example Inputs & Outputs

### ✔ Two Real Roots

**Input**

```
a = 1
b = -5
c = 6
```

**Output**

```
Discriminant = 1.00
Two distinct real roots:
x1 = 3.000
x2 = 2.000
```

---

### ✔ One Real Root

**Input**

```
a = 1
b = -4
c = 4
```

**Output**

```
Discriminant = 0.00
One real root:
x = 2.000
```

---

### ✔ Complex Roots

**Input**

```
a = 1
b = 2
c = 5
```

**Output**

```
Discriminant = -16.00
Two complex roots:
x1 = -1.000 + 2.000i
x2 = -1.000 - 2.000i
```

---

##  Error Handling

* Rejects non-numeric input
* Prevents division by zero (`a = 0`)
* Displays meaningful error messages
* Safe program termination on failure

Notes:
- Inputs are prompted as: "Enter coefficient a:", "Enter coefficient b:", "Enter coefficient c:".
- Coefficient `a` must be non-zero; otherwise the program exits with an error.

---

## Future Improvements

* Unit tests
* Menu-driven calculator
* Multiple equation support
* Precision control
* Header/source file separation

---
## Author

Daku3011

## License

This project is part of the Polyglot Calculators contribution repository.
