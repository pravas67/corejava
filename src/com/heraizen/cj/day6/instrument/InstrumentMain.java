package com.heraizen.cj.day6.instrument;

import java.util.concurrent.ThreadLocalRandom;

public class InstrumentMain {
	static Instrument[] arr = new Instrument[10];

	public static void main(String[] args) {
		Instrument piano = new Piano();
		System.out.println(piano.play());
		Instrument guitar = new Guitar();
		System.out.println(guitar.play());
		Instrument flute = new Flute();
		System.out.println(flute.play());
		for (int i = 0; i < 10; i++) {
			int a = ThreadLocalRandom.current().nextInt(1, 4);
			if (a == 0) {
				arr[i] = new Piano();
			}
			if (a % 3 == 0) {
				arr[i] = new Piano();
			} else if (a % 3 == 1) {
				arr[i] = new Guitar();
			} else {
				arr[i] = new Flute();
			}
		}
		for (Instrument instru : arr) {
//			System.out.println(instru.getClass().getSimpleName());
			System.out.println(instru.play());
		}

	}

}
