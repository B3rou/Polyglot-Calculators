# Base Converter (Python) – by rajujonnada

This is a simple Python base converter created for the **Awesome-Calculators / Polyglot-Calculators** project.

The program converts numbers between the following bases:

- **bin** – Binary (base 2)
- **oct** – Octal (base 8)
- **dec** – Decimal (base 10)
- **hex** – Hexadecimal (base 16)

---

## 🔥 My Contribution

This project already had base converters, but I added a **new feature** to make this version unique.

### ✔ What I built
- A simple, readable base converter in Python  
- Interactive input: number → source base → target base  
- Input validation for incorrect digits  
- Clean output formatting  

### ✔ New Feature Added (Not in repo)
**`all` target mode**

If the user chooses `all` as the target base, the program converts the number into **all four bases** at once:

- Binary  
- Octal  
- Decimal  
- Hexadecimal  

This is a small but useful feature to improve usability.

---

## 🚀 How to Run

Inside this folder, run:

    python main.py


You will be asked three inputs:

    Enter number:
    From base (bin/oct/dec/hex):
    To base (bin/oct/dec/hex/all):

Type `q` anytime to exit.

---

## 📌 Example Usage

### 1️⃣ Convert between two bases

    Enter number: 1010
    From base: bin
    To base: dec

    Result: 1010 (bin) -> 10 (dec)


### 2️⃣ Use the **all** mode (my added feature)

    Enter number: 31
    From base: dec
    To base: all

    Converted to all bases:
      bin: 11111
      oct: 37
      dec: 31
      hex: 1F


### 3️⃣ Invalid input example

    Enter number: 102
    From base: bin

    Error: '102' is not a valid bin number.

### 🔚 How to Quit

You can exit the program anytime by typing:


You can type `q` when asked for:

- the number  
- the source base  
- the target base  

Example:

Enter number: q
Goodbye!
