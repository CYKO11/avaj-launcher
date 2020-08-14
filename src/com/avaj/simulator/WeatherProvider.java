package com.avaj.simulator;

public class WeatherProvider {
    private static WeatherProvider weatherProvider;
    private static String[] weather;

    private WeatherProvider(){}
    public static WeatherProvider getProvider(){
        return null;
    }
    public String getCurrentWeather(Coordinates coordinates){
        return "warm ish";
    }
}