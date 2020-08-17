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
		System.out.print("Jet " + lat + " " + lon + " " + height +  " > ");
		if (currentWeather == "Sun"){
			lat += 10;
			height += 2;
		}
		else if (currentWeather == "Fog"){
			lat += 1;
		}
		else if (currentWeather == "Snow"){
			height -= 7;
			if (height > 100)
				height = 100;
			else if (height <= 0){
				// unregister plane
				System.out.println(" land");
				return ;
			}
		}
		else if (currentWeather == "Rain"){
			lat += 5;
		}
		System.out.print(lat + " " + lon + " " + height);
		System.out.println();
		this.coordinates = new Coordinates(lon , lat , height);
	}

	public void registerTower(WeatherTower weatherTower){
		this.weatherTower = weatherTower;
		weatherTower.register(this);
	}
}