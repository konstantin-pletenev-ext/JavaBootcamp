package sef.module17.activity.Animals;

public abstract class Animal {
	//Member Variables
	private String colorOfEyes;
	private int noOfLegs;

	public abstract void run();

	public abstract void sleep();

	public Animal(String colorOfEyes, int noOfLegs) {
		this.colorOfEyes = colorOfEyes;
		this.noOfLegs = noOfLegs;
	}

	
}

