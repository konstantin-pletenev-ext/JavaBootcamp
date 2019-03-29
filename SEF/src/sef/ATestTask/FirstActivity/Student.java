package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {

    //Attributes
    private String school;
    private int grade;

    //Behavior - default constructor
    public Student() {
        this.school = "Unknown";
        this.grade = 0;
    }

    //Behavior - parameterized constructor
    public Student(String school, int grade){
        this.school = school;
        this.grade = grade;
    }

    //Getters and setters

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    //override method announce()
    public String announce(){
        return super.announce() + " I'm studying in "+getSchool()+ " grade " +getGrade();
    }
}
