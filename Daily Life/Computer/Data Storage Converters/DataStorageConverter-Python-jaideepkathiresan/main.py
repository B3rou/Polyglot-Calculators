# Data Storage Converter
# This program converts between different units of digital data storage.
# Uses JEDEC standard: 1 KB = 1024 Bytes, etc.

def main():
    # Define available units and their conversion factors to bytes
    units = ['b', 'B', 'KB', 'MB', 'GB', 'TB', 'PB']
    bytes_per_unit = {
        'b': 1/8,      # 1 byte = 8 bits
        'B': 1,        # 1 byte
        'KB': 1024,    # 1 KB = 1024 bytes
        'MB': 1024**2, # 1 MB = 1024 KB
        'GB': 1024**3, # 1 GB = 1024 MB
        'TB': 1024**4, # 1 TB = 1024 GB
        'PB': 1024**5  # 1 PB = 1024 TB
    }

    print("Data Storage Converter")
    print("Available units: b (bits), B (bytes), KB, MB, GB, TB, PB")
    print()

    # Get from unit
    from_unit = input("Enter the unit to convert from (e.g., MB): ").strip().upper()
    if from_unit not in units:
        print("Invalid unit. Please choose from: b, B, KB, MB, GB, TB, PB")
        return

    # Get to unit
    to_unit = input("Enter the unit to convert to (e.g., GB): ").strip().upper()
    if to_unit not in units:
        print("Invalid unit. Please choose from: b, B, KB, MB, GB, TB, PB")
        return

    # Get value
    try:
        value = float(input("Enter the numerical value: "))
    except ValueError:
        print("Invalid number. Please enter a valid numerical value.")
        return

    # Convert to bytes
    bytes_value = value * bytes_per_unit[from_unit]

    # Convert from bytes to target unit
    result = bytes_value / bytes_per_unit[to_unit]

    # Display result with 2 decimal places
    print(f"{value} {from_unit} = {result:.2f} {to_unit}")

if __name__ == "__main__":
    main()
