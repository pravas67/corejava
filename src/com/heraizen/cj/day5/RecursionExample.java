package com.heraizen.cj.day5;

public class RecursionExample {

	public static int factorial(int num) {
		if (num >= 1)
			return num * factorial(num - 1);
		else
			return 1;
	}

	public static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	public static int gcd(int n1, int n2) {
		if (n2 != 0)
			return gcd(n2, n1 % n2);
		else
			return n1;
	}

	public static int sumOfNaturalNumber(int num) {
		if (num != 0)
			return num + sumOfNaturalNumber(num - 1);
		else
			return num;
	}
}
