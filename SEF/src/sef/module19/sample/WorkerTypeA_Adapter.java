package sef.module19.sample;

public class WorkerTypeA_Adapter implements AdapterInterface{

	private Worker worker;
	
	public WorkerTypeA_Adapter(Worker worker){
		this.worker = worker;
		
	}
	
	public void execute() {
		worker.doWork();
	}

}
