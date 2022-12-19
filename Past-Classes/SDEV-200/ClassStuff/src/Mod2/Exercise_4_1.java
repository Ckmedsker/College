package Mod2;
import java.util.Scanner;
import java.lang.Math;

public class Exercise_4_1 {
	public static void main(String[] args) {
		// Clears the terminal screen
		System.out.printf("\033\143");
		// Initializes the scanner to get user input
		Scanner centerToVertexInput = new Scanner(System.in);
		System.out.print("Enter the length from the center to a vertex: ");
		double centerToVertex = centerToVertexInput.nextDouble();
		double pentagonSide = ((2 * centerToVertex) * (Math.sin(Math.PI / 5)));
		double pentagonArea = Math.round(5 * (Math.pow(pentagonSide, 2)) / (4 * (Math.tan(Math.PI / 5))) / 0.01) * 0.01;
		// double pentagonArea = 5 * (Math.pow(pentagonSide, 2)) / (4 * (Math.tan(Math.PI / 5))) / 0.01;
		System.out.println("The area of the pentagon is " + pentagonArea);
        centerToVertexInput.close();
	}
}
