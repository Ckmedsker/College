class Person:

    def __init__(self, name, address, phone_number):
        self.name = name
        self.address = address
        self.phone_number = phone_number

class Customer(Person):

    def __init__(self, name, address, phone_number, customer_number, on_mailing_list):
        super().__init__(name, address, phone_number)
        self.customer_number = customer_number
        self.on_mailing_list = on_mailing_list

customer_1 = Customer("Dave Man", "340 Fake Street", "920-234-5354", 14, False)

print(f"The customer's name is {customer_1.name}!")
print(f"The customer's address is {customer_1.address}!")
print(f"The customer's phone number is {customer_1.phone_number}!")
print(f"The customer's number is {customer_1.customer_number}!")
if customer_1.on_mailing_list == True:
    word = ""
elif customer_1.on_mailing_list == False:
    word = "not "
print(f"The customer is {word}on the mailing list!")