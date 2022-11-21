package Mod4.E111;

public class Exercise_11_1 {
    public static void main(String[] args) {
		// clears the terminal screen
		System.out.printf("\033\143");
    
    // no-arg triangle constructor
    Triangle triangle1 = new Triangle();

    // prints the first triangle, it's three sides, it's perimeter and it's area
    System.out.println(triangle1.toString());
    System.out.printf("Perimeter = %s\n\n", triangle1.getPerimeter());
    System.out.printf("Area = %s\n", triangle1.getArea());

    // three-args triangle constructor
    Triangle triangle2 = new Triangle(5, 5, 9);

    // prints the second triangle, it's three sides, it's perimeter and it's area
    System.out.println(triangle2.toString());
    System.out.printf("Perimeter = %s\n\n", triangle2.getPerimeter());
    System.out.printf("Area = %s\n", triangle2.getArea());
    }
}