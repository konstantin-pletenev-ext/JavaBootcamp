package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeJDBC {

	public Connection createConnection()
	{
		Connection con=null;
		String url = "jdbc:mysql://localhost/activity";
		String user = "root";
		String pass = "adbd1234";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public Employee findEmployeeById(String id)
	{
		Connection con = createConnection();
		Employee emp=null;
		try {
		// 1 - Create a PreparedStatement with a query
		

		// 2 - Search for the given id
		

		// 3 - Execute this query
		
		
		// 4 - If resultset is not null, then initialize emp object with data 
		
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}

	public ArrayList<Employee> findEmployeesByName(String name)
	{
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try {
		// 1 - Create a PreparedStatement with a query
		

		// 2 - Search for the given id
		
		// 3 - Execute this query
		
		
		// 4 - While there are some records, continue 
		
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public ArrayList<Employee> findEmployeesBySalary(int salary)
	{
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try {
		// 1 - Create a PreparedStatement with a query
		

		// 2 - Search for the given salary
		

		// 3 - Execute this query

		
		// 4 - While there are records, continue 

		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public void insertEmployee(Employee emp)
	{
		Connection con = createConnection();
		
		//1 - Create a PreparedStatement with a query "insert into employee values(?,?,?,?)" 
		
		con.setAutoCommit(false);

		//	Substitute the ? now.
		
		//2 - Execute this query using executeUpdate()
			
		System.out.println(rows + " row(s) added!");
		con.commit();
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
