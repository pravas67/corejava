package com.heraizen.cj.day2;

import java.util.Scanner;

public class Pattern15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        printPattern(n);
        sc.close();
	}
	static void printPattern(int n) {
		int a=1;
		for(int i=n;i>=1;i--) {
			
			for(int j=1 ; j<=i ; j++ ) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
			
		}
	}
}
