package sef.module4.sample;

import java.util.Calendar;

public class Person {

	//Attributes
	private String name;
	
	
	//Behavior
	public Person(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String introduce(){
		return "My name is " + name;
	}
	
}
