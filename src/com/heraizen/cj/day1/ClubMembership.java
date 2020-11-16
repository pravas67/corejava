package com.heraizen.cj.day1;

import java.util.Scanner;

public class ClubMembership {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name:");
			String name=sc.nextLine();
			System.out.println("Enter the mobile number:");
			long mobileNumber=sc.nextLong();
			System.out.println("Enter the age:");
			double age=sc.nextDouble();
			getClubMembership(name,mobileNumber,age);
			sc.close();
	}
	public static void getClubMembership(String name,long mobileNumber,double age) {
		if(age>18) {
			System.out.println("Congratulations Lakshman for your successful registration.");
		}else {
			System.out.println("Sorry! You need to be at least 18 years old to get membership.");
		}
	}

}
