package com.avaj.simulator;

public class Baloon extends Aircraft implements Flyable {
	private WeatherTower weatherTower;

	Baloon(String name, Coordinates coordinates){
		super(name, coordinates);
		// return super;
	}

	public void test(){
		System.out.println("Baloon present");
	}

	public void updateConditions(){
		String currentWeather = weatherTower.getWeather(this.coordinates);
		System.out.print(this.coordinates.getLatitude() + " ");
        System.out.print(this.coordinates.getLongitude() + " ");
        System.out.print(this.coordinates.getHeight() + " ");
		System.out.print(this.name + "\t ");
		if (currentWeather == "Sun"){
			System.out.print("lo + 2 , H + 4 \t\tSUN");
		}
		else if (currentWeather == "Fog"){
			System.out.print("lo - 3 \t\t\tFOG");
		}
		else if (currentWeather == "Snow"){
			System.out.print("H - 15 \t\t\tSNOW");
		}
		else if (currentWeather == "Rain"){
			System.out.print("lo - 5 \t\t\tRAIN");
		}
		System.out.println();
	}

	public void registerTower(WeatherTower weatherTower){
		this.weatherTower = weatherTower;
		weatherTower.register(this);
	}
}
