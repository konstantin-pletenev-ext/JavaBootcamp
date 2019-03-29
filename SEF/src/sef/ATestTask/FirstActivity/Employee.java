package sef.ATestTask.FirstActivity;

public class Employee extends Person implements Comparable<Employee> {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee() {
    }

    public Employee(int empId, String jobTitle, String companyName, double salary) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    //TODO 2 add getters and setters
    public void setEmpId(int empIs) {
        this.empId = empIs;
    }

    public int getEmpId() {
        return this.empId;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }


    //TODO 3 override method announce()
    @Override
    public String announce() {
        return "My name is " + getFirstName() + " and i am " + getAge() + " years old\n" +
                "   I am work as " + getJobTitle() + " in " + getCompanyName();
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (this.getSalary() - o.getSalary());
    }
}


