package com.heraizen.cj.day2;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        printPattern(n);
        sc.close();
	}
	static void printPattern(int n) {
		int a;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1 ; j<=n ; j++ ) {
				if(i==j) {
					a=19;
				}else {
					a=0;
				}
				System.out.print(a+" ");
			}
			System.out.println();
			
		}
	}

}
