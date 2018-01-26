package sef.module13.activity;
// Complete Code
public class AccountImpl implements Account{

	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private Float balance;
	
	public AccountImpl(String id, String firstName, String lastName, String email, float balance){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.balance=balance;
	}
	
	
	public String getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}

	public Float getBalance() {
		return balance;
	}

}