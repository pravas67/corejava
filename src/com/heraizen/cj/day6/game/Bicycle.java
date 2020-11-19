package com.heraizen.cj.day6.game;

public class Bicycle implements Game {

	@Override
	public String start() {
		
		return "Bicycle start";
	}

	@Override
	public String play() {
		return "Bicycle play";

	}

	@Override
	public String stop() {
		return "Bicycle stop";

	}

}
