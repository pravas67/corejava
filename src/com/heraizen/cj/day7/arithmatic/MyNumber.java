package com.heraizen.cj.day7.arithmatic;

public class MyNumber {
	int a;
	int b;
	double result;

	public MyNumber(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		result = a + b;
		return (int) result;
	}

	public int sub() {
		result = a - b;
		return (int) result;
	}

	public int mul() {
		result = a * b;
		return (int) result;
	}

	public double div() {
		if (b == 0) {
			throw new DivisibleByZeroException();
		}
		result = a + b;
		return result;
	}
}
