package com.avaj.simulator;

public abstract class AircraftFactory {
    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height){
        if (type.toLowerCase().equals("baloon"))
            return new Baloon(name, new Coordinates(longitude, latitude, height));
        else if (type.toLowerCase().equals("jetplane"))
            return new Jetplane(name, new Coordinates(longitude, latitude, height));
        else if (type.toLowerCase().equals("helicopter"))
            return new Helicopter(name, new Coordinates(longitude, latitude, height));
        return null;
    }
}