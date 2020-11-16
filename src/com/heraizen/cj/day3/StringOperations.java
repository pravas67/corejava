package com.heraizen.cj.day3;

import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("The result " + getSmallestAndLargest(s, n));
		System.out.println("Enter first string");
		String a = sc.next();
		System.out.println("Enter second string");
		String b = sc.next();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		sc.close();
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		if (k == s.length()) {
			smallest = s;
			largest = s;
		} else {
			smallest = s.substring(0, k + 1);
			for (int i = 0; i < s.length() - k + 1; i++) {
				if (s.substring(i, i + k).compareTo(smallest) < 0)
					smallest = s.substring(i, i + k);
				if (s.substring(i, i + k).compareTo(largest) > 0)
					largest = s.substring(i, i + k);
			}
		}
		return smallest + "\n" + largest;
	}

	static boolean isAnagram(String a, String b) {
		char[] charArr1 = a.toCharArray();
		char[] charArr2 = a.toCharArray();
		int n1 = charArr1.length;
		int n2 = charArr2.length;
		if (n1 != n2)
			return false;
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		for (int i = 0; i < n1; i++)
			if (charArr1[i] != charArr2[i])
				return false;

		return true;
	}

	static boolean isAnagram2(String a, String b) {
		char[] charArr1 = a.toCharArray();
		char[] charArr2 = a.toCharArray();
		int n1 = charArr1.length;
		int n2 = charArr2.length;
		if (n1 != n2)
			return false;
		for (int i = 0; i < charArr1.length; i++) {
			for (int j = i + 1; j < charArr1.length; j++) {
				if (charArr1[j] < charArr1[i]) {
					char temp = charArr1[i];
					charArr1[i] = charArr1[j];
					charArr1[j] = temp;
				}
			}
		}
		for (int i = 0; i < charArr2.length; i++) {
			for (int j = i + 1; j < charArr2.length; j++) {
				if (charArr2[j] < charArr2[i]) {
					char temp = charArr2[i];
					charArr2[i] = charArr2[j];
					charArr2[j] = temp;
				}
			}
		}
		for (int i = 0; i < n1; i++)
			if (charArr1[i] != charArr2[i])
				return false;

		return true;
	}
}
