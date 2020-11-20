package com.heraizen.cj.day7.emp;

public class EmpMain {

	public static void main(String[] args) {
		Emp emp=new Emp(1001, "pravas", "Manager", 1200, 12);
		System.out.println(emp);
		emp.printDET();
		System.out.println(emp.calculateHRA());

	}

}
