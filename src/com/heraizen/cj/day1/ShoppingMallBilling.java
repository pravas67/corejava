package com.heraizen.cj.day1;

import java.util.Scanner;

public class ShoppingMallBilling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bill amount:");
		double amount =sc.nextDouble();
		System.out.println("Do you have a membership card?(Y/N)");
		char c=sc.next().charAt(0);
		if(Character.toLowerCase(c)=='y') {
			System.out.println("Thank you! Your total bill amount is Rs "+amount+", discount is Rs "+(amount*.1)+" and net amount payable is Rs "+(amount-=amount*.1));
		}else if(Character.toLowerCase(c)=='n') {
			System.out.println("Thank you! Your total bill amount is Rs "+amount+", discount is Rs "+(amount*.03)+" and net amount payable is Rs "+(amount-=amount*.03));
		}else {
			System.out.println("sorry! you enter a wrong character");
		}
		sc.close();
	}

}
