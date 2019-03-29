package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private String FirstName;
    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
        this.empId = 12345;
        this.jobTitle = "Tester";
        this.companyName = "Accenture";
        this.salary = 2150.68;
        this.FirstName = "Adams";
    }

    public Employee(int empId, String jobTitle, String companyName, double salary, String FirstName){
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.FirstName = FirstName;
    }

    //TODO 2 add getters and setters
    public int getempId() {
        return empId;
    }
    public void setempId(int empId){
        this.empId = empId;
    }
    public String getjobTitle() {
        return jobTitle;
    }
    public void setjobTitle (String jobTitle){
        this.jobTitle = jobTitle;
    }
    public String getcompanyName(){
        return companyName;
    }
    public void setcompanyName (String companyName){
        this.companyName = companyName;
    }
    public double getsalary(){
        return salary;
    }
    public void setsalary(double salary){
        this.salary = salary;
    }
    public String getFirstName(){
        return FirstName;
    }
    public void setFirstName(String FirstName){
        this.FirstName=FirstName;
    }

    //TODO 3 override method announce()

    @Override
    public String announce() {
        return super.announce() + "I am working as a " + getjobTitle() + " in " + getcompanyName();
    }
}