package com.heraizen.cj.day5;

public class Student {
	int id;
	String name;
	String address;
	static int noOfObjectCreated = 0;
	public Student() {
		
	}
	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	{
		noOfObjectCreated++;
	}

	public void displayStudentDetails(Student student) {
		System.out.format("%-10d%-20s%-20s%n", student.id, student.name, student.address);
	}
}
