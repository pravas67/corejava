package com.heraizen.cj.day2;

import java.util.Scanner;

public class PrimeDigitCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
        int n=sc.nextInt();
        countPrimeDigits(n);
        sc.close();
	}
	static void countPrimeDigits(int n) {
		int num=n;
		int count=0;	
		while(num>0) {
			boolean flag;
			  int temp=num%10;
			  if (temp == 1 || temp == 0) {
	            	break;
	            }
	            flag = true;
	 
	            for (int i = 2; i<= temp / 2; i++) {
	                if (temp % i== 0) {
	                    flag = false;
	                    break;
	                }
	            }
	            if (flag == true) {
	               count++;
	            }
			  num=num/10;
		}
		System.out.println("Number of prime digits in the entered number is "+count);
	}
}
