package sef.module6.activity;

public abstract class Shape {

	public String color;
	
	public Shape() {
	}
	
	abstract public double calculateArea();
	abstract public double calculatePerimeter();

	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	
	

}
