package com.heraizen.cj.day6.game;

public class GameMain {
	static Game[] games = new Game[10];
	static int count = 0;

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			int a=(int) ((Math.random() * (4 - 1)) + 1);
//			System.out.println(a);
			gameArray(a);
		}
		for(Game g:games)
		{
			System.out.println(g.start());
			System.out.println(g.play());
			System.out.println(g.stop());
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
