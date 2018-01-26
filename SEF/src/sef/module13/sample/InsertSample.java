package sef.module13.sample;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertSample {

	public static void main(String[] args) {
		try{
			String url = "jdbc:mysql://localhost/activity";
			String user = "root";
			String pass = "abcd1234";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			cn.setAutoCommit(false);
			System.out.println("Connection successfully established!");
			
			//1 - Create a PreparedStatement with a query "insert into employee values(?,?,?,?)" 
			PreparedStatement pStmt = ;
			
			//	Change parameter to any keyword desired, if a record
			// 	matches the query then it will be displayed
			pStmt.setString(1,"6");
			pStmt.setString(2,"Clark");
			pStmt.setString(3,"Kent");
			pStmt.setInt(4,7000);
			
			//2 - Execute this query using executeUpdate()
			int rows = ;
			cn.commit();	
			System.out.println(rows + " row(s) added!");
			
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

	}
}
