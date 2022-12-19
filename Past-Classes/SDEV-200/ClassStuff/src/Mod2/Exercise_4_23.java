package Mod2;

import java.util.Scanner;

public class Exercise_4_23 {
  public static void main(String[] args) {
    // Clears the terminal screen
    System.out.print("\033\143");

    // Getting the employee's name
    Scanner employeeNameInput = new Scanner(System.in);
    System.out.print("Enter employee's name: ");
    String employeeName = employeeNameInput.nextLine();

    // Getting number of hours worked
    Scanner hoursWorkedInput = new Scanner(System.in);
    System.out.printf("Enter number of hours worked in a week: ");
    double hoursWorked = hoursWorkedInput.nextDouble();

    // Getting hourly pay rate
    Scanner hourlyPayRateInput = new Scanner(System.in);
    System.out.printf("Enter hourly pay rate: ");
    double hourlyPayRate = hourlyPayRateInput.nextDouble();

    // Getting Federal tax withholding rate
    Scanner federalTaxInput = new Scanner(System.in);
    System.out.printf("Enter federal tax withholding rate: ");
    double federalTax = (federalTaxInput.nextDouble() * 10);

    // Getting State tax withholding rate
    Scanner stateTaxInput = new Scanner(System.in);
    System.out.printf("Enter state tax withholding rate: ");
    double stateTax = (stateTaxInput.nextDouble() * 10);

    // System output, formatted money with two following decimal places
    System.out.println("Employee Name: " + employeeName);
    System.out.println("Hours Worked: " + hoursWorked);
    System.out.println("Pay Rate: $" + String.format("%.2f", hourlyPayRate));
    System.out.println("Gross Pay: $" + String.format("%.2f", hourlyPayRate * hoursWorked));
    System.out.println("Deductions:");
    System.out.println("   Federal Withholding (" + (federalTax * 10) + "%): $" + String.format("%.2f", (hourlyPayRate * federalTax)));
    System.out.println("   State Withholding (" + (stateTax * 10) + "%): $" + String.format("%.2f", (hourlyPayRate * stateTax)));
    System.out.println("   Total Deduction: $" + String.format("%.2f", ((hourlyPayRate * federalTax) + (hourlyPayRate * stateTax))));
    System.out.println("Net Pay: $" + String.format("%.2f", ((hourlyPayRate * hoursWorked) - ((hourlyPayRate * federalTax) + (hourlyPayRate * stateTax)))));

    // Closing all the user inputs
    employeeNameInput.close();
    hoursWorkedInput.close();
    hourlyPayRateInput.close();
    federalTaxInput.close();
    stateTaxInput.close();
  }
}
