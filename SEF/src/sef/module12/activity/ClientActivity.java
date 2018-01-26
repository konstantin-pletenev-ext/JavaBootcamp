package sef.module12.activity;
//Needs to be completed
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientActivity {

	public static void main(String arg[]){
		Socket socket=null;
		
		try {
			//1 - Instantiate Socket Object and pass Server's IP address and port number

			
			//Obtaining InputStream to be able to read messages sent by Server
			BufferedReader in = ;
			
			//2 - Obtain Keyboard's InputStream to read data from keyboard 
			BufferedReader myIn = ;
			
			//3 - Obtain Socket's OutputStream to write/send messages on it.
			PrintWriter out = ;
			
			//Reading the message sent by server
			String serverMsg = in.readLine();
			while (serverMsg != null){
				System.out.println("Server said : " +serverMsg);
				//4 - Read from keyboard using myIn.readLine()
				String myMsg = ;
				
				//Sending this message to the Server
				out.println(myMsg);
				//Reading what server has sent
				serverMsg=in.readLine();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
