package sef.module11.sample;
//Needs to be completed
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToFileSample {

	public static void main(String[] args) {
		try {
			BufferedReader br;
			InputStreamReader isr;
			FileOutputStream fos;
			
			
			//1 - Instantiate br of BufferedReader class which can read from keyboard
			
			
			//2 - Instantiate an object of FileOutputStream class to write to .\\src\\io\\temp.txt 
			
			
			String s;//String to hold keyboard input
			
			System.out.print("Please enter some text separated by a newline.");
			System.out.println("To exit, type exit and press <Enter> key");
			//A while loop to read from keyboard until the user types exit
			while(!(s = br.readLine()).equals("exit")) {
				
				//Writing the read strings to a file opened with fos.
				fos.write((s+"\n").getBytes());
			}
			
			System.out.println("Thank you!");
			//Notice there is a file named temp2.txt created with the text that you entered.
			br.close();
			isr.close();
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
