package Mod3;

public class Exercise_6_9 {
    public static void main(String[] args) {
		// clears the terminal screen
		System.out.printf("\033\143");

        // prints out of the head of the table
        // 7 - 9 - 5 - 10
        System.out.println("Feet       Meters         |     Meters          Feet");
        System.out.println("-------------------------------------------------------");
        
        int i = 0;
        double feet = 1.0;
        double meters = 20.0;
        while (i < 10) {
            footToMeter(feet);
            meterToFoot(meters);
            feet++;
            meters+=5;
            i++;
        }

    }
    public static double footToMeter (double foot) {
        double meter = 0.305 * foot;
        // System.out.printf("%3.1f", foot);
        // System.out.printf("%14.3f", meter);
        // System.out.print("          |     ");
        System.out.printf("%.1f %12.3f          |     ", foot, meter);
        return meter;
    }
    public static double meterToFoot (double meter) {
        double foot = 3.27869 * meter;
        // System.out.printf("%.1f", meter);
        // System.out.printf("%19.3f\n", foot);
        System.out.printf("%.1f            %.3f\n", meter, foot);
        return foot;
    }
}
