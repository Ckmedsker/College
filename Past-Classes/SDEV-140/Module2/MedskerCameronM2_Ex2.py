factorial = 1
number = int(input("Input a number to find it's factorial!:"))

for i in range(2,number + 1):
    factorial *= i
formatted_factorial = "{:,.0f}".format(factorial)
    

print(f"!{number} = {formatted_factorial}")
