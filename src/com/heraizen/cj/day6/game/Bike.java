package com.heraizen.cj.day6.game;

public class Bike implements Game{

	@Override
	public String start() {
		return "Bike start";
		
	}

	@Override
	public String play() {
		return "Bike play";
		
	}

	@Override
	public String stop() {
		return "Bike stop";
		
	}

}
