package sef.ATestTask.FirstActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee() {
        this.jobTitle = "unknown";
        this.companyName = "Unknown";
        this.salary = 0;
    }

    //TODO 2 add getters and setters
    // getter for int empId
    public int getEmpId() {
        return empId;
    }

    // setter for int empId
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // getter for double salary
    public double getSalary() {
        return salary;
    }

    // setter for double salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // getter for String jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    // setter for String jobTitle
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // getter for String companyName
    public String getCompanyName() {
        return companyName;
    }

    // setter for String companyName
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //TODO 3 override method announce()
    public String announce() {
        // Create a Pattern object
        Pattern p = Pattern.compile("^[aeiou]");

        // Now create matcher object.
        Matcher m = p.matcher(getJobTitle());
        if (m.find()){
        return "My name is " + getFirstName() + " " + getSecondName() + " and I work as an "
                + getJobTitle() + " in " + getCompanyName() + "." ;}
                else return "My name is " + getFirstName() + " " + getSecondName() + " and I work as a "
                + getJobTitle() + " in " + getCompanyName() + "." ;
    }

}