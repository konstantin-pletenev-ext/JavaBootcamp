package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {
    //atributes
    private String schoolName;

    //behavior - default constructors
    public Student() {
        this.schoolName = "Unknown";
    }
    //behavior - parameterized constructors
    public Student(String schoolName){
        this.schoolName = schoolName;
          }
   //getters and setters
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //method
    public String announce() {
        return "I study in university" + " " + getSchoolName();

    }
}
