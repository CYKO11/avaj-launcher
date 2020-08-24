package com.avaj.simulator;

public class Jetplane extends Aircraft implements Flyable {
	private WeatherTower weatherTower;

	Jetplane(String name, Coordinates coordinates){
		super(name, coordinates);
		// return super;
	}

	public void test(){
		System.out.println("Jetplane present");
	}

	public void updateConditions(){
		String currentWeather = weatherTower.getWeather(this.coordinates);
		int lat = this.coordinates.getLatitude();
		int lon = this.coordinates.getLongitude();
		int height = this.coordinates.getHeight();
		Simulator.fileOutput = Simulator.fileOutput + "Jetplane#" + this.name + "(" + this.id + ")";
		if (currentWeather == "Sun"){
			lat += 10;
			height += 2;
			if (height > 100)
				height = 100;
			Simulator.fileOutput = Simulator.fileOutput + " This is your captin speaking, please bring me some water its bloody hot in here\n";
		}
		else if (currentWeather == "Fog"){
			lat += 1;
			Simulator.fileOutput = Simulator.fileOutput + " well idk whats in front of us but I really hope its not another plane\n";
		}
		else if (currentWeather == "Snow"){
			height -= 7;
			if (height <= 0){
				this.weatherTower.unregister(this);
				Simulator.fileOutput = Simulator.fileOutput + " Landing\n";
				return ;
			} else {
				Simulator.fileOutput = Simulator.fileOutput + " I think elsa is on a rampage again\n";
			}
		}
		else if (currentWeather == "Rain"){
			lat += 5;
			Simulator.fileOutput = Simulator.fileOutput + "  This is your captain speaking PUT SOME ANIME FOR THIS PERFECT NETFLIX WEATHER\n";
		}
		this.coordinates = new Coordinates(lon , lat , height);
	}

	public void registerTower(WeatherTower weatherTower){
		this.weatherTower = weatherTower;
		weatherTower.register(this);
	}
}