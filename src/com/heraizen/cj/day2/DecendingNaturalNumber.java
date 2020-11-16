package com.heraizen.cj.day2;

import java.util.Scanner;

public class DecendingNaturalNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of natural numbers to be generated:");
		int number =sc.nextInt();
		System.out.print("First "+number+" natural numbers in descending order are: ");
		for(int i=number;i>=1;i--) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
