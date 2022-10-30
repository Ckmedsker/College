import os
import time

total_sales = int(input("Please input the amount of money made from sales this month!:\n"))

county_tax = total_sales * .025
state_tax = total_sales * .05
sales_tax = county_tax + state_tax

total_earned = total_sales - sales_tax


# Unimportant stuff to make the program fancy
os.system('cls' if os.name == 'nt' else 'clear')
print("Calculating.")
time.sleep(1)
os.system('cls' if os.name == 'nt' else 'clear')
print("Calculating..")
time.sleep(1)
os.system('cls' if os.name == 'nt' else 'clear')
print("Calculating...")
time.sleep(1)
os.system('cls' if os.name == 'nt' else 'clear')


print(f"Your total before tax is ${total_sales}!")
print(f"The county tax is ${county_tax}!")
print(f"The state tax is ${state_tax}")
print(f"The total tax is ${sales_tax}")
print(f"The total money earned is ${total_earned}")
