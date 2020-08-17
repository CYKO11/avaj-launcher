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
		System.out.print("Ball " + lat + " " + lon + " " + height +  " > ");
		if (currentWeather == "Sun"){
			lon += 2;
			height += 4;
		}
		else if (currentWeather == "Fog"){
			lon += 3;
		}
		else if (currentWeather == "Snow"){
			height -= 15;
			if (height > 100)
				height = 100;
			else if (height <= 0){
				// unregister plane
				System.out.println(" land");
				return ;
			}
		}
		else if (currentWeather == "Rain"){
			lon += 5;
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
