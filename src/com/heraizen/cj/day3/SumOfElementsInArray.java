package com.heraizen.cj.day3;

import java.util.Scanner;

public class SumOfElementsInArray {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter any Number");
		int n = sc.nextInt();
		if (n > 0) {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the no " + (i + 1) + " Value");
				int no = sc.nextInt();
				arr[i] = no;
			}
			System.out.println("The sum is :" + sumOfElementsInArray(arr));
		} else {
			System.out.println("sorry you entered nagative number");
		}
		sc.close();
	}

	static int sumOfElementsInArray(int[] arr) {
		int sum = 0;
		for (int j : arr) {
			sum += j;
		}
		return sum;

	}

}
