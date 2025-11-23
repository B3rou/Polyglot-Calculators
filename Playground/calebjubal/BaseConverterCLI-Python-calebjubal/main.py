base_string = """
Base Converter (Python)

Supports converting integers between bases: binary (bin), octal (oct), decimal (dec), hexadecimal (hex).

Usage (interactive):
 - Run the script and type commands like:
     convert 1010 bin dec
     convert 15 dec hex
     convert 77 oct bin
     convert 1F hex dec
 - Or type `exit` / `quit` to leave.

Only integer conversion is supported (no fractional parts). Negative integers are accepted (e.g., -1A hex dec -> -26).
"""

import re
from typing import Tuple

BASE_MAP = {
    'bin': 2,
    'oct': 8,
    'dec': 10,
    'hex': 16,
}

# Regex to validate characters (digits and A-F) for integer inputs (with optional leading '-')
_VALID_RE = re.compile(r"^-?[0-9A-Fa-f]+$")


def normalize_base_name(name: str) -> str:
    """Normalize base name (case-insensitive) and validate it.

    Raises ValueError if base is unknown.
    """
    key = name.strip().lower()
    if key not in BASE_MAP:
        raise ValueError(f"Unknown base '{name}'. Supported: {', '.join(BASE_MAP.keys())}")
    return key


def validate_number_for_base(number: str, base_name: str) -> bool:
    """Return True if `number` is a valid integer representation in `base_name`.

    Accepts optional leading '-' for negative numbers. Letters A-F (case-insensitive) are allowed for hex.
    """
    if not _VALID_RE.match(number):
        return False

    # Remove optional leading '-'
    num = number.lstrip('-')
    base = BASE_MAP[base_name]

    # Validate each digit is within base.
    for ch in num:
        # digits
        if ch.isdigit():
            val = ord(ch) - ord('0')
        else:
            # hex letters
            val = ord(ch.upper()) - ord('A') + 10
        if val >= base:
            return False
    return True


def int_from_str(number: str, base_name: str) -> int:
    """Convert validated `number` string in `base_name` to Python int.

    Raises ValueError if invalid.
    """
    base = BASE_MAP[base_name]
    try:
        return int(number, base)
    except ValueError as e:
        raise ValueError(f"Invalid number '{number}' for base {base_name}") from e


def format_int_to_base(value: int, base_name: str) -> str:
    """Format Python int `value` into target `base_name` string representation.

    Output uses uppercase hex letters and no prefixes (no 0x/0b/0o).
    """
    negative = value < 0
    v = abs(value)
    if base_name == 'dec':
        out = str(v)
    elif base_name == 'bin':
        out = format(v, 'b')
    elif base_name == 'oct':
        out = format(v, 'o')
    elif base_name == 'hex':
        out = format(v, 'X')
    else:
        raise ValueError(f"Unknown target base: {base_name}")

    return '-' + out if negative else out


def convert_number(number: str, src_base: str, dst_base: str) -> str:
    """Validate and convert `number` from `src_base` to `dst_base`.

    Returns the converted string (without prefixes).
    Raises ValueError on invalid input.
    """
    src = normalize_base_name(src_base)
    dst = normalize_base_name(dst_base)

    if not validate_number_for_base(number, src):
        raise ValueError(f"Number '{number}' is not valid in base '{src}'")

    n = int_from_str(number, src)
    return format_int_to_base(n, dst)


def _print_help():
    print("Supported bases: bin, oct, dec, hex")
    print("Examples:")
    print("  convert 1010 bin dec    -> 10")
    print("  convert 15 dec hex      -> F")
    print("  convert 77 oct bin      -> 111111")
    print("  convert 1F hex dec      -> 31")


def interactive():
    print(base_string, "\n(type 'help' for examples, 'exit' to quit)")
    while True:
        try:
            raw = input('> ').strip()
        except (EOFError, KeyboardInterrupt):
            print()  # newline
            break
        if not raw:
            continue
        if raw.lower() in ('exit', 'quit'):
            break
        if raw.lower() in ('help', '?'):
            _print_help()
            continue

        parts = raw.split()
        if parts[0].lower() == 'convert' and len(parts) == 4:
            _, num, src, dst = parts
            try:
                res = convert_number(num, src, dst)
            except ValueError as e:
                print(f"Error: {e}")
            else:
                print(res)
        else:
            # Fallback interactive flow: ask sequential questions
            print("Enter command as: convert <number> <src> <dst>")


if __name__ == '__main__':
    interactive()
