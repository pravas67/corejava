package com.heraizen.cj.day2;

import java.util.Scanner;

public class SeriesAndSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num =sc.nextInt();
		int sum=0;
		System.out.print("The series is:");
		for(int i=1;i<=num;i+=2) {
			System.out.print(i+",");
			sum+=i;
		}
		System.out.println();
		System.out.println("The sum is "+sum);
		sc.close();
	}

}
