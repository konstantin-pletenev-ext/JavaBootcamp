package sef.module14.sample;
//Complete Code
public class AutoBoxingSample {
	public static void main(String[] args) { 
		
	//Calling setInteger method with a primitive and then with a wrapper class' object.
		setInteger(99);
		setInteger(new Integer(99));
	
	//Calling setFloat method with a primitive and then with a wrapper class' object.		
		setFloat(9.9f);
		setFloat(new Float(9.9f));
		
	//Assigning a primitive float to object f of wrapper class Float - known as AutoBoxing
		Float f = 9.9f;
		System.out.println("Value in object f is : "+f);
		
	//Assigning an integer object's value to a primitive int - known as AutoUnBoxing
		int i = new Integer(99);
		System.out.println("Value in i is : "+i);
	}
	
	
	public static void setInteger(int i){
		System.out.println(i);
	}
	
	public static void setFloat(Float i){
		System.out.println(i);
	}

}
