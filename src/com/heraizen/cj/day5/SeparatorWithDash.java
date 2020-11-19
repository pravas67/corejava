package com.heraizen.cj.day5;

public class SeparatorWithDash {

	public static void main(String[] args) {
		Person p = new Person("Subash", "ch", "das");
		System.out.println("Full name of the person is " + p.display());

	}

}

class Person {
	String firstName;
	String lastName;
	String middleName;

	Person(String firstName, String lastName, String middleName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}

	public String display() {
		return firstName + "-" + middleName + "-" + lastName;
	}
}
