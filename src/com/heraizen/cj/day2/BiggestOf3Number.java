package com.heraizen.cj.day2;

import java.util.Scanner;

public class BiggestOf3Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int x = s.nextInt();
        System.out.print("Enter the second number:");
        int y = s.nextInt();
        System.out.print("Enter the third number:");
        int z = s.nextInt();
        if(x > y && x > z)
        {
            System.out.println("The biggest of the 3 numbers entered is:"+x);
        }
        else if(y > z)
        {
            System.out.println("The biggest of the 3 numbers entered is:"+y);
        }
        else
        {
            System.out.println("The biggest of the 3 numbers entered is:"+z);
        }

		s.close();
	}

}
