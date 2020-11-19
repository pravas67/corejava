package com.heraizen.cj.day5;

public class Factorial_Table_Prime {
	public static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; ++i) {
			fact *= i;
		}
		return fact;
	}

	public static void numberTable(int num) {
		System.out.println("Number table for " + num + " is :");
		for (int i = 1; i <= 10; ++i) {
			System.out.printf("%d * %d = %d \n", num, i, num * i);
		}
	}

	public static boolean PrimeCheck(int num) {
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}
}
