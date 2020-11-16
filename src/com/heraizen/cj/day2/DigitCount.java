package com.heraizen.cj.day2;

import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        numberOfDigit(n);
        sc.close();
	}
	static void numberOfDigit(int n) {
		int count=0;
		while(n>0) {
			  n=n/10;
			 count++;
		}
		System.out.println("Number Of digit is "+count);
	}
}
