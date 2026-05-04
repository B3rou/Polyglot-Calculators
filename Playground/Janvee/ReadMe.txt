# 🧮 BMR Calculator (C++)

A simple **Basal Metabolic Rate (BMR) Calculator** built using C++.  
It calculates the number of calories your body needs per day at rest using the **Mifflin-St Jeor Equation**.

---

## 🔢 Features

- Calculates BMR for **Male and Female**
- Handles **invalid gender input**
- Clean output with **2 decimal precision**
- Beginner-friendly CLI program

---

## 📦 Folder Structure

```
Polyglot-Calculators/
└── Playground/
    └── Janvee/
        └── bmr_calculator.cpp
```

---

## 🧠 Formula Used

### For Men
```
BMR = 10 × weight + 6.25 × height − 5 × age + 5
```

### For Women
```
BMR = 10 × weight + 6.25 × height − 5 × age − 161
```

---

## 📥 Inputs Required

- Gender (M/F)
- Age (in years)
- Height (in cm)
- Weight (in kg)

---

## 📤 Output

Displays your **Basal Metabolic Rate (calories/day)**

---

## 🚀 How to Run

### Compile
```
g++ bmr_calculator.cpp -o bmr
```

### Run
```
./bmr
```

---

## 🖥 Example

```
=== BMR Calculator ===
Enter your gender (M/F): F
Enter your age (in years): 21
Enter your height (in cm): 165
Enter your weight (in kg): 55

Your Basal Metabolic Rate is: 1332.25 calories/day
```

---

## ⚠️ Notes

- Program exits if invalid gender is entered
- Ensure correct input format

---

## 👩‍💻 Author

**Janvee**