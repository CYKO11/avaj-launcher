package com.avaj.simulator;

public abstract class Tower extends WeatherTower {
    Flyable obervers;

    public void register(Flyable flyable){}
    public void unregister(Flyable flyable){}
    protected void conditionsChanged(){}
}