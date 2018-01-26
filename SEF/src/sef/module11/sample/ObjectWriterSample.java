package sef.module11.sample;
// Complete Code
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectWriterSample {

	public static void main(String arg[]){
		
		List saveMe = new ArrayList();
		saveMe.add("Curly");
		saveMe.add("Larry");
		saveMe.add("Moe");
		saveMe.add("Julie");
		
		File target= new File(".\\src\\sef\\module11\\sample\\ObjectData.obj");
		try {
			System.out.println("Saving ArrayList of Strings");
			//We use FileOutputStream to save raw bytes to a file
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(target));
			out.writeObject(saveMe);

			//Flushes the stream.
			//This will write any buffered output bytes and flush through to the underlying stream.
			out.flush();
			out.close();
			System.out.println("Done!");
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		
		
	}
}
