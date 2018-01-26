package sef.module5.sample;

public class Singleton {

	private static Singleton onlyInstance;
	
	private Singleton(){
		//initialize
	}
	//sample singleton
	public static Singleton getInstance(){
		if(onlyInstance == null){
			onlyInstance = new Singleton();
		}
		return onlyInstance;
	}
	
}
