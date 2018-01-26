package sef.module14.sample;
//Complete Code
import java.util.ArrayList;
import java.util.List;

public class WildCardSample {
	
	public static void main(String arg){
		
		//Allowed because Float is subclass of Number
		testOne(new ArrayList<Float>());
		
		//Allowed because Object is a superclass of Number
		testTwo(new ArrayList<Object>());
			
		//All types are allowed
		testThree(new ArrayList<String>());
	}
	//Accepts only Lists that have subclasses of Number as parameter
	public static void testOne(List<? extends Number> numbers){
		System.out.println(numbers.toString());
	}
	//Accepts only Lists that have parent classes of Number as a parameter
	public static void testTwo(List<? super Number> numbers){
		System.out.println(numbers.toString());
	}
	
	//Accepts any type of Lists
	public static void testThree(List<? > numbers){
		System.out.println(numbers.toString());
	}
	
	
}
