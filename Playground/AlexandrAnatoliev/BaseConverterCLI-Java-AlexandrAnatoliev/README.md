# Base Converter CLI
A command-line utility for converting numbers between different 
numerals systems.

## Project structure 
```
.
├── bin
│  ├── Bases.class
│  ├── Convert$1.class
│  └── Convert.class
├── README.md
└── src
   ├── Bases.java
   └── Convert.java
```
## Compilation
To compile the source classes:
```
$ javac -d bin src/*.java
```

## Usage

#### Basic syntax
```
java Convert <number> <sourceBase> <targetBase>
```

#### Parameters
* `<number>` - The number to convert (as a string)
* `<sourceBase>` - The base of the input number (`bin`, `oct`, `dec`, `hex`)
* `<targetBase>` - The base to convert to (`bin`, `oct`, `dec`, `hex`)

#### Running program

* Navigate to `bin/` directory
```
cd bin/
```

* Run program
```
java Convert <arguments>
```

* Run from root directory
```
java -cp bin Convert <arguments>
```

#### Examples of use
```
bin$ java Convert 1010 bin dec
1010 BIN -> 10 DEC
bin$ java Convert 15 dec hex
15 DEC -> f HEX
bin$ java Convert 77 oct bin
77 OCT -> 111111 BIN
bin$ java Convert 1F hex dec
1F HEX -> 31 DEC
```
