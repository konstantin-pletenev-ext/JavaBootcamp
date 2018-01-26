package sef.module13.sample;
//Needs to be completed
import java.sql.*;

public class StatementSample {

	public static void main(String[] args) {
		try{
			String url = "jdbc:mysql://localhost/activity";
			String user = "root";
			String pass = "abcd1234";
			
			//1 - Load the driver
			
			
			//2 - Obtain a connection
			Connection cn = ;
			System.out.println("Connection successfully established!");
			
			//3 - Create a Statement
			Statement st = ;
			
			//4 - Execute a query
			ResultSet rs = ;			
			
			System.out.println("ID\tComplete Name\tSalary");
			//5 - Traverse through the ResultSet and print all the records 
			while(rs.next()){
						}
			
			//closing the connection
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
