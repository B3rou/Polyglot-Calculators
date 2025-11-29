# Description
This is a CLI duration converter, written in C++.
It provides conversion to:
- Seconds, sec
- Minutes, min
- Hours, hour
- Days, day

# How to use:
## Windows:
- Compile the program using a C++ compiler. For example clang++:
	```PowerShell
	clang++ main.cpp Converter.cpp -o main.exe
	```
- Run the program with arguments to convert:
	```PowerShell
	./main.exe <value> <from unit> <to unit>
	```
	 
## Linux:
- Compile the program using a C++ compiler. For example clang++:
	```bash
	clang++ main.cpp Converter.cpp -o main
	```
- Run the program:
	```bash
	./main <value> <from unit> <to unit>
	```

## Example use:
```
./main 5 hour min
300
```