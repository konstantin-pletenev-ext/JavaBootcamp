package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes
     String firstName;
     String secondName;
     int age;
	//Behavior - default constructor
	public Person(){
		this.firstName="";
		this.secondName = "";
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
		this.secondName = secondName;
	}

	//TODO 2 add all person info into announce() method
	public String  announce() {
		String names = getFirstName() + getSecondName();
		return  "My Name is " + names + "and I am " + getAge() +"years old";
	}
}

