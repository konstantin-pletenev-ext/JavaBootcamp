package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors

    public Employee() {
        this.empId = 0;
        this.jobTitle = "DefaultTitle";
        this.companyName = "DefaultCompany";
        this.salary = 100.0;
    }
    public Employee(int e, String j, String c, double s) {
        this.empId = e;
        this.jobTitle = j;
        this.companyName = c;
        this.salary = s;
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

    //Full change method
    public void fullChange(String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary) {
        setFirstName(firstName);
        setSecondName(secondName);
        setAge(age);
        setEmpId(empId);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setSalary(salary);
    }


    //TODO 3 override method announce()

    public String announce() {
        return "my name is " + getFirstName() + " " + getSecondName() +
                " and i am " + getAge() + " years old\n" +
                    "I work as a " + getJobTitle() +
                        " in " + getCompanyName();
    }

}