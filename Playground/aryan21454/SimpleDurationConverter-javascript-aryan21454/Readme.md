# DurationConverter-Javascript-aryan21454

A clean, object-oriented Duration Converter built in JavaScript for CLI usage.  
Supports multiple time units and provides a user-friendly, interactive conversion flow.

---

## 🔢 Features

- Fully **OOP** using a `DurationConverter` class  
- **Interactive CLI** (keeps running until user exits)  
- **Input trimming + validation** for clean conversions  
- Beautiful console UI with banners + bullet lists  
- Gracefully handles wrong formats & unsupported units  
- Easy to extend with more units  

---

## 📦 Folder Structure

DurationConverter-javascript-aryan21454/
│── index.js
│── src/
│ └── DurationConverter.js
│── README.md

---

## 🕒 Supported Units

- millisecond  
- second  
- minute  
- hour  
- day  
- week  
- month  
- year  

---

## 🚀 How to Run

1. Install Node.js (if not installed)
2. Run the program in your terminal:

```bash
node index.js
🧠 Usage Format
Enter your conversion like:
<value> <from-unit> <to-unit>
Example:
3600 second hour
Output:
➡️  Converted Value: 1
Another one:
2 hour minute
➡️  Converted Value: 120
🖥 Example Interaction
===============================
 🔢  Duration Converter (JS)
===============================
Supported Units:
 • millisecond
 • second
 • minute
 • hour
 • day
 • week
 • month
 • year
===============================

Enter value, from-unit, to-unit
(e.g., 3600 second hour): 7200 second hour

➡️  Converted Value: 2

Do you want to convert again? (yes/no): no

Thanks for using Duration Converter! Goodbye 👋
🔧 How It Works
All units are mapped internally to seconds

Conversion formula:
value_in_seconds = value * fromUnitRate
converted_value = value_in_seconds / toUnitRate

Input spacing is normalized using trimming + regex cleanup

CLI repeats until the user says “no”