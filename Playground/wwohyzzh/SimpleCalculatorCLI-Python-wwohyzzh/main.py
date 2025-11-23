# Function to perform calculation based on the user's chosen operation
def calc(num1, num2, op):
    if op == "1":           # Addition
        return num1 + num2
    elif op == "2":         # Subtraction
        return num1 - num2
    elif op == "3":         # Multiplication
        return num1 * num2
    elif op == "4":         # Division
        try:
            return num1 / num2
        except ZeroDivisionError:   # Handle division by zero
            print("Not divisible by 0")
    else:   # Invalid operation input
        print("Just enter 1, 2, 3 or 4")

# Function to get input from the user
def userinput():
    try:
        num1 = int(input("Enter number 1: "))
        num2 = int(input("Enter number 2: "))
        print("1: +\n2: -\n3: *\n4: /")
        op = input("choose an operation: ")
        return num1, num2, op   # Return all inputs
    except ValueError:  # Handle non-integer inputs
        print("Just enter number")
        return None, None, None

# Loop    
while True:
    num1, num2, op = userinput()

    # If any input is invalid, ask again
    if num1 is None or num2 is None or op is None:
        continue
    
    # Perform the calculation
    result = calc(num1, num2, op)
    
    # Only print result if it is valid
    if result is not None:
        print(f"Result: {result}")
