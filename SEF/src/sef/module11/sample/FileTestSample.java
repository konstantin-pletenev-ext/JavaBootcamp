package sef.module11.sample;
// Complete Code
import java.io.File;
import java.io.IOException;


public class FileTestSample {

	public static void main(String[] args) {
		try {
			//Creates a new File object pointing it to path of temp1.txt
			File f = new File(".\\src\\sef\\module11\\sample\\temp1.txt");
			
			//Creates this file
			System.out.println("Did I create this file? " + f.createNewFile());
			System.out.println("File name : "+ f.getName());
			System.out.println("Path : "+ f.getPath());
			System.out.println("Length of file : "+ f.length());
			System.out.println("URI : " + f.toURI());
			System.out.println("Can I read this file? "+ f.canRead());
			System.out.println("Can I write on this file? "+ f.canWrite());
			System.out.println("Is this file a directory? "+ f.isDirectory());
			System.out.println("Does this file exist? "+ f.exists());
		} 
		catch (IOException e) {
			e.printStackTrace();
		}	
	}
} 
