package com.heraizen.cj.day1;

import java.util.Scanner;

public class CalculateBilling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the billing amount:");
		double billingAmount=sc.nextDouble();
		if(billingAmount>6000) {
			billingAmount-=(billingAmount*0.1f);
		}
		System.out.println("Your net billing amount: "+billingAmount);
		sc.close();

	}

}
