package com.heraizen.cj.day6.currency;

import java.util.Scanner;

public class CurrencyContainer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the country name to get current currency.");
		String cName = sc.nextLine();
		Currency obj = getCurrency(cName);

		System.out.println(obj.getCurrenct());
		sc.close();
	}

	public static Currency getCurrency(String name) {
		name = name.toLowerCase();
		if (name == "india") {
			return new India();
		} else if (name == "uk") {
			return new Uk();
		} else if (name == "usa") {
			return new Usa();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
