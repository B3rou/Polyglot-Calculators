def to_grams(value, unit):
    """Convert any supported mass unit to grams."""
    unit = unit.lower()

    if unit in ["gram", "g"]:
        return value
    elif unit in ["kilogram", "kg"]:
        return value * 1000
    elif unit in ["pound", "lb", "lbs"]:
        return value * 453.592
    elif unit in ["ounce", "oz"]:
        return value * 28.3495
    else:
        return None


def from_grams(grams, unit):
    """Convert from grams to the target unit."""
    unit = unit.lower()

    if unit in ["gram", "g"]:
        return grams
    elif unit in ["kilogram", "kg"]:
        return grams / 1000
    elif unit in ["pound", "lb", "lbs"]:
        return grams / 453.592
    elif unit in ["ounce", "oz"]:
        return grams / 28.3495
    else:
        return None


def main():
    print("=== Mass Converter ===")
    
    # Input value
    try:
        value = float(input("Enter a positive mass value: "))
        if value < 0:
            print("Error: value must be positive.")
            return
    except ValueError:
        print("Error: please enter a valid number.")
        return

    # Input units
    from_unit = input("Enter source unit (gram, kilogram, pound, ounce): ")
    to_unit = input("Enter target unit (gram, kilogram, pound, ounce): ")

    grams = to_grams(value, from_unit)
    if grams is None:
        print("Invalid source unit!")
        return

    result = from_grams(grams, to_unit)
    if result is None:
        print("Invalid target unit!")
        return

    print("\n===============================")
    print(f"{value} {from_unit} = {result:.5f} {to_unit}")
    print("===============================")


if __name__ == "__main__":
    main()
