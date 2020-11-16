package com.heraizen.cj.day2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the upper bound number to generate the Fibonacci numbers:");
		int n =sc.nextInt();
		int num1 = 0, num2 = 1; 
        int counter = 0; 
		System.out.print("Fibonacci series up to the entered number is: ");
        while (counter < n) { 
            System.out.print(num1 + " "); 
            int num3 = num2 + num1; 
            num1 = num2; 
            num2 = num3; 
            counter = counter + 1; 
        }
		sc.close();
	}

}
