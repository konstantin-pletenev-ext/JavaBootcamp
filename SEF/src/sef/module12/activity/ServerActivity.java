package sef.module12.activity;
//Needs to be completed
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerActivity {
	
	public static void main(String arg[]){
		
		ServerSocket server=null;
		Socket client=null;
		PrintWriter out=null; 
		BufferedReader in = null;
		BufferedReader myIn = null;
		
		try {
			//1 - Instantiate ServerSocket object and run it on port number 9999
			server = 
			System.out.println("ServerSocket created at " + InetAddress.getLocalHost());
			
			while(true){
				System.out.println("Waiting for connection");
				//2 - Wait for a client request
				client = 
				System.out.println("Got a connection from " + client.getInetAddress());
				
				//Obtaining Client's stream to send messages 
				out = new PrintWriter(
	                    client.getOutputStream(), true);
				
				in = new BufferedReader(
						new InputStreamReader(
						client.getInputStream()));
				
				myIn = new BufferedReader(
						new InputStreamReader(
								System.in));
						
				//Sending a message to the client
				out.println("You have reached server " + client.getInetAddress() + " This is a message from the server. How are You?");
				String clientMsg = in.readLine();
				while(!(clientMsg.equals("Bye")))
				{
					System.out.println("Client said : "+ clientMsg);
					String myMsg=myIn.readLine();
					out.println(myMsg);
					clientMsg = in.readLine();
				}
				//Closing the opened stream and Client connection 
				out.close();
				client.close();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
			if(out != null)
				out.close();
			
			if(client != null)
				client.close();
			
			if (server != null)
				server.close();
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}
}