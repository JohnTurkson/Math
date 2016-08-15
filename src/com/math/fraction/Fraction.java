package com.math.fraction;

/***
 * 
 * @author ChaosFlurry
 *
 */
public class Fraction {

	int numerator;
	int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	@Override
	public String toString() {
		if (denominator == 1)
			return Integer.toString(numerator);
		return (numerator == 0) ? "0" : numerator + "/" + denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public boolean isUndefined() {
		if (denominator == 0) return true;
		else return false;
	}

	public double decimalValue() {
		return (double) numerator / denominator;
	}
}
