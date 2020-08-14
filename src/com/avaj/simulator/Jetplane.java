package com.avaj.simulator;

public class Jetplane extends Aircraft implements Flyable {
	private WeatherTower weathertower;

	Jetplane(String name, Coordinates coordinates){
		super(name, coordinates);
	}

	public void updateConditions(){
		
	}

	public void registerTower(WeatherTower weathertower){

	}
}