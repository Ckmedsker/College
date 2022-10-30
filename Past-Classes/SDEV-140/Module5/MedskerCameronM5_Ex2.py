import random

while True:
    random_number = random.randint(1,100)
    guess_count = 0
    print("A number has been generated!")
    while True:
        guess = int(input("Please guess a number between 1 and 100!\n"))
        if guess > 100 or guess < 1:
            print("Please enter a number within the given range! Restarting!")
            break
        if guess == random_number:
            print("You guessed it correctly!")
            guess_count += 1
            if guess_count == 1:
                print(f"It took you {guess_count} guess!")
            else:
                print(f"It took you {guess_count} guesses!")
            break
        elif guess <= random_number:
            print("Too low, try again.")
            guess_count += 1
        elif guess >= random_number:
            print("Too high, try again.")
            guess_count += 1