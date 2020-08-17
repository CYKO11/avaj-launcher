package com.avaj.simulator;

public class Helicopter extends Aircraft implements Flyable {
	private WeatherTower weathertower;

	Helicopter(String name, Coordinates coordinates){
		super(name, coordinates);
		// return super;
	}

	public void test(){
		System.out.println("helicopter present");
	}

	public void updateConditions(){
		
	}

	public void registerTower(WeatherTower weathertower){

	}
}