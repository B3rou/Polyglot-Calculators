#include <stdio.h>

int main(void)
{
    // Declare variables to store the two numbers and the operator
    float num1, num2;
    char operator;
    
    // Prompt the user to enter the first number
    printf("Enter first number: ");
    scanf("%f", &num1); // Read the first floating-point number from user input
    
    getchar(); // Clear the newline character from the input buffer after reading num1
    
    // Prompt the user to enter an operator (+, -, *, or /)
    printf("Enter an operator (+, -, *, /): ");
    scanf("%c", &operator); // Read the operator from user input
    
    // Prompt the user to enter the second number
    printf("Enter second number: ");
    scanf("%f", &num2); // Read the second floating-point number from user input

    // Switch statement to handle the operation based on the entered operator
    switch(operator)
    {
        case '+': // If the operator is '+', perform addition
            printf("%.2f + %.2f = %.2f\n", num1, num2, num1 + num2); // Print the result of addition
            break;
        
        case '-': // If the operator is '-', perform subtraction
            printf("%.2f - %.2f = %.2f\n", num1, num2, num1 - num2); // Print the result of subtraction
            break;
        
        case '*': // If the operator is '*', perform multiplication
            printf("%.2f * %.2f = %.2f\n", num1, num2, num1 * num2); // Print the result of multiplication
            break;
        
        case '/': // If the operator is '/', perform division
            // Check if the second number is not zero to avoid division by zero error
            if(num2 != 0)
            {
                printf("%.2f / %.2f = %.2f\n", num1, num2, num1 / num2); // Print the result of division
            }
            else
            {
                // If num2 is zero, print an error message
                printf("Error: Division by zero is not allowed.\n");
            }
            break;
        
        default: // If the operator is not one of the expected ones, print an error message
            printf("Invalid operator entered!\n");
            break;
    }
    
    return 0; // Return 0 to indicate successful execution
}
