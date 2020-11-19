package com.heraizen.cj.day5;


public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(1001, "Pravas", "BBSr");
		Student s2 = new Student(1002, "Subash", "Ctc");
		Student s3 = new Student(1003, "Manu", "Bls");
		Student s4 = new Student(1004, "Muna", "Kp");
		Student s5 = new Student(1005, "Lucy", "Bhadrak");

		Student[] stdArr = new Student[] { s1, s2, s3, s4, s5 };
		Student stdObj = new Student();
		for (Student s : stdArr) {
			stdObj.displayStudentDetails(s);
		}
		System.out.println("Total object created " + Student.noOfObjectCreated);
	}

}
