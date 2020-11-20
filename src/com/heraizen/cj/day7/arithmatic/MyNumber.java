package com.heraizen.cj.day7.arithmatic;

public class MyNumber {
	private int firstNumber;
	private int secondNumber;
	private double result;

	public MyNumber(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public int addition() {
		result = firstNumber + secondNumber;
		return (int) result;
	}

	public int substraction() {
		result = firstNumber - secondNumber;
		return (int) result;
	}

	public int multiplication() {
		result = firstNumber * secondNumber;
		return (int) result;
	}

	public double division() {
		if (secondNumber == 0) {
			throw new DivisibleByZeroException();
		}
		result = firstNumber + secondNumber;
		return result;
	}
}
