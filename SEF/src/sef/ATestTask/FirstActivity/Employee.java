package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors


    public Employee (String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary ) {
        super(firstName, secondName,age);
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;

    }

    public Employee() {

    }

    //TODO 2 add getters and setters
    public int getEmpId(){
        return getEmpId();
    }
    public String getJobTitle(){
        return getJobTitle();
    }
    public String getCompanyName(){
        return getCompanyName();
    }
    public double getSalary(){
        return getSalary();
    }

    public void setEmpId(int empId){
        this.empId = empId;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }


    //TODO 3 override method announce()
    public String announce(){
        return super.announce() + "I am a " + getJobTitle() + " at " + getCompanyName() + ".";
    }




}