# 🌍📏 Distance Converter CLI

A simple and user-friendly command-line tool that converts distances between units such as meters, kilometers, miles, inches, and more.

This tool works offline, is fast, and supports multiple common distance units.

---

## ✨ Features

- Convert between 8 different distance units
- Simple command-line interface
- Error handling for invalid units
- Accurate meter-based conversions


---

## 📦 Supported Units

m      → meters  
km     → kilometers  
cm     → centimeters  
mm     → millimeters  
mile   → miles  
yard   → yards  
foot   → feet  
inch   → inches  

---

## 🚀 Usage

Run the script using Python:
```bash
python main.py <value> <from_unit> <to_unit>
```

### Examples:
Convert 10 km to miles:
```bash
python main.py 10 km mile
```

Convert 150 cm to meters:
```bash
python main.py 150 cm m
```

## 🧠 How It Works

1. Every unit is converted to meters first.
2. Then it converts meters to the target unit.

This ensures accurate and consistent results.




