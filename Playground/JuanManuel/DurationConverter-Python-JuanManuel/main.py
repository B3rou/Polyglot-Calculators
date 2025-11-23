def convert_duration(value, source_unit, target_unit):
    units = {
        "second": 1,
        "minute": 60,
        "hour": 3600,
        "day": 86400
    }

    if value < 0:
        raise ValueError("Value must be positive")

    if source_unit not in units or target_unit not in units:
        raise ValueError("Invalid time unit")

    value_in_seconds = value * units[source_unit]
    return value_in_seconds / units[target_unit]


def main():
    print("\n--- Duration Converter (Python) ---\n")
    
    value = float(input("Enter a value: "))
    source = input("Source unit (second/minute/hour/day): ").lower()
    target = input("Target unit (second/minute/hour/day): ").lower()

    try:
        result = convert_duration(value, source, target)
        print(f"\n{value} {source} -> {target} = {result}\n")
    except Exception as e:
        print("\nError:", e)


if __name__ == "__main__":
    main()
