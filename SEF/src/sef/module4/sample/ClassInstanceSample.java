package sef.module4.sample;

import java.util.Calendar;

public class ClassInstanceSample {

	public static void main(String arg[]){
		
		//Object instance creation using 'new' and passing parameters to constructors
		Person him = new Person("John Doe");
		Person her = new Person("Jane Doe");
		
		//Access an object's member method to invoke a behavior
		System.out.println(him.introduce());
		System.out.println(her.introduce());
		
		// Access and Set the object's attribute using it's setter and getter
		him.setName("John");
		String name = him.getName();
		System.out.println(name);
		
		//This will cause the object pointed by 'her' to be garbage collected
		//since there are no more remaining references to that object
		her = null;
		
		
	}
}
