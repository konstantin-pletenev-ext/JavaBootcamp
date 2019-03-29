package sef.ATestTask.FirstActivity;


import sef.ATestTask.SecondActivity.SecondActivity;

//TODO Implement class Student with parent Person
public class Student extends Person {

    private String universityName;
    int rating;

    public Student(Person student1){}
    public Student (String firstName, String lastName, int age, String universityName, int rating){
        super(firstName, lastName,age);
        this.universityName = universityName;
        this.rating = rating;

    }
    public String getUniversityName() {return universityName;}
    public void setUniversityName (String universityName) {this.universityName = universityName;}






    }

}
