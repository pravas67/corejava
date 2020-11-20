package com.heraizen.cj.day6.currency;

import java.util.Scanner;

public class CurrencyContainer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the country name(INDIA,UK,USA) to get current currency.");
		String countryName = sc.nextLine();
		Currency obj = getCurrency(countryName.toLowerCase());

		System.out.println(obj.getCurrenct().toUpperCase());
		sc.close();
	}

	public static Currency getCurrency(String name) {
		if (name.equals("india")) {
			return new India();
		} else if (name.equals("uk")) {
			return new Uk();
		} else if (name.equals("usa")) {
			return new Usa();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
