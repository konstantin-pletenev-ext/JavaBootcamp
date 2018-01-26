package sef.module10.sample;
// Complete Code
public class WaitNotifySample {

	public static void main(String arg[]){
		Driver d = new Driver();
		Passenger p = new Passenger();
		
		d.setPassenger(p);
		Thread a = new Thread(d);
		Thread b = new Thread(p);
		a.start();
		b.start();
		
	}
}
