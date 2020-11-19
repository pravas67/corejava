package com.heraizen.cj.day5;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee empObj = new Employee();
		empObj.setId(1001);
		empObj.setName("Pravas");
		empObj.setSalary(18000f);
		System.out.println(empObj);
	}
}
