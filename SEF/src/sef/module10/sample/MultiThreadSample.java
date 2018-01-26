package sef.module10.sample;
// Complete Code
public class MultiThreadSample {
	//even though it seems that every thread is executing one loop at a time in this
	//example but if you see the sequence of name you will notice that some doesn't follow
	//the Curly Larry Moe sequence
	public static void main(String arg[]){
		
		
		MultiThreadWorker m1 = new MultiThreadWorker();
		Thread curlyThread = new Thread(m1, "CurlyWorker");
		Thread larryThread = new Thread(m1, "LarryWorker");
		Thread moeThread = new Thread(m1, "MoeWorker");
		
		curlyThread.start();
		larryThread.start();
		moeThread.start();
	}
}
