package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }

}