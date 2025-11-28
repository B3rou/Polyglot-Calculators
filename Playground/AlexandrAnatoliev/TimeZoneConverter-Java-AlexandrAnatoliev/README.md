# Time Zone Converter CLI 
Command-line Java utility that displays the current time, data, and time zone.

> **Author:** Alexandr Anatoliev
> **GitHub:** [AlexandrAnatoliev](https://github.com/AlexandrAnatoliev)

---

## Features 
* Supports cities from all available Java time zones
* Shows current time and date for specified city
* Enchanced console output with ANSI colors
* Provides clear error messages for invalid input

---

## Project structure 

```
TimeZoneConverter-Java-AlexandrAnatoliev/
├── README.md
└── src
   ├── City.java
   ├── Colors.java
   └── TZConverter.java
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
java TZConverter <arguments>
```
* Run from root directory
```
java -cp bin TZConverter <arguments>
```
* **Note**: Use underscopes for city names with spaces (e.g. New_York):w

---

## Examples of use
```
java -cp bin/ TZConverter Moscow
The time in Moscow is 22:03:54 on 28.11.2025 and its time zone is Europe/Moscow
```
```
bin$ java TZConverter Moscow
The time in Moscow is 22:06:56 on 28.11.2025 and its time zone is Europe/Moscow
```
```
java TZConverter
No arguments
Example:
java TZConverter Moscow
java -cp bin/ TZConverter Moscow
```

---

## Requirements
* Java 8 or higher
