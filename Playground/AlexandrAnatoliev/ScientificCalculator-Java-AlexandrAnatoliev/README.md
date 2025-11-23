 # Scientific Calculator CLI 
A command-line utility for computing simple expressions 

## Project structure 

```
ScientificCalculator-Java-AlexandrAnatoliev
└── src
   ├── Calculator.java
   ├── Functions.java
   ├── MathFunction.java
   ├── Parser.java
   └── ScientificCalculator.java
```

## Compilation
To compile the source classes:
```
javac -d bin src/*.java
```
## Usage

* Navigate to `bin/` directory
```
cd bin/
```
* Run program
```
java ScientificCalculator <arguments>
```
* Run from root directory
```
java -cp bin ScientificCalculator <arguments>
```

#### Examples of use
```
java -cp bin/ ScientificCalculator "sin(3)"
SIN(3.0) = 0.1411200080598672
java -cp bin/ ScientificCalculator cos\(2\)
COS(2.0) = -0.4161468365471424
java -cp bin/ ScientificCalculator "log(5)" + "ln(1)"
LOG(5.0) + LN(1.0) = 0.6989700043360189
``` 
* Warning!!! To multiplication use 'x' operator instead '*'
```
java -cp bin/ ScientificCalculator 2 x 2
NUMBER(2.0) x NUMBER(2.0) = 4.0
```
