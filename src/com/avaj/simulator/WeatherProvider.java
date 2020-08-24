package com.avaj.simulator;

public class WeatherProvider {
    private static WeatherProvider weatherProvider;
    private static String[] weather;

    private WeatherProvider(){
        this.weatherProvider = this; 
    }

    public static WeatherProvider getProvider(){
        return WeatherProvider.weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates){
        String[] weatherOptions = {"Rain","Fog","Sun","Snow"};
        System.out.println(weatherOptions[1]);
        return weatherOptions[1];
    }
}