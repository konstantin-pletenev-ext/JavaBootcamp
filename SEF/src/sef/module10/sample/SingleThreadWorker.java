package sef.module10.sample;
// Complete Code
public class SingleThreadWorker {
	
	private String name;

	public SingleThreadWorker(String name){
		this.name = name ;
		
	}

	public void work(){
		for(int task = 0; task < 10 ; task++){
			System.out.println("Worker " + name + " doing task " + task);
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException ex){
				System.err.println("Unexpected interruption of thread " + Thread.currentThread().getName());
			}
		}
	}
}
