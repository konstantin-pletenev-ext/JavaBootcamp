package sef.module12.sample;
//Needs to be completed
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSample {
	
	public static void main(String arg[]){
		
		ServerSocket server=null;
		Socket client=null;
		PrintWriter out=null; 
		
		try {
			//1 - Instantiate ServerSocket object and run it on port number 9999

			System.out.println("ServerSocket created at " + InetAddress.getLocalHost());
			
			while(true){
				System.out.println("Waiting for connection");
				//2 - Wait for a client request

				System.out.println("Got a connection from " + client.getInetAddress());
				
				//Obtaining Client's stream to send messages 
				out = new PrintWriter(
	                    client.getOutputStream(), true);
				
				//Sending a message to the client
				out.println("You have reached server " + client.getInetAddress() + " This is a message from the server. Have a good day!!! bye.");
				
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