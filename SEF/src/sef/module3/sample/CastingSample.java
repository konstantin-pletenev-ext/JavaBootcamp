 package sef.module3.sample;

public class CastingSample {

	public static void main(String arg[]){
		
		int intVar=1;
		char charVar='A';
		long longVar=99;
		float floatVar=1.2f;
	
		
		//Implicit Casting;
		//This is allowed because characters is actually implemented as integer
		//Each character has a specific integer value as defined by the Unicode table
		intVar = charVar;
		System.out.println(intVar);
		
		//Implicit Casting
		//widening conversion
		//A long is 'wider' than an int,therefore it has enough 'space' to accommodate the
		//value represented by any integer 
		longVar = intVar;
		System.out.println(longVar);
		
		//Explicit Cast
		//narrowing conversion
		//An explicit cast is needed because a 'float' is wider than a long. We need to 'cast'
		//the float to turn it into a long.  As a result, the original float value will lose some data
		//In this case, it will only retain the integer portion of the value
		longVar = (long)floatVar;
		System.out.println(longVar);
		
		
	}
}
