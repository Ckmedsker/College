# Write a program that calculates the total amount of a meal purchased at a
# restaurant. The program should ask the user to enter the charge for the food,
# then calculate the amounts of a 18 percent tip and 7 percent sales tax.
# Display each of these amounts and the total.
price = float(input("How much was your food before tax and a tip?\n$"))

tip = price * 0.18
formatted_tip = "{:,.2f}".format(tip)

tax = price * 0.07
formatted_tax = "{:,.2f}".format(tax)

final_price = "{:,.2f}".format(price + tip + tax)


print(f"The tip at 18% will be ${formatted_tip}!")
print(f"The tax at 7% will be ${formatted_tax}!")
print(f"The final price of your meal will be ${final_price}!")