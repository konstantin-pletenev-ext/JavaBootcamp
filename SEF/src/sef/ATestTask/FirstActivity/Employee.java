package sef.ATestTask.FirstActivity;

public class Employee extends sef.ATestTask.FirstActivity.Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
        this.empId = 01;
        this.jobTitle = "Test Automation";
        this.companyName = "Accenture";
        this.salary = 2000.50;

    }

    //TODO 2 add getters and setters
    public int getEmpId() {
        return  empId;
    }
    public  String getJobTitle(){
        return jobTitle;
    }
    public String getCompanyName(){
        return companyName;
    }
    public double getSalary(){
        return salary;
    }
    public void setEmpId(int empId){
        this.empId =empId;
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

    public void Changes (String FName, String SName, int Id, String Job,String CName, double Salary){

     this.firstName = FName;
     this.secondName = SName;
     this.empId = Id;
     this.jobTitle = Job;
     this.companyName = CName;
     this.salary = Salary;
    }

    //TODO 3 override method announce()
    @Override
   public String announce(){

        return super.announce()+ " I am work as "+ getJobTitle() + " in " + getCompanyName();
   }


}