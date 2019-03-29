package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {

    private String schoolName;
    private int grade;

    public Student() {
        this.schoolName = "DafaultSchool";
        this.grade = 0;
    }
    public Student(String s, int g) {
        this.schoolName = s;
        this.grade = g;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String announce() {
        return "My name is " + getFirstName() + " " + getSecondName() +
                " and I study in " + getSchoolName();
    }
}
