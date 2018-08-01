package sef.module17.activity;

public class Employee_T extends Person_T {

    //Attributes
    private double salary;
    private String title;

    //Getters and setters

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String announce() {
        return super.announce() +
                "n\"My title is " + title +
                "n\"and my salary is " + salary;
    }
}