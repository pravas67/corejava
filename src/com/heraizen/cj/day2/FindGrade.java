package com.heraizen.cj.day2;

import java.util.Scanner;

public class FindGrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks scored in 1st subject:");
		double subject1 =sc.nextDouble();
		System.out.println("Enter the marks scored in 2nd subject:");
		double subject2 =sc.nextDouble();
		System.out.println("Enter the marks scored in 3rd subject:");
		double subject3 =sc.nextDouble();
		double total=subject1+subject2+subject3;
		double average=total/3;
		System.out.println("Total marks:"+total);
		System.out.println("Average is:"+average);
		if(average<35) {
			System.out.println("Grade: "+"C");
		}else if(average>=35 && average<60) {
			System.out.println("Grade: "+"B");
		}else {
			System.out.println("Grade: "+"A");
		}
		sc.close();

	}

}
