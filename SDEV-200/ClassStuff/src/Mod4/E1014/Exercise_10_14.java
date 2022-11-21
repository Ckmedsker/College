package Mod4.E1014;

public class Exercise_10_14 {
    public static void main(String[] args) {
		// clears the terminal screen
		System.out.printf("\033\143");

    // three examples for each arguments constructors

    // no-args current date constructor
    MyDate date1 = new MyDate();

    // setting the variables for year, month, day
    int date1Year = date1.getYear();
    int date1Month = date1.getMonth();
    int date1Day = date1.getDay();

    // outputting to the screen
    System.out.println("Today's Date: " + date1Month + "/" + date1Day +  "/" + date1Year);

    // one argument epoch time constructor
    MyDate date2 = new MyDate(946681500000L);

    // setting the variables for year, month, day
    int date2Year = date2.getYear();
    int date2Month = date2.getMonth();
    int date2Day = date2.getDay();

    // outputting to the screen
    System.out.println("946681500000 milliseconds since epoch (January 1st 1970): " + date2Month + "/" + date2Day +  "/" + date2Year);

    // three arguments set date constructor
    MyDate date3 = new MyDate(1948, 5, 29);

    // setting the variables for year, month, day
    int date3Year = date3.getYear();
    int date3Month = date3.getMonth();
    int date3Day = date3.getDay();

    // outputting to the screen
    System.out.println("Set Date: " + date3Month + "/" + date3Day +  "/" + date3Year);

    }
}
