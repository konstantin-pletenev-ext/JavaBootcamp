package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes
	private String firstName, secondName;
	private int age;

	//Behavior - default constructor
	public Person(){
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		checkContainsNumbers(firstName);
		this.firstName = firstName;
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		checkContainsNumbers(secondName);
		this.secondName = secondName;
	}

	public void checkContainsNumbers(String name) {
		for(int i = 0; i < name.length(); i++) {
			if(name.charAt(i) >= '0' && name.charAt(i) <= '9') {
				throw new IllegalArgumentException("First name cannot contain a number");
			}
		}
	}

	//TODO 2 add all person info into announce() method
	public String announce() {
		return "My name is " + getFirstName() + " " + getSecondName() +
				" and i am " + getAge() + " years old";
	}
}

