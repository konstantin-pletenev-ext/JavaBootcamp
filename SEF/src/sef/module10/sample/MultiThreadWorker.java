package sef.module10.sample;
// Complete Code
public class MultiThreadWorker implements Runnable{
	
	
	
	public void run(){
		work();
	}
	

	public void work(){
		for(int task = 0; task < 10 ; task++){
			System.out.println("Worker " + Thread.currentThread().getName() + " doing task " + task);
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException ex){
				System.err.println("Unexpected interruption of thread " + Thread.currentThread().getName());
			}
		}
	}
}
