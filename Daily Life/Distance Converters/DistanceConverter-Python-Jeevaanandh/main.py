import argparse

print("🌍📏  DISTANCE CONVERTER  📏🌍\n")

DISTANCE_FACTORS = {
    "m": 1,
    "km": 1000,
    "cm": 0.01,
    "mm": 0.001,
    "mile": 1609.34,
    "yard": 0.9144,
    "foot": 0.3048,
    "inch": 0.0254,
}

def convert(val, from_unit, to_unit):
    in_m= val*DISTANCE_FACTORS[from_unit] # Converting to meters first
    res= in_m/ DISTANCE_FACTORS[to_unit]

    return res


def main():
    parser= argparse.ArgumentParser(description="Distance Converter CLI")
    parser.add_argument("value", type=float, help="nemeric value to convert")
    parser.add_argument("from_unit", type=str, help="unit to convert From")
    parser.add_argument("to_unit", type=str, help="unit to convert To")
    args= parser.parse_args()

    if(args.from_unit not in DISTANCE_FACTORS):
        print("Enter a valid From Unit")
        return
    
    if(args.to_unit not in DISTANCE_FACTORS):
        print("Enter a valid To Unit")
        return

    res= convert(args.value, args.from_unit, args.to_unit)
    print(f"📏 {args.value} {args.from_unit} = {res:.3f} {args.to_unit}")


if __name__ == "__main__":
    main()
