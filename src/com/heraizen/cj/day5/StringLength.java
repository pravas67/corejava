package com.heraizen.cj.day5;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.println("lenth of the string is " + s.length());
		System.out.println("String in uppercase " + s.toUpperCase());
		System.out.println("String in lower case " + s.toLowerCase());
		if (isPalindrome(s)) {
			System.out.println("palindrom");
		} else {
			System.out.println("Not palindrom");
		}
		System.out.println("Number of vowel and consonants are ");

		sc.close();

	}

	static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	static void vowelConsonantCount(String s) {
		char[] charArr = s.toLowerCase().toCharArray();
		int vowelCount = 0;
		int consonantCount = 0;
		for (char ch : charArr) {
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelCount++;
				break;
			default:
				consonantCount++;
			}
		}
		System.out.println("No. of vowels are "+vowelCount);
		System.out.println("No. of consonant count are "+consonantCount);
	}

}
