package sef.module8.sample;
// Needs to be completed
public class ErrorSample {
	
	//This is an example of an error which cannot be handled programmatically 
	public static void main(String arg[]){
		infinity();
	}
	
	//Below method calls itself and
	//it happens infinite times because there is no exit condition
	//At one point in time, JVM would give up and show StackOverflowError
	public static void infinity(){
		//1 - Print a message
	
		
		//2 - Call infinity()
	
	}
}
