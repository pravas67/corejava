package com.heraizen.cj.day5;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		digitCount(s);
		sc.close();
	}

	public static void digitCount(String s) {
		System.out.println(s.length());
		s = s.toLowerCase();
		int charCount = 0;
		int digitCount = 0;
		int whiteSpaceCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				charCount++;
			else if (s.charAt(i) == ' ')
				whiteSpaceCount++;
		}
		digitCount=s.length()-(charCount+whiteSpaceCount);
		System.out.println("Total letters are " + charCount);
		System.out.println("Total digits are " + digitCount);
		System.out.println("Total white spaces are " + whiteSpaceCount);
	}

}
