def miles_to_kilometers(miles):
    km = miles * 0.609344
    return km
def kilometers_to_miles(km):
    miles = km / 0.609344
    return miles
def meters_to_feet(meters):
    feet = meters * 3.28084
    return feet
def feet_to_meters(feet):
    meters = feet / 3.28084
    return meters
def centimeters_to_inches(centimeters):
    inches = centimeters * 0.393701
    return inches
def inches_to_centimeters(inches):
    centimeters = inches / 0.393701
    return centimeters
print("To convert distance from one unit to another.")
print("1.Miles to Kilometers")
print("2.Kilometers to Miles")
print("3.Meters to Feet")
print("4.Feet to Meters")
print("5.Centimeters to Inches")
print("6.Inches to Centimeters")
option = int(input("Enter an option to convert distance: "))
value = float(input("Enter the value to convert distance: "))
if (option == 1):
    result = miles_to_kilometers(value)
    print(f"{value} Miles is equal to {result} kilometers.")
if (option == 2):
    result = kilometers_to_miles(value)
    print(f"{value} Kilometers is equal to {result} Miles.")
if (option == 3):
    result = meters_to_feet(value)
    print(f"{value} Meters is equal to {result} Feet.")
if (option == 4):
    result = feet_to_meters(value)
    print(f"{value} Feet is equal to {result} Meters.")
if (option == 5):
    result = centimeters_to_inches(value)
    print(f"{value} Centimeters is equal to {result} Inches.")
if (option == 6):
    result = inches_to_centimeters(value)
    print(f"{value} Inches is equal to {result} Centimeters.")
