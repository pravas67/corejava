package com.heraizen.cj.day2;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and column:");
		int n =sc.nextInt();
		System.out.println("Enter value to get pattern:");
        int value = sc.nextInt();
        int sum=0;
        for (int i = 1; i <=n; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                System.out.print((sum+=value)+" ");
            }
            System.out.println();
        }
		sc.close();	
	}

}
