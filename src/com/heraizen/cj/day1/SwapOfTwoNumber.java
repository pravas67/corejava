package com.heraizen.cj.day1;

import java.util.Scanner;

public class SwapOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number num1:");
		int num1 =sc.nextInt();
		System.out.println("Enter the second number num1:");
		int num2 =sc.nextInt();
		System.out.println("Before swap, the values of num1="+num1+" and num2="+num2);
		num1 = num1 + num2;  
		num2 = num1 - num2;  
		num1 = num1 - num2;
		System.out.println("After swap, the values of num1="+num1+" and num2="+num2);
		sc.close();

	}

}
