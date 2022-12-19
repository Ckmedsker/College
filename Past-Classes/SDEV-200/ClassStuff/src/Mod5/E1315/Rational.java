// package Mod5.E1315;
// import java.math.*;

// public class Rational extends Number implements Comparable {
// 	// Data fields for numerator and denominator with BigInteger
// 	private BigInteger[] r = new BigInteger[2];

// 	/** Construct a ratinoal with default properties */
// 	public Rational() {
// 		this(new BigInteger("0"), new BigInteger("1"));
// 	}

// 	/** Construct a rational with specifiec numerator and denominator */
// 	public Rational(BigInteger numerator, BigInteger denominator) {
// 		BigInteger gcd = gcd(numerator, denominator);
// 		r[0] = (denominator.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE : new BigInteger("-1")).multiply(numerator.divide(gcd));
// 		r[1] = denominator.divide(gcd);
// 	}

// 	/** Find GCD of two numbers */
// 	private static BigInteger gcd(BigInteger numerator, BigInteger denominator) {
// 		BigInteger number1 = numerator;
// 		BigInteger number2 = denominator;
// 		BigInteger gcd = BigInteger.ONE;

// 		for (BigInteger k = BigInteger.ONE; 
// 			k.compareTo(number1) <= 0 && k.compareTo(number2) <= 0; 
// 			k = k.add(BigInteger.ONE)) {
// 			if (number1.remainder(k).compareTo(BigInteger.ZERO) == 0 && number2.remainder(k).compareTo(BigInteger.ZERO) == 0) 
// 				gcd = k;
// 		}
// 		return gcd;
// 	}

// 	/** Return numerator */
// 	public BigInteger getNumerator() {
// 		return r[0];
// 	}

// 	/** Return denominator */
// 	public BigInteger getDenominator() {
// 		return r[1];
// 	}

// 	/** Add a rational number to this rational */
// 	public Rational add(Rational secondRational) {
// 		BigInteger numerator = (r[0].multiply(secondRational.getDenominator())).add(
// 			r[1].multiply(secondRational.getNumerator()));
// 		BigInteger denominator = r[1].multiply(secondRational.getDenominator());
// 		return new Rational(numerator, denominator);
// 	}

// 	/** Subtract a rational number from this rational */
// 	public Rational subtract(Rational secondRational) {
// 		BigInteger numerator = (r[0].multiply(secondRational.getDenominator())).subtract(
// 			r[1].multiply(secondRational.getNumerator()));
// 		BigInteger denominator = r[1].multiply(secondRational.getDenominator());
// 		return new Rational(numerator, denominator);
// 	}

// 	/** Mulitply a rational number by this rational */
// 	public Rational multiply(Rational secondRational) {
// 		BigInteger numerator = r[0].multiply(secondRational.getNumerator());
// 		BigInteger denominator = r[1].multiply(secondRational.getDenominator());
// 		return new Rational(numerator, denominator);
// 	}

// 	/** Divide a rational number by this rational */
// 	public Rational divide(Rational secondRational) {
// 		BigInteger numerator = r[0].multiply(secondRational.getDenominator());
// 		BigInteger denominator = r[1].multiply(secondRational.getNumerator());
// 		return new Rational(numerator, denominator);
// 	}

// 	@Override
// 	public String toString() {
// 		if (r[1].compareTo(BigInteger.ONE) == 0)
// 			return r[0] + "";
// 		else
// 			return r[0] + "/" + r[1];
// 	}

// 	@Override // Override the equals method in the Object class
// 	public boolean equals(Object other) {
// 		if (((this.subtract((Rational)(other))).getNumerator()).compareTo(
// 			BigInteger.ZERO) == 0)
// 			return true;
// 		else
// 			return false;
// 	}

// 	@Override // Implement the abstract intValue method in Number
// 	public int intValue() {
// 		return (int)doubleValue();
// 	}

// 	@Override // Implement the abstract floatValue method in Number
// 	public float floatValue() {
// 		return (float)doubleValue();
// 	}

// 	@Override // Implement the doubleValue method in Number
// 	public double doubleValue() {
// 		return this.getNumerator().doubleValue() / 
// 			this.getDenominator().doubleValue();
// 	}

// 	@Override // Implement the abstract longValue method in Number
// 	public long longValue() {
// 		return (long)doubleValue();
// 	}

// 	@Override
// 	public int compareTo(Object o) {
// 		BigInteger zero = BigInteger.ZERO;
// 		BigInteger numerator = this.subtract((Rational)o).getNumerator();
// 		if (numerator.compareTo(zero) == 0)
// 			return 0;
// 		else
// 			return 1;
// 	}
// }