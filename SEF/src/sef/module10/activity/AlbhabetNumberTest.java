package sef.module10.activity;
//Needs to be completed
//Code that generates output synchronized from 2 threads
//First thread prints a number from 1-26 and the other prints alphabets
//against those numbers 

public class AlbhabetNumberTest {
	public static void main(String[] args)
	{
		Generator obj = new Generator();
		
		//1 - Create objects of both the thread classes and pass obj as a parameter to them 
		
		
		//2 - Start both the threads
		
		}
	}

class NumGenerator extends Thread
{
	public Generator obj;
	public NumGenerator(Generator obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		//3 - Run a loop from 1-26 (say i is the variable) and
		//call printNumber passing i as its parameter 
	}
}  

class AlphaGenerator extends Thread
{
	public Generator obj;
	public AlphaGenerator(Generator obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		
		//4 - Run a loop from A-Z (say c is the variable) and
		//call printAlbhabet passing c as its parameter
	
	}
}

class Generator {
	boolean numPrinted = false;
	public synchronized void printNumber(int number)
	{
		//5 - Check if numPrinted is true, then call wait()
		

		//6 - print the number here

		
		//7 - numPrinted should be assigned true here

		
		//8 - Notify the waiting thread

	}
	public synchronized void printAlphabet(char alphabet)
	{
		//9 - Check if numPrinted is false, then call wait()
		

		//10 - print the alphabet here

		
		//11 - numPrinted should be assigned true here


		//12 - Notify the waiting thread

	}
} 