package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {

    private String schoolName;
    private String FirstName;
    private String SecondName;
    private int Age;

    public Student() {
        this.schoolName = "Latvijas Universitate";
        this.FirstName = "Valdis";
        this.SecondName = "Bertrups";
        this.Age = 20;
    }

    public Student(String schoolName, String FirstName, String SecondName, int Age) {
        this.schoolName = schoolName;
        this.FirstName = FirstName;
        this.SecondName = SecondName;
        this.Age=20;
    }

    public String getschoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public String getFirstName(){
        return FirstName;
    }
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getSecondName(){
        return SecondName;
    }
    public void setSecondName(String SecondName){
        this.SecondName = SecondName;
    }
    public int getAge(){
        return Age;
    }
    public void age(int Age){
        this.Age=Age;
    }
    public String announce() {
        return "My name is " + getFirstName() + " " + getSecondName() + " and I am studying in " + getschoolName() + ". I am " + getAge() + " years old";
    }
}