package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee() {

    }

    public Employee(int empId, String jobTitle, String companyName, double salary) {
        setEmpId(empId);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setSalary(salary);
    }

    public Employee(String firstName, String secondName, String jobTitle, double salary) {
        super(firstName, secondName);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public Employee(String firstName, String secondName, int age, String jobTitle, String companyName) {
        super(firstName, secondName, age);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
    }

    public Employee(String firstName, String secondName, int age, String jobTitle, String companyName, double salary) {
        super(firstName, secondName, age);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setSalary(salary);
    }

    //TODO 2 add getters and setters

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    //TODO 3 override method announce()

    public String announce() {
        return "I am Employee. My name is " + getFirstName() + " " + getSecondName() + ". I am " + getAge() + " years old." + " I am work as "
                + getJobTitle() + " in company " + getCompanyName() + ".";

    }

    @Override
    public String toString() {
        return "Name: " +
                getFirstName() + " " + getSecondName() +
                ", jobTitle = '" + jobTitle + '\'' +
                ", salary = " + salary + ".";
    }
}