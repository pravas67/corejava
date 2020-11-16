package com.heraizen.cj.day3;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArrayOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows of multidimensional array");
		int row = sc.nextInt();
		System.out.println("Enter columns of multidimensional array");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the no for position" + i + "," + j);
				int no = sc.nextInt();
				arr[i][j] = no;
			}

		}
		System.out.println("The sum of the matrix is: " + findSum(arr));
		System.out.println("The biggest elemet of the matrix is: " + biggestElemet(arr));
		System.out.println("The diagonal sum of the matrix is: " + diagonalSum(arr));
		System.out.println("The transpose of the matrix is: " + Arrays.toString(transpose(arr, row, col)));
		sc.close();
	}

	private static int findSum(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	private static int biggestElemet(int[][] arr) {
		int max = arr[0][0];
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	private static int diagonalSum(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j)
					sum += arr[i][j];
			}
		}
		return sum;
	}

	private static int[][] transpose(int[][] arr, int row, int col) {
		int[][] newArr = new int[col][row];
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				newArr[i][j] = arr[j][i];
		return newArr;
	}
}
