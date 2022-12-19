// package Mod5.E1315;

// import java.util.Scanner;
// import java.math.BigInteger;

// public class Exercise_13_15 {
    
//     public static void main(String[] args) {
// 		// Clears the terminal screen
// 		System.out.printf("\033\143");


//     // gets the first rational
//     Scanner firstRationalInput = new Scanner(System.in);
//     System.out.printf("Enter the first rational number: ");
//     BigInteger firstNumber = firstRationalInput.nextBigInteger();
//     BigInteger secondNumber = firstRationalInput.nextBigInteger();
    
//     // gets the second rational
//     Scanner secondRationalInput = new Scanner(System.in);
//     System.out.printf("Enter the second rational number: ");
//     BigInteger thirdNumber = secondRationalInput.nextBigInteger();
//     BigInteger fourthNumber = secondRationalInput.nextBigInteger();


//     // 
//     Rational number1 = new Rational(firstNumber, secondNumber);
//     Rational number2 = new Rational(thirdNumber, fourthNumber);
    
//     System.out.println(number1 + " + " + number2 + " = " + number1.add(number2));
//     System.out.println(number1 + " + " + number2 + " = " + number1.subtract(number2));
//     System.out.println(number1 + " + " + number2 + " = " + number1.multiply(number2));
//     System.out.println(number1 + " + " + number2 + " = " + number1.divide(number2));
//     System.out.println(number2 + " is " + number2.doubleValue());

//     firstRationalInput.close();
//     secondRationalInput.close();
//     }
// }
