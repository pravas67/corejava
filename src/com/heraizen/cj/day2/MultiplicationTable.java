package com.heraizen.cj.day2;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to generate its multiplication table:");
		int num =sc.nextInt();
		System.out.println("Multiplication table for "+num+" is :");
		for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
		sc.close();
	}

}
