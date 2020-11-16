package com.heraizen.cj.day3;

import java.util.Arrays;

public class ArrayDataInsertion {

	public static void main(String[] args) {
		 int A[]={1,3,2,4,5,6,4,5,7,3,2,3,4,7,2,0,0,0};
		 int sum=SumOfElementsInArray.sumOfElementsInArray(A);
		 A[15]=sum;
		 A[16]=sum/A.length;
		 A[17]=BiggestAndSmallestNumber.smallest(A);
		 System.out.println("The array is:"+Arrays.toString(A));
	}

}
