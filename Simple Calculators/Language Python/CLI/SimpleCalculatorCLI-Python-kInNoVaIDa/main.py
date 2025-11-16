# Example Usage:

# ========== Calculator ========
# operation to perfom (+, -, *, /): /
# First number: 5
# Second number: 7
# The result of your operation: 0.71

def calculator():
    
    while True: # To perform each operation as a loop one by one
        print("\n========== Calculator ========\n") 
        operator = input("operation to perfom (+, -, *, /): ") # Main operation that will be executed on the calculator
        first = float(input("First number: ")) # First number that goes at the left  side or as numerator in division
        second = float(input("Second number: ")) # Second number that goes at right side or as demoninator

        match operator: # match operation choosen 
            case "+":
                print("The result of your operation: {:.2f}".format(first + second))
            case "-":
                print("The result of your operation: {:.2f}".format(first - second))
            case "*":
                print("The result of your operation: {:.2f}".format(first * second))
            case "/":
                if second != 0:
                    print("The result of your operation: {:.2f}".format(first / second))
                else:
                    print("Can't Divide by 0!")


if __name__ == "__main__":
    calculator()
