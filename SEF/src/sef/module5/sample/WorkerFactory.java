package sef.module5.sample;

public class WorkerFactory {

	public static final String TYPE_A="A";
	public static final String TYPE_B="B";
	
	
	public static Worker createWorker(String type){
		
		if(type.equals("A")){
			return new WorkerImplA();
		}else if (type.equals("B")){
			return new WorkerImplB();
		}else{
			return null;
		}
	}
}
