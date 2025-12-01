print("Mass Converter")

# inputs
input_value = float(input("Enter a value you want to convert: "))
print(f"mass-units :\n 1.gram\n 2.kilogram\n 3.pound\n 4.ounce")
source = input("Enter the source unit of the value from the list: ")
units_list = ['gram', 'kilogram', 'pound', 'ounce']
source = source.lower()
if source not in units_list:
    print("please enter a valid source unit")
target = input("Enter the target unit of conversion: ")
target = target.lower()
if target not in units_list:
    print("please enter a valid target unit")
print(f"{source} to {target}")

#conversion to one single source
if source == target :
    converted_value = input_value
if source == 'gram' :
    value_in_grams = input_value
elif source == 'kilogram' :
    value_in_grams = input_value*1000.0
elif source == 'pound' :
    value_in_grams = input_value*453.5
elif source == 'ounce' :
    value_in_grams = input_value*28.3

#final conversion
if target == 'gram' :
    converted_value = value_in_grams
if target == 'kilogram' :
    converted_value = value_in_grams/1000.0
elif target == 'pound' :
    converted_value = input_value/453.5
elif target == 'ounce' :
    converted_value = input_value/28.3
print(f"{input_value} {source} = {converted_value} {target}")
 
    
        
        
