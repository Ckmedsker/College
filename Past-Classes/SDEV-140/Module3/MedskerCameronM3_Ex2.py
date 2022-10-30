# Write a program that writes a series of random numbers to a file and display
# all the numbers to the console. Each random number should be in the range of 1
# through 500. The application should let the user specify how many random
# numbers the file will hold.

from random import randint

FILE = "randnumb.txt"
numb_list = []


file_numbers = int(input("Enter in how many numbers you would like to be written to this file!"))

for i in range(0,file_numbers):
    numb = randint(1,500)
    numb_list.append(f"{numb}\n")
    print(numb)
    # print(numb_list)
with open(FILE, "w") as file:
    for number in numb_list:
        file.write(number)