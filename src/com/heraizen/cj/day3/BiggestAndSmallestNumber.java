package com.heraizen.cj.day3;

import java.util.Scanner;

public class BiggestAndSmallestNumber {
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
			System.out.println("The biggest number is :" + biggest(arr));
			System.out.println("The smallest number is :" + smallest(arr));
		} else {
			System.out.println("sorry you entered nagative number");
		}
	}

	static int biggest(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	static int smallest(int[] arr) {
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
}
