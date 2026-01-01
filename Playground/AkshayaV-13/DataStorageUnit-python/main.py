#dictionary to store and accesss unit names with corresponding numbers
#Excluded bits as it is optional in problem statement
units = {
    1: "Bytes",
    2: "kilobytes",
    3: "Megabytes",
    4: "Gigabytes",
    5: "Terabytes",
    6: "Petabytes",
}
#display available data to users
print("Convert data from: ")
for i,j in units.items():
    print(f"{i}->{j}")
def wrong_input(x):#function to check invalid input 
    if x<=0 or x>6:
        print("Invalid input")
        exit()#if input is out of range exit from the program
    else:
        pass
#input from user to ask user which units they want to convert from and to
convert_from=int(input("Select unit converted from(enter value in numbers 1-6) : "))
wrong_input(convert_from)
convert_to=int(input("Select unit data need to converted to(enter value in numbers 1-6) : "))
wrong_input(convert_to)
#input actual data value to be converted
data=int(input(f"Enter data that has to be converted to : "))
#find absolute difference between unit positions
#This helps to know how many times 1024 should be multiplied ir divided
diff=abs(convert_from-convert_to)
#if coverting from smaller unit to bigger unit->divide
if convert_from<convert_to:
    result=data/(1024**diff)
#if converting from bigger unit to smaller unit->multiply 
elif convert_from>convert_to:
    result=data*(1024**diff)
#if both units are same 
else:
    result=data
#display final result
print(f"Converted data is {result} {units[convert_to]}")