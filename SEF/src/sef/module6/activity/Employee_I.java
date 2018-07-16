package sef.module6.activity;


public class Employee_I extends Person_I {
	
	//Attributes
	private double salary;
	private String title;
	
	//Behavior - default constructor
	public Employee_I(){ 
		System.out.println("I'm an Employee_I Constructor"); 
	}
	
	// getter for int salary
	public double getSalary() {
		return salary;
	}
	
	// setter for int salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// getter for String title
	public String getTitle() {
		return title;
	}
	
	// setter for String title
	public void setTitle(String title) {
		this.title = title;
	}
}
