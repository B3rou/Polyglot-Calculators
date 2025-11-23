# ---------------------------------------------
# Temperature Converter - Python Version
# Made by SimpleChap
# ---------------------------------------------
# Converts temperatures between Celsius & Fahrenheit
# ---------------------------------------------

def celsius_to_fahrenheit(c: float) -> float:
    """Convert Celsius to Fahrenheit."""
    return (c * 9 / 5) + 32


def fahrenheit_to_celsius(f: float) -> float:
    """Convert Fahrenheit to Celsius."""
    return (f - 32) * 5 / 9


def main() -> None:
    print("Temperature Converter")
    print("--------------------------")
    print("1. Celsius → Fahrenheit")
    print("2. Fahrenheit → Celsius")

    choice = input("Enter 1 or 2: ").strip()

    if choice not in ("1", "2"):
        print("Invalid option! Restart the program.")
        return

    try:
        temp = float(input("Enter the temperature value: "))
    except ValueError:
        print("Invalid temperature! Use numbers only.")
        return

    if choice == "1":
        result = celsius_to_fahrenheit(temp)
        print(f"\n{temp:.2f}°C = {result:.2f}°F")
    else:
        result = fahrenheit_to_celsius(temp)
        print(f"\n{temp:.2f}°F = {result:.2f}°C")

    print("\nThanks for using the converter!")


if __name__ == "__main__":
    main()
