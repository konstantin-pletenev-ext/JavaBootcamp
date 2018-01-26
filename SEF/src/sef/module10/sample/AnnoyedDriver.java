package sef.module10.sample;
// Complete Code
public class AnnoyedDriver implements Runnable{

	private boolean atDestination=false;
	
	public boolean atDesination(){
		return atDestination;
	}
	
	
	public void run(){
		
		for(int i = 0; i < 10; i++){
			
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException ex){
				//return
			}
			System.out.println("Driver is driving to destination...");
		}
		atDestination = true;
	}
}
