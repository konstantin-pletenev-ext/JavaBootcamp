package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    public Employee(){

    }

    public Employee(String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary) throws InvalidPersonNameException {
        super(firstName, secondName, age);
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public Employee(Employee employee) throws InvalidPersonNameException {
        super(employee.getFirstName(), employee.getSecondName(), employee.getAge());
        this.empId = employee.getEmpId();
        this.jobTitle = employee.getJobTitle();
        this.companyName = employee.getCompanyName();
        this.salary = employee.getSalary();
    }

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

    @Override
    public String announce() {
        return super.announce() + "\nI am work as " + getJobTitle() + " in " + getCompanyName();
    }

    public void setAll(String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary) throws InvalidPersonNameException {
        this.setFirstName(firstName);
        this.setSecondName(secondName);
        this.setAge(age);
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }
}