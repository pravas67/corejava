package com.heraizen.cj.day5;

import java.util.Scanner;

public class StringSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.println("Enter a string to search in above string");
		String key = sc.nextLine();
		if (searchString(s, key)) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
		sc.close();
	}

	public static boolean searchString(String s, String key) {
		return s.contains(key);
	}

}
