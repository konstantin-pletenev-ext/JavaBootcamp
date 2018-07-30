package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.util.ArrayList;

import junit.framework.TestCase;

public class EmployeeJDBCTest extends TestCase {

	EmployeeJDBC emp;
	
	protected void setUp() throws Exception {
	//setUp() is used to initialize member data which would be used by all/most of its methods
		emp = new EmployeeJDBC();
	}

	public void testCreateConnection() {
		Connection con = emp.createConnection();
		assertNotNull(con);
		
	}

	public void testFindEmployeeById_MatchFound() {
		//complete the code here
	}

	public void testFindEmployeeById_NoMatchFound() {
		//complete the code here
	}
	
	
	public void testFindEmployeeByName_MatchFound() {
		//complete the code here
	}
	
	public void testFindEmployeeByName_NoMatchFound() {
		//complete the code here
	}

	public void testFindEmployeeBySalary_MatchFound() {
		//complete the code here
	}

	public void testFindEmployeeBySalary_NoMatchFound() {
		//complete the code here
	}
	
	public void testInsertEmployee(){
		//complete the code here
		
	}
}
