/*
=====================================================
Simple Calculator
Author: Abhishek
Language: C++
Repository: Polyglot-Calculators

Description:
A simple menu-driven calculator that performs:
1. Addition
2. Subtraction
3. Multiplication
4. Division

=====================================================
*/

#include <iostream>
using namespace std;

double add(double a, double b);
double subtract(double a, double b);
double multiply(double a, double b);
double divide(double a, double b);

int main() {
    int choice;
    double num1, num2;

    do {
        cout << "\n==== Simple Calculator ====\n";
        cout << "1. Add\n";
        cout << "2. Subtract\n";
        cout << "3. Multiply\n";
        cout << "4. Divide\n";
        cout << "5. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        if (choice >= 1 && choice <= 4) {
            cout << "Enter two numbers: ";
            cin >> num1 >> num2;

            switch (choice) {
                case 1:
                    cout << "Result: " << add(num1, num2) << endl;
                    break;
                case 2:
                    cout << "Result: " << subtract(num1, num2) << endl;
                    break;
                case 3:
                    cout << "Result: " << multiply(num1, num2) << endl;
                    break;
                case 4:
                    if (num2 == 0) {
                        cout << "Error: Division by zero not allowed.\n";
                    } else {
                        cout << "Result: " << divide(num1, num2) << endl;
                    }
                    break;
            }
        } else if (choice != 5) {
            cout << "Invalid choice. Try again.\n";
        }

    } while (choice != 5);

    cout << "Exiting calculator. Goodbye!\n";
    return 0;
}

double add(double a, double b) {
	return a + b; 
}
double subtract(double a, double b) { 
	return a - b; 
}
double multiply(double a, double b) { 
	return a * b; 
}
double divide(double a, double b) {
	return a / b; 
}

