import tkinter as tk
from tkinter import messagebox, IntVar

# evaluate function responsible for all the verifications, calculations & results
def evaluate():
    # Retrieving 1st and 2nd entered values
    txt_1 = text_entry_1.get()
    txt_2 = text_entry_2.get()
    # Testing if 1st and 2nd values are usable
    if len(txt_1) == 0:
        tk.messagebox.showerror('Warning', 'The data in Box 1 is invalid\nPlease correct it')
    if len(txt_2) == 0:
        tk.messagebox.showerror('Warning', 'The data in Box 2 is invalid\nPlease correct it')
    ch_1_error = 'OFF'
    for ch_1 in txt_1:
        if ch_1.isalpha() or ch_1 ==',':
            ch_1_error = 'ON'
    if ch_1_error == 'ON':
        tk.messagebox.showerror('Warning', 'The data in Box 1 is invalid\nPlease correct it')
    ch_2_error = 'OFF'
    for ch_2 in txt_2:
        if ch_2.isalpha() or ch_2 ==',':
            ch_2_error = 'ON'
    if ch_2_error == 'ON':
        tk.messagebox.showerror('Warning', 'The data in Box 2 is invalid\nPlease correct it')
    # Converting 1st and 2nd values from strings to int/float values
    if '.' in txt_1:
        txt_1 = float(txt_1)
    else:
        txt_1 = int(txt_1)
    if '.' in txt_2:
        txt_2 = float(txt_2)
    else:
        txt_2 = int(txt_2)
    # Calculating and displaying the answer based on 1 of the 4 operations selected
    if switch.get() == 0:
        answer = txt_1 + txt_2
        tk.messagebox.showinfo('Answer', str(txt_1) + ' + ' + str(txt_2) + ' = ' + str(answer))
    if switch.get() == 1:
        answer = txt_1 - txt_2
        tk.messagebox.showinfo('Answer', str(txt_1) + ' - ' + str(txt_2) + ' = ' + str(answer))
    if switch.get() == 2:
        answer = txt_1 * txt_2
        tk.messagebox.showinfo('Answer', str(txt_1) + ' * ' + str(txt_2) + ' = ' + str(answer))
    if switch.get() == 3:
        if txt_2 != 0:
            answer = txt_1 / txt_2
            tk.messagebox.showinfo('Answer', str(txt_1) + ' / ' + str(txt_2) + ' = ' + str(answer))
        else:
            tk.messagebox.showerror('Warning', 'The data in Box 2 is 0\nPlease correct it')

window = tk.Tk()
window.title('Simple Calculator')
text_entry_1 = tk.StringVar() # First value to be entered in the calculator
entry_1 = tk.Entry(window, width=30, textvariable=text_entry_1) # First value to be entered in the calculator
entry_1.grid(row=1, column=0, rowspan=2) # First value position allocation

switch = tk.IntVar()
switch.set(0) # Switch set to start at the + operation

radio_button_plus = tk.Radiobutton(window, text='+', variable=switch, value=0)
radio_button_minus = tk.Radiobutton(window, text='-', variable=switch, value=1)
radio_button_multiply = tk.Radiobutton(window, text='*', variable=switch, value=2)
radio_button_devide = tk.Radiobutton(window, text='/', variable=switch, value=3)
radio_button_plus.grid(row=0, column=1) # + Button position allocation
radio_button_minus.grid(row=1, column=1) # - Button position allocation
radio_button_multiply.grid(row=2, column=1) # * Button position allocation
radio_button_devide.grid(row=3, column=1) # / Button position allocation

text_entry_2 = tk.StringVar() # Second value to be entered in the calculator
entry_2 = tk.Entry(window, width=30, textvariable=text_entry_2) # Second value to be entered in the calculator
entry_2.grid(row=1, column=2, rowspan=2) # Second value position allocation

button = tk.Button(window, text='Evaluate', command=evaluate)
button.grid(row=4, column=1) # Evaluate Button position allocation

window.mainloop()