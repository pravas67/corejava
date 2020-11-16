package com.heraizen.cj.day2;

import java.util.Scanner;

public class FactorialUsingWhileLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
        int n=sc.nextInt();
        calculateFactorial(n);
        sc.close();
	}
	static void calculateFactorial(int n) {
		int num=n;
		int res=1;
		while(num>0) {
			res=res*num;
			num--;
		}
		System.out.println("The Factorial is "+res);
	}
}
