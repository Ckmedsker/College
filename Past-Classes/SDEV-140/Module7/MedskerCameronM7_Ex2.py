class Employee:

    def __init__(self, name, number):
        self.name = name
        self.number = number

class ProductionWorker(Employee):
    
    def __init__(self, name, number, shift_number, hourly_pay_rate):
        super().__init__(name, number)
        self.shift_number = shift_number
        self.hourly_pay_rate = hourly_pay_rate

    def shift_time_finder(self):
        if self.shift_number == 1:
            self.shift_time = "day"
        elif self.shift_number == 2:
            self.shift_time = "night"

name = input("Please enter employee name! ")
number = int(input("Please enter employee number! "))
shift_number = int(input("Please enter a shift number (1 or 2) "))
hourly_pay_rate = int(input("Please enter in the employee's hourly pay rate! "))

production_worker_1 = ProductionWorker(name, number, shift_number, hourly_pay_rate)
production_worker_1.shift_time_finder()

print(f"The production worker's name is {production_worker_1.name}!")
print(f"The production worker's number is {production_worker_1.number}!")
print(f"The production worker's shift time is during the  {production_worker_1.shift_time}!")
print(f"The production worker's hourly pay rate is ${production_worker_1.hourly_pay_rate}!")