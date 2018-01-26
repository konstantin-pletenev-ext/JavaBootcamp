package sef.module12.sample;
//Needs to be completed
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSample {

	public static void main(String arg[]){
		Socket socket = null;
		
		try {
			//1 - Instantiate Socket Object and pass Server's IP address and port number
			
			
			//Obtaining InputStream to be able to read messages sent by Server
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
					socket.getInputStream()));
			
			String line="";
			//Reading the message sent by server
			while ((line= in.readLine()) != null)
				System.out.println(line);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
