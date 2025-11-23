⏱ Simple Duration Converter
============================

A lightweight, interactive command-line application written in **C++** for quickly converting values between common time units: **Second, Minute, Hour, and Day**.

 Features
----------

*   **Unit Conversion:** Seamlessly converts values between four key time units: Second, Minute, Hour, and Day.
    
*   **Input Validation:** Ensures robust operation by validating user input for positive numerical values and recognized unit names.
    
*   **Interactive CLI:** Provides an easy-to-use, loop-based interface to perform multiple conversions without restarting the application.
    
*   **Extensible Codebase:** Built with clarity, making it simple to read the logic and extend with new time units.
    

 Requirements
----------------

*   A C++ compiler that supports C++11 or later (e.g., g++, clang++, or MSVC).
    

 Getting Started
------------------

Follow these steps to compile and run the Duration Converter on your system.

### 1\. Compilation

Navigate to the directory containing DurationConverter.cpp and compile the source file using your compiler:

`   g++ DurationConverter.cpp -o DurationConverter   `


### 2\. Usage

Execute the compiled program from your terminal:

`   ./DurationConverter   `

The program will then guide you through the conversion process with prompts:

1.  Enter the **source unit** (e.g., Hour).
    
2.  Enter the **target unit** (e.g., Minute).
    
3.  Enter the **value** to be converted.
    
4.  The result is displayed.
    
5.  You can then choose to perform another conversion or exit.
    

📝 Notes
--------

*   **Case Sensitivity:** Unit inputs are currently case-sensitive (e.g., you must enter Minute, not minute).
    
*   **Extensibility:** To add new time units (e.g., Week), simply add the unit name and its equivalent value in seconds to the UnitToSeconds map within the C++ source code.