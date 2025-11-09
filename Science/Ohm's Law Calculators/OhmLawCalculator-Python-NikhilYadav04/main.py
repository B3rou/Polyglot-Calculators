def calculate_voltage(current, resistance):
    """Calculate voltage using V = I * R"""
    voltage = current * resistance
    print(f"As per formula V = I * R = {voltage:.2f} V")


def calculate_current(voltage, resistance):
    """Calculate current using I = V / R"""
    if resistance == 0:
        print("Error: Resistance cannot be zero.")
        return
    current = voltage / resistance
    print(f"As per formula I = V / R = {current:.2f} A")


def calculate_resistance(voltage, current):
    """Calculate resistance using R = V / I"""
    if current == 0:
        print("Error: Current cannot be zero.")
        return
    resistance = voltage / current
    print(f"As per formula R = V / I = {resistance:.2f} Ω")


def main():
    print("Choose what you want to calculate:")
    print("V - Voltage\nI - Current\nR - Resistance")

    choice = input("Enter your choice (V/I/R): ").strip().lower()

    operations = {
        "v": ("Current (I)", "Resistance (R)", calculate_voltage),
        "i": ("Voltage (V)", "Resistance (R)", calculate_current),
        "r": ("Voltage (V)", "Current (I)", calculate_resistance),
    }

    if choice not in operations:
        print("Invalid choice! Please choose V, I, or R.")
        return

    first_label, second_label, func = operations[choice]

    try:
        first = float(input(f"Enter {first_label}: "))
        second = float(input(f"Enter {second_label}: "))
        func(first, second)
    except ValueError:
        print("Invalid numeric input. Please enter valid numbers.")


if __name__ == "__main__":
    main()
