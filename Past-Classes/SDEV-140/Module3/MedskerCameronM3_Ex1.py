# Write a program that asks the user to enter a series of single-digit numbers
# with nothing separating them. The program should display the sum of all the
# single digit numbers in the string. For example, if the user enters 2514, the
# method should return 12, which is the sum of 2, 5, 1, and 4.

number_sum = 0

input_number = int(input("Please enter a multiple digit number to add the sum of all digits!"))

for i in str(input_number):
    number_sum += int(i)

print(f"The sum of {input_number} is {number_sum}!")