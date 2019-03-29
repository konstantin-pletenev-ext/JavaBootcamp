package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person{

    private String firstName;
    private String secondName;
    private int age;
    private String schoolName;

    public Student(){
        this.schoolName = "Unknown";
    }

    public Student(String schoolName){
        this.schoolName = schoolName;
    }

    public Student(String firstName, String secondName, int age, String schoolName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String announce() {
        return "I am study in university " + getSchoolName();
    }
}
