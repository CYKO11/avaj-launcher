package com.avaj.simulator;

public class Helicopter extends Aircraft implements Flyable {
	private WeatherTower weathertower;

	Helicopter(String name, Coordinates coordinates){
		super(name, coordinates);
	}

	public void updateConditions(){
		
	}

	public void registerTower(WeatherTower weathertower){

	}
}