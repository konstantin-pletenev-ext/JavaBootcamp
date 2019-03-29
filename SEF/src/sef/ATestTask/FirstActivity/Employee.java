package sef.ATestTask.FirstActivity;


public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    public Employee(){

    }

    public Employee(String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary) {
        super(firstName, secondName, age);
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getempId() { return empId; }
    public void  setEmpId(int empId) {this.empId = empId;}
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary;}
    public String getjobTitle() { return jobTitle;}
    public void setjobTitle(String jobTitle) { this.jobTitle = jobTitle; }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) { this.companyName = companyName;}

    public String announce() {
        return "My name is" + getFirstName() + " " + getSecondName() +
                " I am " + getAge() + " years old" + getjobTitle() + " I am work in " + getCompanyName() + ".";
    }


}

