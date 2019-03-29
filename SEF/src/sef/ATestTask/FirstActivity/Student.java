package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {
    private String schoolname;

    //Constructors
    public Student() {
        this.schoolname = "";
    }
    //getters and setters
    public String getSchoolname(){
        return schoolname;
    }
    public void setSchoolname(String schoolname){
        this.schoolname = schoolname;
    }

    //Methods
    @Override
    public String announce(){
        return "I am study in university" + getSchoolname();
    }



}
