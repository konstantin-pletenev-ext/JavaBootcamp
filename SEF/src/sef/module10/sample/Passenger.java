package sef.module10.sample;
// Complete Code
public class Passenger implements Runnable{
	
	public synchronized void run(){
		System.out.println("Passenger is waiting to arrive Destination");
		
		try{
			wait();
		}
		catch(InterruptedException ex){
			return;
		}
		System.out.println("Passenger thanks the driver!");	
	}
}
