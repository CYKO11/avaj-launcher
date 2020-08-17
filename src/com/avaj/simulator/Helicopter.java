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
		int lat = this.coordinates.getLatitude();
		int lon = this.coordinates.getLongitude();
		int height = this.coordinates.getHeight();
		if (currentWeather == "Sun"){
			lon += 10;
			height += 2;
		}
		else if (currentWeather == "Fog"){
			lon += 1;
		}
		else if (currentWeather == "Snow"){
			height -= 12;
			if (height > 100)
				height = 100;
			else if (height <= 0){
				// unregister plane
				return ;
			}
		}
		else if (currentWeather == "Rain"){
			lon += 5;
		}
		this.coordinates = new Coordinates(lon , lat , height);
	}

	public void registerTower(WeatherTower weatherTower){
		this.weatherTower = weatherTower;
		weatherTower.register(this);
	}
}