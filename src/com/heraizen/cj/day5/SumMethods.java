package com.heraizen.cj.day5;

public class SumMethods {

	public static void main(String[] args) {
		System.out.println("The sum of 10 and 20 is :" + sum(10, 20));
		System.out.println("The sum of 30, 40 and 50 is :" + sum(30, 40, 50));
	}

	public static int sum(int...a) {
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		return sum;
	}

}
