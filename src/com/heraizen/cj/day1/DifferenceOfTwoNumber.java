package com.heraizen.cj.day1;

import java.util.Scanner;

public class DifferenceOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number num1:");
		int num1 =sc.nextInt();
		System.out.println("Enter the second number num2:");
		int num2 =sc.nextInt();
		if(num1>num2) {
			System.out.println("The result (difference) is: "+(num1-num2));
		}else {
			System.out.println("The result (difference) is: "+(num1-num2));
		}
		sc.close();
	}

}
