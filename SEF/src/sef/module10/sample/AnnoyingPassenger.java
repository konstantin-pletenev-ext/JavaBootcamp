package sef.module10.sample;
// Complete Code
public class AnnoyingPassenger implements Runnable{
	
private AnnoyedDriver driver;
	
	public AnnoyingPassenger(AnnoyedDriver driver){
		this.driver = driver;
	}
	
	public synchronized void run(){
		
		System.out.println("Passenger is waiting to arrive Destination");
		boolean atDestination = false;
		while(!atDestination){
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException ex){
				//return
			}
			System.out.println("Passenger asks... are we there yet?");
			atDestination = driver.atDesination();
		
		}
		System.out.println("Passenger is at the destination!");
	}

}