package sef.ATestTask.FirstActivity;


import junit.framework.TestCase;
import org.junit.Test;

public class Person{

    //TODO 1 Implement Person Attributes
    String firstName;
    String secondName;
    int age;


    //Behavior - default constructor
    public Person() {
        this.firstName = "Unknown";
        this.secondName = "Unknown";
        this.age = 0;
    }

    //Behavior - parameterized constructor
    public Person(String firstName, String secondName, int age) {
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
    public String announce() {
        return "I am " + getFirstName() + " " + getSecondName() + "and I am " + getAge() + "years old.";
    }


    public void checkNames() {
        int check=0;
        for (int i = 0; i < this.getFirstName().length(); i++) {
            this.getFirstName().charAt(i);
            int a=Character.getNumericValue(getFirstName().charAt(i));
            for (int j = 0; j <10 ; j++) {
              if(a==j){ System.out.println("In First Name there is number"); check =1; break;}
              if (check==1)break;

            }



        }




    }
}

