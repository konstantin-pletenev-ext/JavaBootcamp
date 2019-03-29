package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes
    private String firstName;
    private String secondName;
    private int age;


	public Person(){
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;

	}


	public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public int getAge() {
		return age;
	}


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
	public String announce() {
		return " My name is " + getFirstName() + " " + getSecondName() +
               " and i am "  + age + " years old ";

	}

}

