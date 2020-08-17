package com.avaj.simulator;

import java.util.*;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates){
        // WeatherProvider fucker = WeatherProvider.getProvider();
        // String currentWeather = fucker.getCurrentWeather(coordinates);
        // return currentWeather;
        String[] cancer = {"Rain","Fog","Sun","Snow"};
        return cancer[(int)(Math.random()*((3-0)+1))+0];
    }

    void changeWeather(){
        System.out.println("changing weather");
        this.conditionsChanged();
    }
}