package com.avaj.simulator;

public class Jetplane extends Aircraft implements Flyable {
	private WeatherTower weathertower;

	Jetplane(String name, Coordinates coordinates){
		super(name, coordinates);
		// return super;
	}

	public void test(){
		System.out.println("Jetplane present");
	}

	public void updateConditions(){
		
	}

	public void registerTower(WeatherTower weathertower){

	}
}