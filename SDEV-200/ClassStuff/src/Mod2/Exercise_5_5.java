package Mod2;

public class Exercise_5_5 {
    public static void main(String[] args) {
		// Clears the terminal screen
		System.out.printf("\033\143");

    int kilograms1 = 1;
    double pounds1 = kilograms1 * 2.2;
    int pounds2 = 20;
    double kilograms2 = 9.09;

    System.out.println("Kilograms   Pounds  |  Pounds   Kilograms");
    while (kilograms1 != 201) {
      System.out.printf("%9d", kilograms1);
      System.out.printf("%9.1f", pounds1);
      System.out.printf("  |  ");
      System.out.printf("%6d", pounds2);
      System.out.printf("%12.2f \n", kilograms2);
      kilograms1 += 2;
      pounds1 = kilograms1 * 2.2;
      pounds2 += 5;
      kilograms2 = pounds2 / 2.2;
    }
    }
}
