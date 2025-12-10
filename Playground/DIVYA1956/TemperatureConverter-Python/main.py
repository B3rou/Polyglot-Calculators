# Temperature Converter Program by DIVYA1956

print("🌡 Temperature Converter")

print("1. Celsius → Fahrenheit")
print("2. Fahrenheit → Celsius")

choice = int(input("Enter your choice (1 or 2): "))

temp = float(input("Enter temperature value: "))

if choice == 1:
    result = (temp * 9/5) + 32
    print(f"{temp}°C is equal to {result}°F")
elif choice == 2:
    result = (temp - 32) * 5/9
    print(f"{temp}°F is equal to {result}°C")
else:
    print("❌ Invalid choice! Please enter 1 or 2.")