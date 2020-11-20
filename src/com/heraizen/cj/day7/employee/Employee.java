package com.heraizen.cj.day7.employee;

public class Employee {
	int empNumber;
	String name;
	float exp;

	Employee(int empNumber, String name, float exp) throws LessEmployeeExperienceException {
		if (exp > 2.5 && exp < 3.6) {
			this.empNumber = empNumber;
			this.name = name;
			this.exp = exp;

		} else {
			throw new LessEmployeeExperienceException();
		}
	}

	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", name=" + name + ", exp=" + exp + "]";
	}
}
