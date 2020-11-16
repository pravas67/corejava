package com.heraizen.cj.day2;

import java.util.Scanner;

public class SingleDigitSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
        int n=sc.nextInt();
        sumOfDigit(n);
        sc.close();
	}
	static void sumOfDigit(int n) {
		int num=n;
		int sum=0;
		while(num>0 || sum>9) {
			  if(num==0) {
				  num=sum;
				  sum=0;
			  }
			  sum +=num%10; 
			  num=num/10;
			  
		}
		System.out.println("Single digit sum is:"+sum);
	}
}
