package Mod1;
import java.util.Scanner;

public class Exercise_2_3 {
	public static void main(String[] args) {
		// Clears the terminal screen
		System.out.print("\033\143");
		// Initializes the Scanner to get the feet input from the user
		Scanner feetInput = new Scanner(System.in);
		// Message to be displayed to user to get input
		System.out.print("Please enter in feet to be converted to meters!: ");
		// Sets the variable feet to the next double that is entered
		double feet = feetInput.nextDouble();
		// Closes the Scanner
		feetInput.close();
		// The conversion of feet to meters which is feet times 0.305
		double feetToMeters = (feet * 0.305);
		// prints out to the user the input and the conversion
		System.out.println(feet + " feet is " + feetToMeters + " meters!");
	}
}