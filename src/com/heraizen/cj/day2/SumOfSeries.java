package com.heraizen.cj.day2;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num =sc.nextInt();
		double sum=1;
		System.out.print("The series sum is:"+(int)sum);
		for(double i=2;i<=num;i++) {
			System.out.print("+"+1+"/"+(int)i);
			sum+=1/i;
		}
		System.out.print("="+sum);
		sc.close();
	}

}
