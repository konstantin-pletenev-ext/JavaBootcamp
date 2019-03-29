package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {

    //Attributes
    private String schoolName;

    //Behavior default constructor
    public Student(){
        this.schoolName = "MySchool";
    }

    //Behavior parameterized constructor
    public Student(String schoolName) {
        this.schoolName = schoolName;
    }

    //Getters
    public String getSchoolName() { return schoolName; }

    //Setters
    public void setSchoolName(String schoolName) { this.schoolName = schoolName; }

    //Announce
    public String introduceStudent(){
        return "I am study in university " + getSchoolName();
    }
}
