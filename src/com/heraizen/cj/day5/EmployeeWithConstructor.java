package com.heraizen.cj.day5;

public class EmployeeWithConstructor {

	public static void main(String[] args) {
		System.out.println("Employee with 2 parameter");
		EmployeeNew e1=new EmployeeNew(1001,"Anu");
		e1.display();
		System.out.println();
		System.out.println("Employee with 3 parameter");
		EmployeeNew e2=new EmployeeNew(1001,"Lucy",35000);
		e2.display();

	}

}

class EmployeeNew {
	private int id;
	private String name;
	private float salary;

	EmployeeNew(int id, String name) {
		this.id = id;
		this.name = name;
		this.salary = 20000;
	}

	EmployeeNew(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Employee id: "+this.id);
		System.out.println("Employee name: "+this.name);
		System.out.println("Employee salary: "+this.salary);
	}
}
