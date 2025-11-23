#include <iostream>

int main(){

    char op;
    double num1;
    double num2;
    double result;

    std::cout <<"******CALCULATOR******\n";
    
    std::cout << "Enter your desired operation from (+ - * /): " ;
    std::cin >> op;
    
    std::cout << "Enter #1: ";
    std::cin >> num1;

    std::cout << "Enter #2: ";
    std::cin >> num2;

    switch(op){
        case '+':
        result = num1 + num2;
        std::cout << "result: " << result <<'\n';
        break;

        case '-':
        result = num1 - num2;
        std::cout << "result:" << result <<'\n'; 
        break;

        case '*':
        result = num1 * num2;
        std::cout << "result: " << result <<'\n';
        break;

        case '/':
        if(num2 != 0){
        result = num1 / num2;
        std::cout << "Result: " << result << '\n';
        }
        else {
            std::cout << "Error: Cannot be divided by Zero" << '\n';
        }
        break;
      
        default:
        std::cout << "That was not a valid input" << '\n';
        break;


    }

    std::cout <<"**********************";
}
