package com.avaj.simulator;

import java.util.*;

public abstract class Tower {
    private List<Flyable> observers = new ArrayList<>(); 

    public void register(Flyable flyable){
        observers.add(flyable);
        //do some shit
    }

    public void unregister(Flyable flyable){
        observers.remove(flyable);
        //do some shit
    }

    protected void conditionsChanged(){
        for(Flyable flyable : observers){
            flyable.updateConditions();
        }
    }
}