package com.avaj.simulator;

public class Baloon extends Aircraft implements Flyable {
	private WeatherTower weathertower;

	Baloon(String name, Coordinates coordinates){
		super(name, coordinates);
		// return super;
	}

	public void test(){
		System.out.println("Baloon present");
	}

	public void updateConditions(){
		
	}

	public void registerTower(WeatherTower weathertower){

	}
}
