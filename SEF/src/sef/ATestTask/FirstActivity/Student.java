package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {

    private String schoolName;

    public Student() {
        this.schoolName = "Higschool";
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String introduseStudent()
        { return " I am study in University" + getSchoolName(); }

}

