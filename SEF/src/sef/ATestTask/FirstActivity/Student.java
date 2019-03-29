package sef.ATestTask.FirstActivity;

public class Student extends Person {

    private String schoolName;

    public Student() {

    }

    public Student(String firstName, String secondName, int age, String schoolName) throws InvalidPersonNameException {
        super(firstName, secondName, age);
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
        return super.announce() + "\nI am study in university " + getSchoolName();
    }
}