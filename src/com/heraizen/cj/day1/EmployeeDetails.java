package com.heraizen.cj.day1;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the empno:");
		int empNo =sc.nextInt();
		System.out.println("Enter the employee name:");
		String empName =sc.nextLine();
		System.out.println("Enter the monthly salary");
		double monthlySalary =sc.nextDouble();
		System.out.println("Hi "+empName+"! Your employee id is "+empNo+", monthly salary is Rs "+monthlySalary+" and yearly salary is Rs "+monthlySalary*12+".");
		sc.close();

	}

}
