package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {

    private int grade;
    private String school;

    public Student() {
    }

    public Student(String firstName, String secondName, int age, int grade, String school) {
        super(firstName, secondName, age);
        setGrade(grade);
        setSchool(school);
    }

    public Student(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public Student(String firstName, String secondName, int age, String school) {
        super(firstName, secondName, age);
        setSchool(school);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String announce() {
        return "I am student. My name is " + getFirstName() + " " + getSecondName() + ". I am " + getAge() + " years old. " +
                "I am study in university " + getSchool() + ".";
    }


    //or this method
    public void introduce() {
        System.out.println("I am student. My name is " + getFirstName() + " " + getSecondName() + ". I am " + getAge() + " years old. " +
                "I am study in university " + getSchool() + ".");
    }
}
