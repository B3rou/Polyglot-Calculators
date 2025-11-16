
def expression_splitter(expression):
    expression = expression.replace(" ","")
    stack = []
    temp = ""
    possible_operations = "+-*/"

    if not expression:
        return "Invalid Expression"

    if expression[0] in "+*/":
        return "Invalid Expression"

    for i in range(len(expression)):
        ch = expression[i]
        if ch.isdigit():
            temp += ch
        elif ch in possible_operations:
            if temp == "" and ch == "-" and (i == 0 or expression[i-1] in possible_operations):
                temp = "-"
                continue
            if temp == "" and i != 0:
                return "Invalid Expression"
            try:
                stack.append(int(temp))
            except:
                return "Invalid Expression"
            stack.append(ch)
            temp = ""

        else:
            return "Invalid Expression"

    if temp.lstrip("-").isdigit():
        stack.append(int(temp))
        return stack
    else:
        return "Invalid Expression"


def solver(splitted):

    if isinstance(splitted, str):
        return splitted

    answer = [splitted[0]]
    current_operator = ""
    for i in range(1, len(splitted)):
        token = splitted[i]
        if type(token) != int:
            current_operator = token
        else:
            if current_operator == "+":
                answer.append(token)
            elif current_operator == "-":
                answer.append(-token)
            elif current_operator == "*":
                answer.append(answer.pop() * token)
            elif current_operator == "/":
                if token == 0:
                    return "Error: Division by zero"
                answer.append(answer.pop() / token)
    return sum(answer)

def main():
    print("-----Simple Calculator-----")
    print("Note: Accepted operators are ['+', '-', '*', '/']")
    expression = input("Enter the Expression: ")
    splitted = expression_splitter(expression)
    print(solver(splitted))

if __name__ == "__main__":
    main()
