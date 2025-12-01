# Time Convertor #
This program will convert the current time given two time zones.

---
## How it works ##
The program will:
1. Ask for a source timezone
2. Ask for a target timezone
3. Return the time in the target timezone using the source timezone's current time
---
## Compilation ##
```bash 
javac TimeConvertor.java 
java TimeConvertor
```

---
## Example Usage ##
``` java
Enter a timezone:
Moscow
Enter the timezone you want to convert to:
Berlin
It is 22:24 November-30-2025 in Europe/Berlin
```

---
## Additional Notes ##
* Time zones should allow for any valid input of a city regardless of case sensitivity. 
* Uses IANA timezone database and converts time using UTC