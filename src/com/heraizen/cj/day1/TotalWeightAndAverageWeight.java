package com.heraizen.cj.day1;

import java.util.Scanner;

public class TotalWeightAndAverageWeight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weight of the first person:");
		double weight1 =sc.nextDouble();
		System.out.println("Enter the weight of the second person:");
		double weight2 =sc.nextDouble();
		System.out.println("Enter the weight of the third person:");
		double weight3 =sc.nextDouble();
		double sum=weight1+weight2+weight3;
		double avgrageWeight=sum/3;
		System.out.println("The sum of weight of the "+3+" person is "+sum+" Kgs and the average weight is "+avgrageWeight+" Kgs.");
		sc.close();

	}

}
