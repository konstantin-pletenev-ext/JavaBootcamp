package sef.ATestTask.FirstActivity;

//TODO Implement class Student with parent Person

public class Student extends Person {
    private String schoolName;

    public Student() {

    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return this.schoolName;
    }

    @Override
    public String announce() {
        return "I am study in university " + getSchoolName();
    }
}

