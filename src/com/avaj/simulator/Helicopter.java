package com.avaj.simulator;

public class Helicopter extends Aircraft implements Flyable {
	private WeatherTower weatherTower;

	Helicopter(String name, Coordinates coordinates){
		super(name, coordinates);
		// return super;
	}

	public void test(){
		System.out.println("helicopter present");
	}

	public void updateConditions(){
		String currentWeather = weatherTower.getWeather(this.coordinates);
		System.out.print(this.coordinates.getLatitude() + " ");
        System.out.print(this.coordinates.getLongitude() + " ");
        System.out.print(this.coordinates.getHeight() + " ");
		System.out.print(this.name + "\t ");
		if (currentWeather == "Sun"){
			System.out.print("lo + 10 , H + 2 \t\tSUN");
		}
		else if (currentWeather == "Fog"){
			System.out.print("lo + 1 \t\t\tFOG");
		}
		else if (currentWeather == "Snow"){
			System.out.print("H - 12 \t\t\tSNOW");
		}
		else if (currentWeather == "Rain"){
			System.out.print("lo + 5 \t\t\tRAIN");
		}
		System.out.println();
	}

	public void registerTower(WeatherTower weatherTower){
		this.weatherTower = weatherTower;
		weatherTower.register(this);
	}
}