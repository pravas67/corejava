package com.heraizen.cj.day5;

import java.util.Scanner;

public class Factorial_Table_Prime_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Factorial\t2.Number Table\t3.Prime or not\t4.EXIT ");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the Number to get factorial");
			Factorial_Table_Prime.factorial(sc.nextInt());
			break;

		case 2:
			System.out.println("Enter the Number to get number table");
			Factorial_Table_Prime.numberTable(sc.nextInt());
			break;
		case 3:
			System.out.println("Enter the Number to check number is prime or not");
			if (Factorial_Table_Prime.PrimeCheck(sc.nextInt()))
				System.out.println("The Entered number is a prime number");
			else
				System.out.println("The entered number is not a prime number");
			break;

		case 4: {
			sc.close();
			System.exit(0);
		}
		}
		while (true)
			;

	}

}
