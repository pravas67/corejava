package com.heraizen.cj.day2;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
        int n=sc.nextInt();
        reverseNumber(n);
        sc.close();
	}
	static void reverseNumber(int n) {
		int rev=0;
		while(n>0) {
			  int temp=n%10;
			  rev=rev*10+temp;
			  n=n/10;
		}
		System.out.println("Reverse of the entered number is "+rev);
	}
}
