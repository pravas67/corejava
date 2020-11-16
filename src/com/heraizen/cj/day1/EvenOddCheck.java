package com.heraizen.cj.day1;

import java.util.Scanner;

public class EvenOddCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		if(number%2==0) {
			System.out.println("The entered number "+number+" is even");
		}else {
			System.out.println("The entered number "+number+" is odd");
		}
		sc.close();
	}

}
