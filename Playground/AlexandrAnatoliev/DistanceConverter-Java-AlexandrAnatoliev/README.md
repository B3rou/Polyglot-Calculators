# Distance Converter CLI 
Simple utility to convert between common distance units.

> **Author:** Alexandr Anatoliev

> **GitHub:** [AlexandrAnatoliev](https://github.com/AlexandrAnatoliev)

---

## Features 
* Converts between common distance units
* Supports distances:
  - MM    millimeter
  - CM    centimeter
  - DM    decimeter
  - M     meter
  - KM    kilometer
  - IN    inch
  - FT    foot 
  - YD    yard
  - MI    mile
  - NMI   nautical mile
  - VRSH  vershok
  - PYA   pyad
  - LOK   lokot
  - ARS   arshin
  - SAZ   sazhen
  - VRST  versta
* Enhanced console output with ANSI colors
* Provides clear error messages for invalid input

---

## Project structure 

```
DistanceConverter-Java-AlexandrAnatoliev/
├── README.md
└── src
   ├── Colors.java
   ├── Converter.java
   └── Distances.java
```

---

## Compilation
To compile the source classes:
```
javac -d bin src/*.java
```

---

## Usage

* Navigate to `bin/` directory
```
cd bin/
```
* Run program
```
java Converter <arguments>
```
* Run from root directory
```
java -cp bin Converter <arguments>
```

---

## Examples of use
```
java -cp bin/ Converter 2 mi km
2.0 mi = 3.218688 km
```
```
bin$  java Converter 3 ft m
3.0 ft = 0.9144000000000001 m
```
```
 > java -cp bin/ Converter 2 mi kilometer
ERROR: No enum constant Distances.KILOMETER
Input format:
Converter [value] [from units] [to units]

value != 0

Distances:
MM      millimeter
CM      centimeter
DM      decimeter
M       meter
KM      kilometer
IN      inch
FT      foot
YD      yard
MI      mile
NMI     nautical mile
VRSH    vershok
PYA     pyad
LOK     lokot
ARS     arshin
SAZ     sazhen
VRST    versta

Example use:
java -cp bin/ Converter 1 M MM
```

---

## Requirements
* Java 8 or higher
