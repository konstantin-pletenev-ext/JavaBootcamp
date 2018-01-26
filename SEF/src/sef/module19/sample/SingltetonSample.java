package sef.module19.sample;

public class SingltetonSample {

	public static void main(String arg[]){
		// sample implementation of singleton
		//instances of the class is limited into 1
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
		
		SingletonRecommended s3 = SingletonRecommended.getInstance();
		SingletonRecommended s4 = SingletonRecommended.getInstance();
		System.out.println(s3 == s4);
	}
}
