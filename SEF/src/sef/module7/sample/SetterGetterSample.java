package sef.module7.sample;

public class SetterGetterSample{

	public static void main(String arg[]){
		
		//With exposed impelmentation, an object can have values passed to it
		//that may be contrary to it's design
		
		PersonSampleOne p1 = new PersonSampleOne();
		p1.name=null;
		p1.age=-1000;
		
		//Will not allow improper fields to be set by throwing an exception
		PersonSampleTwo p2 = new PersonSampleTwo("John Doe", -10);
	}
}
