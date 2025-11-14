## 🧮 Simple Calculator

This is a command-line calculator written in Python for evaluating basic mathematical expressions.

---

### Key Features

* **Supported Operations:** `+`, `-`, `*`, `/`.
* **Input:** Accepts integers (positive and negative, e.g., `-5`).
* **Precedence:** Follows a simplified Order of Operations (**Multiplication and Division** before **Addition and Subtraction**).
* **Validation:** Includes checks for invalid syntax and handles **division by zero** errors.
* **No Parentheses:** The program **wouldn't accept** inputs which includes **Parentheses**.
---

### How it Works

The calculator uses two main functions:

1.  **`expression_splitter`**: Converts the string expression (e.g., `"10+5*-2"`) into a list of numbers and operators (e.g., `[10, '+', 5, '*', -2]`).
2.  **`solver`**: Evaluates the list based on operator precedence and returns the final numerical result.

---

### Requirements

You need **Python 3.x** installed to run this script.

### How to Run

1.  Save the code as `calculator.py`.
2.  Open your terminal or command prompt.
3.  Execute the script:
    ```bash
    python calculator.py
    ```
4.  Enter your mathematical expression when prompted (e.g., `10 + 5 * -2`).

---

### Example

| Input Expression | Output |
| :--- | :--- |
| `10 + 5 * 2` | `20.0` |
| `-10/2 + 3` | `-2.0` |
| `10 / 0` | `Error: Division by zero` |
