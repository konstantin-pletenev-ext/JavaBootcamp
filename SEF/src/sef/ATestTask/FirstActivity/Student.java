package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {

    private String schoolName;
    private int grade;

    public Student () {}
    public Student (String firstName, String secondName, int age, String schoolName, int grade){
        super(firstName, secondName, age);
        this.schoolName = schoolName;
        this.grade = grade;
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
        return "I am studying in university " + schoolName;
    }

}
