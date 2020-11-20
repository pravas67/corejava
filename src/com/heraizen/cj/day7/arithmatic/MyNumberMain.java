package com.heraizen.cj.day7.arithmatic;

import java.util.Scanner;

public class MyNumberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Select\t1.Add\t2.Substract\t3.Multiplication\t4.Division\\t5.Exit");
		MyNumber obj = new MyNumber(a, b);
		do {
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Result is: " + obj.add());
				break;

			case 2:
				System.out.println("Result is: " + obj.sub());
				break;
			case 3:
				System.out.println("Result is: " + obj.mul());
				break;
			case 4:
				System.out.println("Result is: " + obj.div());
				break;
			case 5: {
				sc.close();
				System.exit(0);
			}
			}
		} while (true);

	}

}
