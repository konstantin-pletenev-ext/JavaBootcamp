package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    private Employee employee;

    protected void setUp() throws Exception{
        employee = new Employee();
    }

    public void testEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }

    public void testSetandGetEmpID(){
        int testEmpID = 101;
        assertEquals(0, employee.getEmpId());
        employee.setEmpId(testEmpID);
        assertEquals(testEmpID, employee.getEmpId());
    }

    public void testSetandGetSalary(){
        double testSalary = 155.0;
        assertEquals(0.0, employee.getSalary());
        employee.setSalary(testSalary);
        assertEquals(testSalary, employee.getSalary());
    }

    public void testSetandGetcompanyName() {
        String testcompanyName = "companyName";
        assertEquals("Unknown", employee.getCompanyName());
        employee.setCompanyName(testcompanyName);
        assertEquals(testcompanyName, employee.getCompanyName());
    }

    public void testSetandGetjobTitle() {
        String testjobTitle = "companyName";
        assertEquals("Unknown", employee.getJobTitle());
        employee.setJobTitle(testjobTitle);
        assertEquals(testjobTitle, employee.getJobTitle());
    }

    public void testEmployeeannounce(){
        Employee employee = new Employee(101, "Job", "Comp", 12.3);
        assertEquals("My name is  Unknown Unknown and I am 0 years old. I work as Job in Comp", employee.announce());
    }
}