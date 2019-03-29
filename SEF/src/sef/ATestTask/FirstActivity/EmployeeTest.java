package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Adams");
        assertEquals("Adams", employee.getFirstName());
    }

    public void checkEmployeejobTitle(){
        Employee employ = new Employee();
        employ.setjobTitle("Tester");
        assertEquals("Tester", employ.getjobTitle());
    }
