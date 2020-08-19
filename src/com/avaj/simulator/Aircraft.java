package com.avaj.simulator;

public abstract class Aircraft {

	protected long id;
	protected String name;
	protected Coordinates coordinates;
	private static long idCounter;

	protected Aircraft(String name, Coordinates coordinates){
		this.name = name;
		this.coordinates = coordinates;
		this.id = nextId();
		Simulator.fileOutput = Simulator.fileOutput + "(" + this.id + ")";
	}

	private long nextId(){
		Aircraft.idCounter++;
		return Aircraft.idCounter;
	}
}
