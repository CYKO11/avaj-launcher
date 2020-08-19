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
		int lat = this.coordinates.getLatitude();
		int lon = this.coordinates.getLongitude();
		int height = this.coordinates.getHeight();
		Simulator.fileOutput = Simulator.fileOutput + "baloon#" + this.name + "(" + this.id + ")";
		if (currentWeather == "Sun"){
			lon += 2;
			height += 4;
			if (height > 100)
				height = 100;
			Simulator.fileOutput = Simulator.fileOutput + " \n";
		}
		else if (currentWeather == "Fog"){
			lon += 3;
			Simulator.fileOutput = Simulator.fileOutput + " \n";
		}
		else if (currentWeather == "Snow"){
			height -= 15;
			if (height <= 0){
				this.weatherTower.unregister(this);
				Simulator.fileOutput = Simulator.fileOutput + " Landing\n";
				return ;
			} else {
				Simulator.fileOutput = Simulator.fileOutput + " \n";
			}
		}
		else if (currentWeather == "Rain"){
			lon += 5;
			Simulator.fileOutput = Simulator.fileOutput + " \n";
		}
		this.coordinates = new Coordinates(lon , lat , height);
	}

	public void registerTower(WeatherTower weatherTower){
		this.weatherTower = weatherTower;
		weatherTower.register(this);
	}
}
