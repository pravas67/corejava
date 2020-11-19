package com.heraizen.cj.day6.game;

public class Car implements Game {

	@Override
	public String start() {
		return "Car start";

	}

	@Override
	public String play() {
		
		return "Car paly";
	}

	@Override
	public String stop() {
			
		return "Car stop";
	}

}
