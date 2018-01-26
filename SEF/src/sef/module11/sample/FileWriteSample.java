package sef.module11.sample;
// Complete Code
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteSample {


	public static void main(String[] args) {
		try {
			String data = "Data for file";
			FileOutputStream fos = new FileOutputStream(".\\src\\sef\\module11\\sample\\temp3.txt",true);
			fos.write(data.getBytes());
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
