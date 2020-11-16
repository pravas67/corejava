package com.heraizen.cj.day1;

import java.util.Scanner;

public class FindSimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		double principal =sc.nextDouble();
		System.out.println("Enter the rate of interest");
		double interestRate =sc.nextDouble();
		System.out.println("Enter the time (years)");
		double year =sc.nextDouble();
		double simpleInterest=(principal*year*interestRate)/100;
		System.out.println("Simple interest is "+simpleInterest);
		sc.close();


	}

}
