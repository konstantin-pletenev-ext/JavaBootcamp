package sef.ATestTask.FirstActivity;

public class Person {

    //TODO 1 Implement Person Attributes/done
    private String firstName;
    private String secondName;
    private int age;

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

    public void setFirstName(String firstName) throws CustumizeException {
        if (checkName(firstName) == true) {
            this.firstName = firstName;
        } else {
            if (checkName(firstName) == false)
                throw new CustumizeException();

        }
    }


    //In class Person add check when set firstName and secondName, check no numbers there. ->
    //setName("Ivan3") should throw the customized exception

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
        {
            if (checkName(secondName) == true) {
                this.secondName = secondName;
            } else {
                if (checkName(secondName) == false)
                    throw new IllegalArgumentException("Numbers are not allowed in Names");

            }
        }


        this.secondName = secondName;
    }

    public boolean checkName(String name) {

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (Character.isDigit(ch) == true) {
                return false;
            }
        }

        return true;
    }
//if(age < 0){
    //throw new IllegalArgumentException("Age cannot be negative!");
    //}else
    //this.age = age;


    //TODO 2 add all person info into announce() method/done
    public String announce() {
        return "I am " + getFirstName() + " " + getSecondName() + " and i am " + getAge() + "years old";
    }
}
