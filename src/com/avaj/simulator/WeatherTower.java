package com.avaj.simulator;

import java.util.*;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates){
        String[] weatherOptions = {"Rain","Fog","Sun","Snow"};
        return weatherOptions[(int)(Math.random()*((3-0)+1))+0];
    }

    void changeWeather(){
        this.conditionsChanged();
    }
}