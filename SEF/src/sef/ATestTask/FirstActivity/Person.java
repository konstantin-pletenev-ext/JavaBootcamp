package sef.ATestTask.FirstActivity;


public abstract class Person {

    //TODO 1 Implement Person Attributes
    private String firstName;
    private String secondName;
    private int age;

    public Person() {
    }

    public Person(String firstName, String secondName) {
        setFirstName(firstName);
        setSecondName(secondName);
    }

    //Behavior - parameterized constructor
    public Person(String firstName, String secondName, int age) {
        setFirstName(firstName);
        setSecondName(secondName);
        setAge(age);
    }

    // getter for String firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.replaceAll("[0-9]", "");
    }

    // getter for int age
    public int getAge() {
        return age;
    }

    // setter for int age
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        this.age = age;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName.replaceAll("[0-9]", "");
    }

    //TODO 2 add all person info into announce() method
    public String announce() {
        return "I am " + getFirstName() + " " + getSecondName();
    }

    //or this method
    public void introduce() {
        System.out.println("My name is " + getFirstName() + " " + getSecondName() + " I am " + getAge() + " years old.");
    }

//    private String removeSignsFromName(String firstName) {
//        firstName = firstName.replaceAll(" ", "");
//        firstName = firstName.replaceAll(".", "");
//
//        return firstName.replaceAll("\\^([0-9]+)", "");
//    }
//
//    private String removeSignsFromsecondName(String secondName) {
//        secondName = secondName.replaceAll(" ", "");
//        secondName = secondName.replaceAll(".", "");
//
//        return secondName.replaceAll("\\^([0-9]+)", "");
//    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}

