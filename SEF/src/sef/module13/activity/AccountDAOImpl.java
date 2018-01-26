package sef.module13.activity;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AccountDAOImpl implements AccountDAO {

	private Connection conn;

	public AccountDAOImpl() {
		String url = "jdbc:mysql://localhost/activity";
		String user = "root";
		String pass = "abcd1234";
		
		try {
			//1 - Load the driver

			
			//2 - Obtain a connection using DriverManager class
			Connection cn = ;
			this.conn = cn;
			conn.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	// 3 - implement findAccount method which returns a list of accounts
	// matching the first name and last name combination
	public List findAccount(String firstName, String lastName)
			throws AccountDAOException {
		List<Account> results = new ArrayList<Account>();
		try {
			PreparedStatement pStmt = conn.prepareStatement("");
			pStmt.setString(1, '%' + firstName.toUpperCase() + '%');
			pStmt.setString(2, '%' + lastName.toUpperCase() + '%');

			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				results.add(new AccountImpl(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getFloat(5)));
			}

		} catch (SQLException e) {
			throw new AccountDAOException(AccountDAOException.ERROR_FIND_NAME,
					e);
		}
		return results;
	}

	// 4 - Complete implementation for findAccount method
	public Account findAccount(String id) throws AccountDAOException {

		try {
			PreparedStatement pStmt = conn.prepareStatement("");
			pStmt.setString(1, id);
			ResultSet rs = pStmt.executeQuery();
			if (rs.next()) {
				return new AccountImpl(rs.getString(1), rs.getString(2), rs
						.getString(3), rs.getString(4), rs.getFloat(5));
			}

		} catch (SQLException e) {
			throw new AccountDAOException(AccountDAOException.ERROR_FIND_ID, e);
		}

		return null;
	}

	// 5 - Complete implementation for insertAccount
	public boolean insertAccount(String id, String firstName, String lastName,
			String email, float balance) throws AccountDAOException {

		return false;
	}

	// 6 - Complete implementation for deposit. It should ensure that the
	// account balance is increased by the amount deposited.
	public boolean deposit(String id, float amount) throws AccountDAOException {
		return false;
	}

	// 7 - Complete implementation for withdraw. It should ensure that the
	// account balance is reduced by the amount deposited.
	public boolean withdraw(String id, float amount) throws AccountDAOException {
		return false;
	}

	// 8 - Complete implementation for deleteAccount
	public boolean deleteAccount(String id) throws AccountDAOException {
		return false;
	}

}
