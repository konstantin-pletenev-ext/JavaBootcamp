package sef.module11.sample;
// Complete Code
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectReaderSample {

	public static void main(String arg[]){
		File target= new File(".\\src\\sef\\module11\\sample\\ObjectData.obj");
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(target));
	
				List list = (List)in.readObject();
				in.close();
				for(int i=0; i<list.size(); i++){
					System.out.println(list.get(i));
				}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
