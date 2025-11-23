# 🧮 Basic Calculator in Python

This contribution was an interactive command-line calculator developed in Python that allows performing fundamental mathematical operations in a simple and efficient manner.

---

## ✨ Main Features

* **Supported Operations:** Addition (`+`), Subtraction (`-`), Multiplication (`*`) and Division (`/`)
* **Number Handling:** Compatible with integers and decimals (positive and negative)
* **Input Validation:** Robust data verification and error handling
* **Division by Zero Prevention:** Specific control for invalid division operations
* **User-Friendly Interface:** Clear design and intuitive prompts for a smooth user experience
* **Continuous Execution:** Allows performing multiple operations without restarting the program

---

## 🛠️ Project Architecture

### Main Functions

#### `calculator()`
Central function that manages the complete application flow:
- Displays the user interface
- Captures and validates inputs
- Executes mathematical operations
- Handles errors and special cases

### Execution Flow
1. **Initialization:** Calculator interface presentation
2. **Data Capture:** Operator and numerical values request
3. **Processing:** Evaluation using `match-case` structure
4. **Validation:** Special conditions verification
5. **Result:** Formatted calculation presentation
6. **Continuous Cycle:** Return to step 1 for new calculation

---

## 📋 System Requirements

**Python 3.10 or higher** - Required for `match-case` functionality

### Verify Python Version
```bash
python --version
```

---

## 🚀 How to Run the Program

Python is an interpreted language, so you don't need to compile the code before running it. Follow these steps to execute the calculator:

### Basic Execution

1. **Open Command Prompt (CMD) or Terminal**
   - **Windows:** Press `Win + R`, type `cmd`, and press Enter
   - **macOS/Linux:** Open the Terminal application

2. **Navigate to the Project Directory**
```bash
   cd path/to/your/project
```
   Example:
```bash
   cd C:\Users\YourName\Documents\calculator
```

3. **Run the Python File**
```bash
   python main.py
```
   
   Or, depending on your system configuration:
```bash
   python3 main.py
```

### Alternative Execution Methods

#### Using Full Path
If you're not in the project directory:
```bash
python C:\Users\YourName\Documents\calculator\main.py
```

---

## 💡 Usage Example

Once you run the program, you'll see:
```
========== Calculator ========
operation to perfom (+, -, *, /): /
First number: 5
Second number: 7
The result of your operation: 0.71
```

---