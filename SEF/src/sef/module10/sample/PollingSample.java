package sef.module10.sample;
// Complete Code
class PollingSample {
	
	public static void main(String arg[]){
		AnnoyedDriver d = new AnnoyedDriver();
		AnnoyingPassenger p = new AnnoyingPassenger(d);
		
		Thread a = new Thread(d);
		Thread b = new Thread(p);
		a.start();
		b.start();
		
	}
}
