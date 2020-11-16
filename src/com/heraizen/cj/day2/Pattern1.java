package com.heraizen.cj.day2;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n =sc.nextInt();
        int value = 1;
        for (int i = 1; i <n; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
        }
		sc.close();
	}

}
