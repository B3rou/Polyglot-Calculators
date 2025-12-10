# Temperature Converter 

> **Author:** Alexandr Anatoliev

> **GitHub:** [AlexandrAnatoliev](https://github.com/AlexandrAnatoliev)

---

## Features 
* Supports converting between temperature scales: 
  -   F   Fahrenheit
  -   C   Celsius
* Enchanced console output with ANSI colors
* Provides clear error messages for invalid input

---

## Project structure 

```
TemperatureConverter/
├── README.md
└── src
   ├── Colors.java
   ├── Converter.java
   └── Scale.java
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
* Input format:
  - [value]       Value of temperature      
  - [from scale]  Temperature scale      
``` 
[value] [from scale]
``` 

---

## Examples of use
```
java -cp bin/ Converter 34 Celsius
34.0 C = 93.2 F
```

```
bin$ java Converter 44 F
44.0 F = 6.666666666666667 C
```

```
bin$ java Converter 21 celsius into fahrenheit
21.0 C = 69.8 F
```

```
 > java -cp bin/ Converter invalid input

ERROR: For input string: "invalid"
            Input format:
            Converter [value] [from scale]
            Scales:
            F   Fahrenheit
            C   Celsius
            Example use:
            java -cp bin/ Converter 34 Celsius
            bin$ java Converter 44 F
            bin$ java Converter 21 celsius into fahrenheit
```

---

## Requirements
* Java 8 or higher
* Terminal/console that supports ANSI colors codes
