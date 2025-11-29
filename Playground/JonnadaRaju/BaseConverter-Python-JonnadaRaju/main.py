#!/usr/bin/env python3
"""
Simple Base Converter (Python) - rajujonnada

Features:
- Convert between: bin, oct, dec, hex
- Validates input for source base
- Extra feature: target base 'all' prints all bases

Example (interactive):
    number: 1010
    from base: bin
    to base: dec
    result: 10

    to base: all
    shows: bin / oct / dec / hex
"""

BASES = {
    "bin": 2,
    "oct": 8,
    "dec": 10,
    "hex": 16,
}


def parse_int(num_str: str, base_name: str) -> int:
    """Parse num_str in the given base, with simple validation."""
    base_name = base_name.lower()
    if base_name not in BASES:
        raise ValueError(f"Unknown base: {base_name} (use bin, oct, dec, hex).")

    base = BASES[base_name]

    try:
        # int() will raise ValueError if digits don't match the base
        value = int(num_str, base)
    except ValueError:
        raise ValueError(f"'{num_str}' is not a valid {base_name} number.")

    return value


def format_int(value: int, base_name: str) -> str:
    """Format an integer value in the given base."""
    base_name = base_name.lower()

    if base_name == "dec":
        return str(value)
    elif base_name == "bin":
        return format(value, "b")
    elif base_name == "oct":
        return format(value, "o")
    elif base_name == "hex":
        return format(value, "X")  # uppercase A–F
    else:
        raise ValueError(f"Unknown base: {base_name}")


def convert_to_all(value: int) -> None:
    """Print value in all supported bases."""
    print("\nConverted to all bases:")
    for name in ("bin", "oct", "dec", "hex"):
        print(f"  {name:>3}: {format_int(value, name)}")
    print()


def main():
    print("Base Converter (bin / oct / dec / hex)")
    print("Extra: use target base 'all' to see every base.")
    print("Type 'q' at any prompt to quit.\n")

    while True:
        num_str = input("Enter number: ").strip()
        if num_str.lower() == "q":
            break

        src_base = input("From base (bin/oct/dec/hex): ").strip().lower()
        if src_base == "q":
            break

        tgt_base = input("To base (bin/oct/dec/hex/all): ").strip().lower()
        if tgt_base == "q":
            break

        try:
            value = parse_int(num_str, src_base)

            if tgt_base == "all":
                convert_to_all(value)
            else:
                result = format_int(value, tgt_base)
                print(f"\nResult: {num_str} ({src_base}) -> {result} ({tgt_base})\n")

        except ValueError as e:
            print(f"\nError: {e}\n")

    print("Goodbye!")


if __name__ == "__main__":
    main()
