package sef.module12.sample;
// Complete Code
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressSample {

	public static void main(String arg[]){
		try {
			System.out.println("----Localhost----");
			InetAddress ia = InetAddress.getLocalHost();
			System.out.println(ia.getCanonicalHostName());
			System.out.println(ia.getHostAddress());
			System.out.println(ia.getHostName());
			
			System.out.println("----Google.com----");
			InetAddress[] all = InetAddress.getAllByName("google.com");
			for(int i=0; i<all.length; i++ )
			{
				System.out.println(all[i].getCanonicalHostName());
				System.out.println(all[i].getHostAddress());
				System.out.println(all[i].getHostName());
			}
					
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
	}
}
