from tkinter import *
window = Tk()
window.title('')
window.iconbitmap('cal.ico')
# function for buttons
def num_pressed(num):
    current_text = entry.get()
    new_text = current_text + num
    entry.delete(0, END)
    entry.insert(0, new_text)

def dell():
    entry.delete(0, END)

#functions for the operations
def symbol(num):

    match num:
        case 0:
            current_text = entry.get()
            new_text = current_text + '+'
            entry.delete(0, END)
            entry.insert(0, new_text)
        case 1:
            current_text = entry.get()
            new_text = current_text + '-'
            entry.delete(0, END)
            entry.insert(0, new_text)
        case 2:
            current_text = entry.get()
            new_text = current_text + '/'
            entry.delete(0, END)
            entry.insert(0, new_text)
        case 3:
            current_text = entry.get()
            new_text = current_text + '*'
            entry.delete(0, END)
            entry.insert(0, new_text)

def exe():
    expression = entry.get()
    try:
        result = eval(expression)
        entry.delete(0, END)
        entry.insert(0, str(result))
    except Exception as e:
        entry.delete(0, END)
        entry.insert(0, "Error")

entry = Entry(window, width=20)
entry.grid(row=0, column=0, columnspan=3)

# create buttons in a loop
buttons = [
    ('7', 1, 0), ('8', 1, 1), ('9', 1, 2),
    ('4', 2, 0), ('5', 2, 1), ('6', 2, 2),
    ('1', 3, 0), ('2', 3, 1), ('3', 3, 2),
    ('0', 4, 1)
]

for (text, row, column) in buttons:
    button = Button(window, text=text, width=5, height=2, command=lambda t=text: num_pressed(t))
    button.grid(row=row, column=column)

# button for del display
bdell = Button(window, text='AC', width=5, height=2, command=dell)
bdell.grid(row=1, column=5)
# button for + display
badd = Button(window, text='+', width=5, height=2, command=lambda : symbol(0))
badd.grid(row=2, column=5)
# button for - display
bsub = Button(window, text='-', width=5, height=2, command=lambda : symbol(1))
bsub.grid(row=3, column=5)
# button for enter display
eb = Button(window, text='Exe', width=5, height=2, command=exe)
eb.grid(row=4, column=5)
# button for divide display
dividebutton = Button(window,text='÷',width=5,height=2,command=lambda : symbol(2))
dividebutton.grid(row=4,column=0)
# button for mult display
multiplybutton = Button(window,text='X',width=5,height=2,command=lambda : symbol(3))
multiplybutton.grid(row=4,column=2)

window.mainloop()
