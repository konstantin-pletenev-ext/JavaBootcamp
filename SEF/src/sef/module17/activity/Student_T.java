package sef.module17.activity;

public class Student_T extends Person_T {

    //Attributes
    private int grade;
    private String school;

    //Getters and setters
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public String announce() {
        return super.announce() +
                "\nI am from school \"" + school +
                "\" and my grade is " + grade;
    }
}
