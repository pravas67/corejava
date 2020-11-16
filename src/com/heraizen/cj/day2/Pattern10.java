package com.heraizen.cj.day2;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        printPattern(n);
        sc.close();
	}
	static void printPattern(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=1 ; j<=n ; j++ ) {
				if(i==1) {
				System.out.print("*"+" ");
				}
				else if(i>1 && i<n && j==(n/2+1)) {
					System.out.print("*"+" ");
				}
				else if(i==n) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		}

}
