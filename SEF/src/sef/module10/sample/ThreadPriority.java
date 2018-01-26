package sef.module10.sample;
// Complete Code
public class ThreadPriority extends Thread{
	
		  ThreadPriority(String s){
		  super(s);
		  }
		  public void run(){
		  for(int i=0;i<10;i++){
		  
		  int p=Thread.currentThread().getPriority();
		  System.out.println("Thread Name  :"+Thread.currentThread().getName());
		  System.out.println("Thread Priority  :"+ p);
		  }
		  }
		}
		  