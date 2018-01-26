package sef.module19.sample;

public class WorkerTypeB_Adapter implements AdapterInterface{
	
	private Worker worker;
	public WorkerTypeB_Adapter(Worker worker){
		this.worker = worker;
		
	}
	
	public void execute() {
		worker.doWork();
	}
}
