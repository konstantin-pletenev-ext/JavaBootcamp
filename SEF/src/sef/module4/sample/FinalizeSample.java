package sef.module4.sample;

import java.io.IOException;

public class FinalizeSample {

	public FinalizeSample()
	{
		System.out.println("Creating Object");	
	}
	
	protected void finalize() // called by garbage collector
	{
		System.out.println("Garbage Collect");
	}
	
	public static void main(String arg[]) throws IOException{
		new FinalizeSample();
		System.gc();
		System.out.println("Exit");
	}
}
