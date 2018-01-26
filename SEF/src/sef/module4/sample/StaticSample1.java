package sef.module4.sample;

public class StaticSample1 {
	
	
	// Attributes
	public static int SHARED=1;  //Static attributes and methods are defined by using the keyword static
	public int notShared;
	
	//Default Constructor
	public StaticSample1() {
	}
	
	public static void main(String arg[]){   // Static methods can only directly access attributes and call methods that are also static

		//static sample
		StaticSample1 temp1  = new StaticSample1();
		StaticSample1 temp2  = new StaticSample1();
		
		temp1.SHARED = 99;
		temp1.notShared = 1;
		
		temp2.SHARED = 100;
		temp2.notShared = 2;
		
		StaticSample1.SHARED = 300; // Static members of a class can be accessed or are referenced by the class name

		
		System.out.println(temp1.SHARED);  // Static attributes and methods are associated to the class and are shared by all instances of the class
		System.out.println(temp1.notShared);
		System.out.println(temp2.SHARED);  // Static attributes and methods are associated to the class and are shared by all instances of the class
		System.out.println(temp2.notShared);
		
		
				
	}
}
