package com.heraizen.cj.day7.arithmatic;

import java.util.Scanner;

public class MyNumberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		System.out.println("Select\t1.Add\t2.Substract\t3.Multiplication\t4.Division\\t5.Exit");
		MyNumber obj = new MyNumber(firstNumber, secondNumber);
		do {
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Result is: " + obj.addition());
				break;

			case 2:
				System.out.println("Result is: " + obj.substraction());
				break;
			case 3:
				System.out.println("Result is: " + obj.multiplication());
				break;
			case 4:
				System.out.println("Result is: " + obj.division());
				break;
			case 5: {
				sc.close();
				System.exit(0);
			}
			}
		} while (true);

	}

}
