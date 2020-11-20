package com.heraizen.cj.day7.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee=null;
		try {
			 employee=new Employee(1001, "Pravas", 2.2f);
			System.out.println("try......"+employee);
		} catch (LessEmployeeExperienceException e) {
			System.out.println("catch......"+employee);
			e.printStackTrace();
		}

	}

}
