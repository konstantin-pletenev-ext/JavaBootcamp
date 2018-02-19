package sef.module17.activity.Animals;

public class Cat extends Animal {
	String color;

	public Cat(String colorOfEyes, int noOfLegs, String color) {
		super(colorOfEyes, noOfLegs);
		this.color = color;
	}

	@Override
	public void run() {
		System.out.println("This is a cat running");
	}

	@Override
	public void sleep() {
		System.out.println("This is a cat sleep all day long");
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
}
