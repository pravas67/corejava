package com.heraizen.cj.day6.game;

import java.util.concurrent.ThreadLocalRandom;

public class GameMain {
	static Game[] games = new Game[10];
	static int count = 0;

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			int a = ThreadLocalRandom.current().nextInt(1, 4);
			gameArray(a);
		}
		for (Game game : games) {
			System.out.println(game.start());
			System.out.println(game.play());
			System.out.println(game.stop());
		}
	}

	public static void gameArray(int a) {
		switch (a) {
		case 1:
			games[count++] = new Car();
			break;
		case 2:
			games[count++] = new Bike();
			break;
		case 3:
			games[count++] = new Bicycle();
			break;
		}

	}

}
