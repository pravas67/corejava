package com.heraizen.cj.day5;

import java.util.Arrays;

public class StudentAndSubject {
	int id;
	String name;
	int[] subjectMarks;

	public static void main(String[] args) {
		StudentAndSubject student = new StudentAndSubject(1000, "pravas", new int[] { 88, 96, 76, 92, 97 });
		student.display();
		student.calculateSum(student);
	}

	StudentAndSubject(int id, String name, int[] subjectMarks) {
		this.id = id;
		this.name = name;
		this.subjectMarks = subjectMarks;
	}

	void calculateSum(StudentAndSubject student) {
		int[] arr = student.getSubjectMarks();
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		System.out.println("Total Marks: " + sum);
	}

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	int[] getSubjectMarks() {
		return subjectMarks;
	}

	void display() {
		System.out.println("id:"+this.getId() + ", name:" + this.getName() + ", marks:" + Arrays.toString(this.getSubjectMarks()));
	}
}
