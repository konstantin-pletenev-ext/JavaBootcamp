package sef.module10.sample;
// Complete Code
public class SingleThreadSample {
	
	public static void main(String arg[]){
		
		SingleThreadWorker curlyWorker = new SingleThreadWorker("Curly");
		SingleThreadWorker larryWorker = new SingleThreadWorker("Larry");
		SingleThreadWorker moeWorker = new SingleThreadWorker("Moe");
		
		curlyWorker.work();
		System.out.println("Curly is done");
		larryWorker.work();
		System.out.println("Larry is done");
		moeWorker.work();
		System.out.println("Moe is done");
	}
}
