from tkinter import *

# Static Variables
BACKG = "cyan"
FONTC = "black"

# UI Initialization
UI = Tk()
UI.title("Celcius to Farenheit!")
UI.configure(bg="pink")
UI.geometry("1000x825")
UI.minsize(500, 275)
UI.maxsize(500, 275)
info_label = Button(UI)

# Initializitialization Variables
farenheit = 0

def c_f_calculation(celcius):
    global info_label
    info_label.destroy()
    farenheit = 9/5 * float(celcius) + 32
    info_label = Label(UI, text=(f"{celcius}° celcius is {farenheit}° farenheit!"),
                    bg=BACKG, fg=FONTC, font="none 12 bold")
    info_label.place(relx=0.5, rely=0.9, anchor=S)

def f_c_calculation(farenheit):
    global info_label
    info_label.destroy()
    celcius = (float(farenheit) - 32) * 5/9
    info_label = Label(UI, text=(f"{farenheit}° farenheit is {celcius}° celcius!"),
                    bg=BACKG, fg=FONTC, font="none 12 bold")
    info_label.place(relx=0.5, rely=0.9, anchor=S)


# Main Page Widgets
static_info_label = Label(UI, text="Enter in a Celcius temperature to be converted to Farenheit!",
                   bg=BACKG, fg=FONTC, font="none 12 bold")
static_info_label.place(relx=0.5, rely=0.2, anchor=S)

entry_box = Entry(UI, bg=BACKG, fg=FONTC, width=30, font="none 20 bold")
entry_box.place(relx=0.5, rely=0.5, anchor=S)

c_f_calculation_button = Button(UI, text="Convert to Farenheit!", bg=BACKG, fg=FONTC,
                width=20, height=3, font="none 10 bold", command=lambda:c_f_calculation(entry_box.get()))
c_f_calculation_button.place(relx=0.25, rely=0.75, anchor=S)

f_c_calculation_button = Button(UI, text="Convert to Farenheit!", bg=BACKG, fg=FONTC,
                width=20, height=3, font="none 10 bold", command=lambda:f_c_calculation(entry_box.get()))
f_c_calculation_button.place(relx=0.75, rely=0.75, anchor=S)

UI.mainloop()