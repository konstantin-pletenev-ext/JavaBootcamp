package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {
    private int grade;
    private String school;

    //Behavior - default constructor
    public Student(){
        this.school = "Unknown";
        this.grade = 0;

    }

    // getter for int grade
    public int getGrade() {
        return grade;
    }

    // setter for int grade
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // getter for String school
    public String getSchool() {
        return school;
    }

    // setter for String school
    public void setSchool(String school) {
        this.school = school;
    }

    public String announce() {
        return "My name is " + getFirstName() + " " + getSecondName() + " and I study at " + getSchool() + ".";
    }
}
