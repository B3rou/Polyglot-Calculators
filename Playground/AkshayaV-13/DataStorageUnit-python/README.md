#  Data Storage Unit Converter

A simple **command-line Python program** that converts data values between common storage units using the **binary system (base 1024)**.

This project is beginner-friendly and useful for understanding:
- Data storage units
- Conditional logic
- User input handling
- Mathematical conversions in Python

---

##  Features

- Converts between the following units:
  - Bytes
  - Kilobytes (KB)
  - Megabytes (MB)
  - Gigabytes (GB)
  - Terabytes (TB)
  - Petabytes (PB)
- Uses **1024-based conversion** (binary standard)
- Handles:
  - Larger → smaller unit conversions
  - Smaller → larger unit conversions
  - Same-unit conversions
- Validates incorrect user inputs

>  **Bits are intentionally excluded** in this project as it is mentioned as optional in problem statement.

---

## Conversion Logic

- Units are ordered from smallest to largest.
- Each step between units represents a power of **1024**.
- Conversion rule:
  - Smaller unit → Bigger unit → **Divide**
  - Bigger unit → Smaller unit → **Multiply**
- Power difference is calculated using:
  ```python
  abs(convert_from - convert_to)
  ## Example Usage

Below is a sample interactive run of the program:

```text
Convert data from:
1. Bytes
2. Kilobytes
3. Megabytes
4. Gigabytes
5. Terabytes
6. Petabytes

Select unit converted FROM (1-6): 2
Select unit converted TO (1-6): 4
Enter data value: 2048

Converted data is: 2.0 Gigabytes