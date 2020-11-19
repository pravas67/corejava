package com.heraizen.cj.day6.instrument;

public class InstrumentMain {
	static Instrument[] arr = new Instrument[10];

	public static void main(String[] args) {
		Instrument piano = new Piano();
		System.out.println(piano.play());
		Instrument guitar = new Guitar();
		System.out.println(guitar.play());
		Instrument flute = new Flute();
		System.out.println(flute.play());
		Instrument piano2 = new Piano();
		Instrument guitar2 = new Guitar();
		Instrument flute2 = new Flute();
		Instrument piano3 = new Piano();
		Instrument guitar3 = new Guitar();
		Instrument flute3 = new Flute();
		Instrument piano4 = new Piano();
		arr = new Instrument[] { piano, guitar, flute, piano2, guitar2, flute2, piano3, guitar3, flute3, piano4 };
		for (Instrument instru : arr) {
			System.out.println(instru.getClass().getSimpleName());
			System.out.println(instru.play());
		}

	}

}
