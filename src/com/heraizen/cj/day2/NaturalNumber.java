package com.heraizen.cj.day2;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of natural numbers to be generated:");
		int number =sc.nextInt();
		System.out.print("First "+number+" natural numbers are :");
		for(int i=1;i<=number;i++) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
