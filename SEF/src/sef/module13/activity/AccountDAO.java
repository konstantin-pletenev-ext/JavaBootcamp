package sef.module13.activity;
// Complete Code
import java.util.List;

public interface AccountDAO {

	/**
	 * Returns a list of accounts that with first names and last names that contain
	 * the specified first name and last name.  The result list will be ordered via ID
	 * in an ascending manner
	 * 
	 * @param firstName the first name of the account to search
	 * @param lastName the last name of the account to search
	 * @return list of accounts that match the criteria
	 * 
	 * @throws AccountDAOException when a problem occurs during search
	 */
	public List findAccount(String firstName, String lastName) throws AccountDAOException;
	
	public Account findAccount(String id) throws AccountDAOException;
	
	public boolean insertAccount(String id, String firstName, String lastName, String email, float balance ) throws AccountDAOException;
	
	public boolean deposit(String id, float amount ) throws AccountDAOException;
	
	public boolean withdraw(String id, float amount ) throws AccountDAOException;
	
	public boolean deleteAccount(String id) throws AccountDAOException;
}