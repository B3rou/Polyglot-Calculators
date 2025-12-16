# Data Storage Converter 
Simple utility to convert between different units of digital data storage.

> **Author:** Alexandr Anatoliev

> **GitHub:** [AlexandrAnatoliev](https://github.com/AlexandrAnatoliev)

---

## Features 
* Supports common data storage measures: 
  - Bits      -> b
  - Bytes     -> B
  - Kilobytes -> KB
  - Megabytes -> MB
  - Gigabytes -> GB
  - Terabytes -> TB
  - Petabytes -> PB
* Enhanced console output with ANSI colors
* Provides clear error messages for invalid input

---

## Project structure 

```
DataStorageConverter/
├── README.md
└── src
   ├── Colors.java
   ├── Converter.java
   └── DataUnit.java
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
  - [value]       The quantity to convert      
  - [from units]  Source data unit (b, B, KB, MB, GB, TB, PB)      
  - [to units]    Target data unit (b, B, KB, MB, GB, TB, PB)     

``` 
[value] [from units] [to units]
``` 

---

## Examples of use
```
java -cp bin/ Converter 1 MB KB
1 MB = 1024 KB
```

```
java -cp bin/ Converter invalid input arguments

ERROR: For input string: "invalid"

Input format:
Converter [value] [from units] [to units]

Units:
Bits        ->  b
Bytes       ->  B
Kilobytes   ->  KB
Megabytes   ->  MB
Gigabytes   ->  GB
Terabytes   ->  TB
Petabytes   ->  PB

Example use:
java -cp bin/ Converter 1 MB KB
```

---

## Requirements
* Java 8 or higher
* Terminal/console that supports ANSI colors codes
