# The colors red, blue, and yellow are known as the primary colors because they
# cannot be made by mixing other colors. When you mix two primary colors, you get
# a secondary color, as shown here:
# When you mix red and blue, you get purple.
# When you mix red and yellow, you get orange.
# When you mix blue and yellow, you get green.
# Design a program that prompts the user to enter the names of two
# primary colors to mix. If the user enters anything other than “red,” “blue,” or
# “yellow,” the program should display an error message. Otherwise, the program
# should display the name of the secondary color that results.



def color_checker(color):
    if color == "red":
        pass
    elif color == "blue":
        pass
    elif color == "yellow":
        pass
    else:
        print("Please try again!")
        print("Next time enter in red, blue, or yellow!")
        exit()


color1 = input("Enter a primary color to be mixed with another! (red/blue/yellow)\n")
color_checker(color1)
color2 = input("Enter in another primary color to be mixed! (red/blue/yellow)\n")
color_checker(color2)

if color1 == "red":
    if color2 == "blue":
        secondary_color = "purple"
    elif color2 == "yellow":
        secondary_color = "orange"
    elif color2 == "red":
        secondary_color = "invalid"
elif color1 == "blue":
    if color2 == "yellow":
        secondary_color = "green"
    elif color2 == "red":
        secondary_color = "purple"
    elif color2 == "blue":
        secondary_color = "invalid"
elif color1 == "yellow":
    if color2 == "red":
        secondary_color = "orange"
    elif color2 == "blue":
        secondary_color = "green"
    elif color2 == "yellow":
        secondary_color = "invalid"


if secondary_color == "invalid":
    print(f"When mixing {color1} and {color2} the result is {color1}! Duh!")
else:
    print(f"When mixing {color1} and {color2}, {secondary_color} is the result!")