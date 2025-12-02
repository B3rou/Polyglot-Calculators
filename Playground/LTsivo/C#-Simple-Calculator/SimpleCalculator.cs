using System;

/**
 * SimpleCalculator written in C# that allows users to perform addition,
 * subtraction, multiplication and division on two numbers.
 * 
 * The process repeats until the user decides to exit.
 * 
 * This was created for the Polyglot-Calculators repository.
 */

class SimpleCalculator
{
    /**
     * The main method that implements the calculator
     * 
     */
    static void Main()
    {
        char op = 'a';
        double num1 = 0, num2 = 0, result = 0;
        bool exit, error;
        Console.WriteLine("=== Simple C# Calculator ===\n");


        exit = false;
        while (!exit) // While loop that allows the user to do multiple calculations before exiting
        {
            error = false;
            try // Try-catch block to handle invalid input
            {
                // Ask the user for the first number
                Console.Write("Enter first number (can also do 2.3  5.6 etc): ");
                num1 = Convert.ToDouble(Console.ReadLine());

                // Ask the user for the operator
                Console.Write("Enter operator (+, -, *, /): ");
                op = Console.ReadKey().KeyChar;
                Console.WriteLine();

                // Ask the user for the second number
                Console.Write("Enter second number: ");
                num2 = Convert.ToDouble(Console.ReadLine());
            }
            catch
            {
                // Error message for invalid input
                Console.WriteLine("Error: Invalid input. Please enter numeric values for numbers.");
                error = true;
                op = '+'; //The operand is set to + to avoid conflict with switch case below
            }


            // Performs the desired operation
            switch (op)
            {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0)
                    {
                        Console.WriteLine("Error: Cannot divide by zero.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    Console.WriteLine("Error: Invalid operator.");
                    return;
            }


            // Displays the result if there were no previous errors
            if (!error)
            {
                Console.WriteLine($"\nResult: {num1} {op} {num2} = {result:F3}");
            }


            // Ask the user if they want to perform another calculation
            Console.Write("\nDo you want to perform another calculation? (y/n): ");
            char choice = Console.ReadKey().KeyChar;
            if (choice != 'y' && choice != 'Y')
            {
                exit = true;
            }
            Console.WriteLine();
        }
    }
}
