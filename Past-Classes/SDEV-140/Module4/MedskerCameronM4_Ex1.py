prime_numbers = []
user_input = int(input("Please enter a number higher than 1!"))

numb_dict = {n: False for n in range(2, user_input + 1)}

def is_prime(numb):
    for i in numb_dict:
        if numb != i and numb % i == 0:
            numb_dict[numb] = True

for numb in numb_dict:
    is_prime(numb)

for key, value in zip(numb_dict.keys(), numb_dict.values()):
    if value == False:
        prime_numbers.append(key)
    
for prime_numb in prime_numbers:
    print(f"{prime_numb} is a prime number!")