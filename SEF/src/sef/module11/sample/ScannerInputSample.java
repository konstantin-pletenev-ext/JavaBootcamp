package sef.module11.sample;
import java.util.*;
// Complete Code
public class ScannerInputSample
{
	public static void main(String a[])
	{
		//Scanner is a utility class which simplifies IO
		Scanner scan=new Scanner(System.in);		
		
		String s1; //To store name
		int s2; //To store age
		
		System.out.print("Please enter your name: ");
		s1= scan.next();
		System.out.print("Please enter your age: ");
		s2= scan.nextInt();
		System.out.println (s1+" your age is " +s2); 
	
	}//main
}//class