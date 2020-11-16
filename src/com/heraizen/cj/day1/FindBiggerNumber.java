package com.heraizen.cj.day1;

import java.util.Scanner;

public class FindBiggerNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number num1");
		int number1=sc.nextInt();
		System.out.println("Enter the second number num2");
		int number2=sc.nextInt();
		if(number1>number2) {
			System.out.println("The bigger of the two numbers entered ("+number1+" and "+number2+") is:"+number1);
		}else {
			System.out.println("The bigger of the two numbers entered ("+number1+" and "+number2+") is:"+number2);
		}
		sc.close();
	}

}
