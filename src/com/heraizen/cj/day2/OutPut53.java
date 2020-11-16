package com.heraizen.cj.day2;

import java.util.Scanner;

public class OutPut53 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        printPattern(n);
        sc.close();
	}
	static void printPattern(int n) {
		int num=n;
		for(int i=1;i<=num;i++) {
			
			for(int j=1 ; j<=num ; j++ ) {
				if(i!=j) {
				System.out.println(i+" "+j);
				}
			
			}
			
		}
	}
}
