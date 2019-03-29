package sef.ATestTask.FirstActivity;

public class Person extends Human {

    private String firstName;
    private String secondName;
    private int age;

	//Behavior - default constructor
	public Person(){
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age) throws InvalidPersonNameException {
		this.setFirstName(firstName);
		this.setSecondName(secondName);
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws InvalidPersonNameException {
	    if (firstName != null && checkName(firstName)){
            this.firstName = firstName;
        } else {
	        throw new InvalidPersonNameException();
        }
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

	public void setSecondName(String secondName) throws InvalidPersonNameException {
	    if (secondName != null && checkName(secondName)) {
            this.secondName = secondName;
        } else {
	        throw new InvalidPersonNameException();
        }
	}

	public String announce() {
		return "My name is " + getFirstName() + " " + getSecondName() + " and i am " + getAge() + " years old";
	}

	private static boolean checkName(String name){
        for (int i = 0; i < name.length(); i++){
            if (Character.isDigit(name.charAt(i))){
                return false;
            }
        }

        return true;
    }

    public void somethingThatAHumanWouldDo(){
        System.out.println("This human thinks he is a person and does things accordingly");
    }
}

