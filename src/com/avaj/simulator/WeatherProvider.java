package com.avaj.simulator;

public class WeatherProvider {
    private static WeatherProvider weatherProvider = new WeatherProvider();
    private static String[] weather = {"Rain","Fog","Sun","Snow"};

    private WeatherProvider(){

    }

    public static WeatherProvider getProvider(){
        return weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates){
        return weather[(int)(Math.random()*((3-0)+1))+0];
    }
}