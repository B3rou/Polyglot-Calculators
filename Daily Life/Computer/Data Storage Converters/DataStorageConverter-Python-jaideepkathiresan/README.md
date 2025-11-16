# Data Storage Converter (Python)

A command-line utility to convert between different units of digital data storage, written in **Python**.

---

## Features
- Converts between bits (b), bytes (B), kilobytes (KB), megabytes (MB), gigabytes (GB), terabytes (TB), and petabytes (PB)
- Uses JEDEC standard (1 KB = 1024 Bytes)
- Interactive input for from unit, to unit, and value
- Handles invalid inputs gracefully

---

## How It Works
The program:
1. Asks the user to input the source unit
2. Asks for the target unit
3. Asks for the numerical value to convert
4. Converts the value using the JEDEC standard and displays the result

---

## Example Usage
```
Data Storage Converter
Available units: b (bits), B (bytes), KB, MB, GB, TB, PB

Enter the unit to convert from (e.g., MB): MB
Enter the unit to convert to (e.g., GB): GB
Enter the numerical value: 500
500.0 MB = 0.49 GB
```

---

## Notes
- Bits (b) and petabytes (PB) are optional units included for completeness
- Input is case-insensitive (e.g., 'mb' or 'MB' works)
- Results are displayed with two decimal places

---

## Running the Program
```
python main.py
```

---

## License
This calculator is part of the Awesome-Calculators project and licensed under the MIT License.
