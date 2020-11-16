package com.heraizen.cj.day1;

import java.util.Scanner;

public class NegativeToPositive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		System.out.println("The result is: "+Math.abs(number));
		sc.close();

	}

}
