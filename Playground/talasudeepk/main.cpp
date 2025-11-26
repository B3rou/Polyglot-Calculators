#include <iostream>
using namespace std;



int main() {
    double num1, num2;
    char op;

    
    cout << "Enter first number: ";
    cin >> num1;

    cout << "Enter second number: ";
    cin >> num2;

    cout << "Enter operator (+, -, *, /): ";
    cin >> op;

    double result;

    
    switch(op) {
        case '+':
            result = num1 + num2;
            cout << "Result: " << result << endl;
            break;

        case '-':
            result = num1 - num2;
            cout << "Result: " << result << endl;
            break;

        case '*':
            result = num1 * num2;
            cout << "Result: " << result << endl;
            break;

        case '/':
            if (num2 == 0) {
                cout << "Error: Division by zero not allowed!" << endl;
            } else {
                result = num1 / num2;
                cout << "Result: " << result << endl;
            }
            break;

        default:
            cout << "Invalid operator! Please use +, -, *, or /." << endl;
    }

    return 0;
}
