package com.heraizen.cj.day2;

import java.util.Scanner;

public class FindPower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
        int m=sc.nextInt();
        System.out.println("Enter second Number");
        int n=sc.nextInt();
        findPower(m,n);
        sc.close();
	}
	static void findPower(int num1, int num2) {
		int m=num1;
		int n=num2;
		 int res=1;
		for(int i=1; i<=n; i++) {
		  res *=m;
		}
		System.out.println(" "+res);
	}
}
