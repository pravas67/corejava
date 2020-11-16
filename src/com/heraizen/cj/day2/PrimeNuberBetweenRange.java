package com.heraizen.cj.day2;

import java.util.Scanner;

public class PrimeNuberBetweenRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower bound value:");
		int lower =sc.nextInt();
		System.out.println("Enter the upper bound value:");
		int upper =sc.nextInt();
		System.out.print("The prime numbers between "+lower+" and "+upper+" are:");
		for (int i = lower; i <= upper; i++) {
            if (i == 1 || i == 0)
                continue;
           int flag = 1;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
            	System.out.print(i+" ");
        }
		sc.close();
	}

}
