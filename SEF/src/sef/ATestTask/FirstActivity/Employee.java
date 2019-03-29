package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
   // Behavior default constructors
    public Employee(){
        this.empId = 0;
        this.jobTitle = "Unknown";
        this.companyName = "Unknown";
        this.salary = 0;
}
////Behavior - parameterized constructor
public Employee(int empId, String jobTitle, String companyName, double salary){
    this.empId = empId;
    this.jobTitle = jobTitle;
    this.companyName = companyName;
    this.salary = salary;
 }
//TODO 2 add getters and setters
// getters and setters for String attributes
public String getJobTitle() {
    return jobTitle;
}
public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

public String getCompanyName() {
        return companyName;
    }
public void setCompanyName(String companyName) { this.companyName = companyName; }

//getters and setters for int and double attributes
public int getEmpId() {
        return empId;
    }
public void setEmpId(int empId) {
        this.empId = empId;
    }

public double getSalary() {return salary; }
public void setSalary(double salary) {
        this.salary = salary;
    }

    //TODO 3 override method announce()
    @Override
    public String announce() {
        return super.announce() + "I work as " + getJobTitle() + " " + "in" + " " + getCompanyName() + ".";

    }




}