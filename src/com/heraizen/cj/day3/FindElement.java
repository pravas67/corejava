package com.heraizen.cj.day3;

import java.util.Scanner;

public class FindElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the no " + (i + 1) + " Value(between 1 to 50)");
			int no = sc.nextInt();
			arr[i] = no;
		}
		System.out
				.println("Enter the no to check the element is present in the array or not. element(between 1 to 50)");
		int key = sc.nextInt();
		sc.close();
		findElement(arr, key);
	}

	private static void findElement(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key) {
				System.out.println("Element is present at position: "+i);
			}else {
				System.out.println("Elemet is not present in the array");
			}
		}
	}

}
