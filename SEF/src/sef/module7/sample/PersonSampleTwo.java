package sef.module7.sample;

public class PersonSampleTwo {

	private String name;
	private int age;
	
	public PersonSampleTwo(String name, int age){
		setName(name);
		setAge(age);
	}
	
	public final void setName(String name){
		if(name == null){
			throw new IllegalArgumentException("Name cannot be null!");
		}
		this.name = name;
	}
	
	public  String getName(String name){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public final void setAge(int age){
		if(age < 0){
			throw new IllegalArgumentException("Age cannot be negative!");
		}
		this.age = age;
	}
}
