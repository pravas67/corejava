package com.heraizen.cj.day7.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		try {
			Employee e=new Employee(1001, "Pravas", 2.2f);
			System.out.println("try......"+e);
		} catch (IllegalAccessException e) {
			System.out.println("catch......"+e);
			e.printStackTrace();
		}

	}

}
