package sef.module11.sample;
// Complete Code
import java.io.*;

public class KeyboardInputSample
{
	public static void main(String a[])
	{
		String s1; //To store name
		String s2; //To store age
		
		//Initializes InputStreamReader to read from System.in (Keyboard)  
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		try{
		System.out.print("Please enter your name: ");
		s1= br.readLine(); //reading name from keyboard
		System.out.print("Please enter your age: ");
		s2= br.readLine(); //reading age from keyboard
		
		System.out.println (s1+" your age is " +s2);
		}//end of try
		catch(IOException e)
		{
			System.out.println("There is an input output exception. Please try again later");
		}

		
		
	}//main
}//class