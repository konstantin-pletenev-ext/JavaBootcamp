package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person{
    private String universityName;
    int rating;

    public Student(){}

    public Student(String firstName, String secondName, int age, String universityName, int rating) {
        super(firstName, secondName, age);
        this.universityName = universityName;
        this.rating = rating;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String announce() {
        return super.announce()+ " I am studying in "+getUniversityName();
    }
}
