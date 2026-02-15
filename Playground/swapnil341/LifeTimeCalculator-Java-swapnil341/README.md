# Life Time Calculator (Java)

A simple Java console application that calculates how long a person has lived in years, months, days, hours, minutes, and seconds using the date of birth.

## Features
- Accepts flexible date input (YYYY-M-D, YYYY MM DD, YYYY/MM/DD)
- Handles single-digit month and day values
- Prevents future date input
- Clean and formatted console output
- Uses Java Time API

## Technologies Used
- Java (JDK 8+)
- java.time package

## Project Structure
```
life-time-calculator/
├── LifeTimeCalculator.java 
└── README.md
```

## How to Run
1. Compile the program  
   ```
   javac LifeTimeCalculator.java
   ```

2. Run the program  
   ```
   java LifeTimeCalculator
   ```

## Sample Input
Enter your Date of Birth (YYYY-MM-DD): 2000-1-1

## Sample Output
```
========================================
        LIFE TIME CALCULATOR
========================================

----------------------------------------
              YOUR AGE
----------------------------------------
Years   : 26
Months  : 1
Days    : 14

----------------------------------------
          TOTAL TIME LIVED
----------------------------------------
Days    : 9,542
Hours   : 229,008
Minutes : 13,740,480

========================================
   "Time is the most valuable asset"
========================================

```

## Input Rules
- Date of birth must not be in the future
- Only year-month-day format is accepted
- Invalid input is handled with retry prompts

## Future Improvements
- Countdown to next birthday
- Estimated heartbeats and breaths
- GUI using Java Swing

## Author
swapnil341

## License
Free to use for learning and educational purposes.
