package sef.module14.activity;
// Complete Code
public abstract class Animal {
	//Member Variables
	protected String colorOfEyes;
	protected int noOfLegs;
	
	public abstract void run();
	
	public Animal(String colorOfEyes, int noOfLegs)
	{
		this.colorOfEyes=colorOfEyes;
		this.noOfLegs=noOfLegs;
	}
	
}

class Cat extends Animal
{
	String color;
	
	public Cat(String colorOfEyes, int noOfLegs, String color)
	{
		super(colorOfEyes, noOfLegs);
		this.color=color;
	}
	
	
	public void run()
	{
		System.out.println("This is a cat running");
	}
	
}
class Dog extends Animal
{
	
String breed;
	
	public Dog(String colorOfEyes, int noOfLegs, String breed)
	{
		super(colorOfEyes, noOfLegs);
		this.breed=breed;
	}
	
public void run()	
	{
		System.out.println("This is a dog running");
	}

}