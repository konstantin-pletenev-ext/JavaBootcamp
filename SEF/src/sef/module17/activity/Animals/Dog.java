package sef.module17.activity.Animals;

public class Dog extends Animal {

	String breed;

	public Dog(String colorOfEyes, int noOfLegs, String breed) {
		super(colorOfEyes, noOfLegs);
		this.breed = breed;
	}

	public void run() {
		System.out.println("This is a dog running");
	}

	@Override
	public void sleep() {
		System.out.println("This is a dog, and the a sleep only at night");
	}

}
