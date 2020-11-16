package com.heraizen.cj.day2;

import java.util.Scanner;

public class CubeSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num =sc.nextInt();
		double sum=1;
		for(double i=2;i<=num;i++) {
			sum+=Math.pow(i, 3);
		}
		System.out.println("the sum is: "+sum);
		sc.close();

	}

}
