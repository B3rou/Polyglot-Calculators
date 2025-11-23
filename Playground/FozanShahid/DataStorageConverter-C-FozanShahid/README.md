# 💾 Data Storage Converter (C)

A command-line data storage unit converter using the JEDEC (base‑1024) standard.

## 📦 Features
- Converts between: Bits (b), Bytes (B), KB, MB, GB, TB, PB
- Interactive menu, input validation, and `exit` support
- Small single‑file C implementation (main.c)
- Created to solve [Issue #118](https://github.com/B3rou/Awesome-Calculators/issues/118) in the Awesome-Calculators repository.

## 🔨 How to Build 
### macOS/Linux

- Compile with clang or gcc:
  ```
  clang -std=c11 -Wall -Wextra -O2 main.c -o dataconv
  # or
  gcc -std=c11 -Wall -Wextra -O2 main.c -o dataconv
  ```
### Windows (MSVC)
- Compile with cl:
  ```
  cl /W4 /O2 main.c /Fe:dataconv.exe
  ```
- Run:
  ```
  dataconv.exe

## 🚀 How to Run
```
./dataconv
```

## 💡 Example Usage
- Select the number for the FROM unit, then the number for the TO unit.
- Enter the numeric value to convert.
- Type `exit` at any prompt to quit.

## Example session
```
--- 💾 Data Storage Converter ---
Using JEDEC standard (1 KB = 1024 Bytes)
Type 'exit' at any time to quit.

💾 Data Storage Units (JEDEC Standard):
  1. Bits (b)
  2. Bytes (B)
  3. Kilobytes (KB)
  4. Megabytes (MB)
  5. Gigabytes (GB)
  6. Terabytes (TB)
  7. Petabytes (PB)

Convert FROM (select a number): 2
Convert TO (select a number): 3
Enter the value to convert: 2048

--- Result ---
2048 B = 2 KB
-------------------------
```

Notes
- Requires a C compiler. No external libraries.


---

## 🧑‍💻 Author
Contributed by [FozanShahid](https://github.com/FozanShahid)
Added as part of the **Awesome Calculators** collection.

---

## 📝 License

This project is open-source and available under the MIT License.