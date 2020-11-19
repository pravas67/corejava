package com.heraizen.cj.day5;

import java.util.Scanner;

public class RecursionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Factorial\t2.GDC of two number\t3.Fibonacci series\t4.Sum of N natural number \t5.EXIT ");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the Number to get factorial");
			RecursionExample.factorial(sc.nextInt());
			break;

		case 2:
			System.out.println("Enter the Number two  number to get GCD");
			int a = sc.nextInt();
			int b = sc.nextInt();
			RecursionExample.gcd(a, b);
			break;
		case 3:
			System.out.println("Enter the Number to get fibonacis series");
			RecursionExample.fib(sc.nextInt());
			break;
		case 4:
			System.out.println("Enter the Number to get Sum of N natural number");
			RecursionExample.sumOfNaturalNumber(sc.nextInt());
			break;

		case 5: {
			sc.close();
			System.exit(0);
		}
		}
		while (true)
			;

	}

}
