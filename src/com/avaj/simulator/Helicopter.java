package com.avaj.simulator;

import java.io.File;
import java.io.IOException;

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
		int lat = this.coordinates.getLatitude();
		int lon = this.coordinates.getLongitude();
		int height = this.coordinates.getHeight();
		Simulator.fileOutput = Simulator.fileOutput + "Helicopter#" + this.name + "(" + this.id + ")";
		if (currentWeather == "Sun"){
			lon += 10;
			height += 2;
			if (height > 100)
				height = 100;
			Simulator.fileOutput = Simulator.fileOutput + " this is jellytots zero one requesting ice cream, chocolate ice cream\n";
		}
		else if (currentWeather == "Fog"){
			lon += 1;
			Simulator.fileOutput = Simulator.fileOutput + " im legally blaand\n";
		}
		else if (currentWeather == "Snow"){
			height -= 12;
			if (height <= 0){
				this.weatherTower.unregister(this);
				Simulator.fileOutput = Simulator.fileOutput + " Landing\n";
				return ;
			} else {
				Simulator.fileOutput = Simulator.fileOutput + " private make me coffee , two sugars\n";
			}
		}
		else if (currentWeather == "Rain"){
			lon += 5;
			Simulator.fileOutput = Simulator.fileOutput + " its raining its pouring\n";
		}
		this.coordinates = new Coordinates(lon , lat , height);
	}

	public void registerTower(WeatherTower weatherTower){
		this.weatherTower = weatherTower;
		weatherTower.register(this);
	}
}