package com.avaj.simulator;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;

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
        List<Flyable> dupObservers = new ArrayList<>();
        dupObservers.addAll(observers);
        for(Flyable flyable : dupObservers){
            flyable.updateConditions();
        }
    }
}