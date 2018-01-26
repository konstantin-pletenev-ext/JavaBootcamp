package sef.module10.sample;
// Complete Code
public class Driver implements Runnable{
	
	private Passenger passenger;

	
	public void setPassenger(Passenger passenger){
		this.passenger = passenger;
		System.out.println("Driver has a passenger!");
	}

	public void run(){
		
		for(int i = 0; i < 10; i++){
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException ex){
				synchronized(passenger){
					passenger.notify();
				}
			}
			
			System.out.println("Driver is driving to destination...");
			
		}
	
		System.out.println("Driver is at the destination, notify the Passenger");
		if(passenger!=null){
			synchronized(passenger){
				passenger.notify();
			}	
		}
		
	}

}
