package com.heraizen.cj.day7.emp;

public class Emp implements EmpSevice {
	private int empId;
	private String empName;
	private String designation;
	private double basic;
	private double hra;

	Emp(int empId, String empName, String designation, double basic, double hra) {
		if (basic < 500) {
			throw new LowSalaryException();
		}
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.basic = basic;
		this.hra = hra;
		calculateHRA();
	}

	public double getHra() {
		return hra;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", basic=" + basic
				+ "]";
	}

	@Override
	public void printDET() {
		System.out.println("Employee Details");
		System.out.println("---------------------");
		System.out.println("Employee id: " + this.empId);
		System.out.println("Employee Name: " + this.empName);
		System.out.println("Employee designation: " + this.designation);
		System.out.println("Employee basic: " + this.basic);
		System.out.println("Employee hra: " + this.hra);

	}

	@Override
	public double calculateHRA() {
		if (this.designation.toLowerCase().equals("manager")) {
			this.hra = this.basic * 0.1;
		}
		if (this.designation.toLowerCase().equals("officer")) {
			this.hra = this.basic * 0.12;
		}
		if (this.designation.toLowerCase().equals("cleck")) {
			this.hra = this.basic * 0.05;
		}
		return this.hra;
	}
}
