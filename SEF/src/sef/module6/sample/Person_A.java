package sef.module6.sample;

public abstract class Person_A{
	
	private int age;
		
	// default constructor
	public Person_A(){
		System.out.println("I am a Person_A Constructor");
	}
	
	//abstract methods have no implementation
	public abstract String getName();
	public abstract void setName(String name);
	
	// getter and setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
