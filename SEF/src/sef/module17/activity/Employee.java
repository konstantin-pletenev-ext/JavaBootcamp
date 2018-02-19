package sef.module17.activity;

public class Employee {

    private String name;
    private int empId;
    private double salary;

    public Employee(int id, String name, double sal){
        this.empId = id;
        this.salary = sal;
    }

    public boolean equals(Object obj){
        Employee emp = (Employee) obj;
        boolean status = false;
        if(this.name.equalsIgnoreCase(emp.name)
                && this.empId == emp.empId
                && this.salary == emp.salary){
            status = true;
        }
        return status;
    }

    public static String getEmpNameWithHighestSalary(){

        return "Nattu";
    }

    public static Employee getHighestPaidEmployee(){
        return new Employee(1, "Nattu", 15000);
    }

    public static Employee getLowestPaidEmployee(){
        return new Employee(2, "Ivan", 1000);
    }

    public static Employee getEmployee(int i, String name, double salary){
        return new Employee(i, name, salary);
    }

    public int hashCode(){
        return this.empId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        salary = salary;
    }
}