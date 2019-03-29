package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;


public class EmployeeTest extends TestCase {

    public void testcheckEmployeeCreatedProperly() {
        Employee employee = new Employee();
        employee.setFirstName("TestName");
        assertEquals("I am an error message", "TestName", employee.getFirstName());
        employee.setSecondName("TestSecondName");
        assertEquals("I am an error message", "TestSecondName", employee.getSecondName());
        employee.setCompanyName("TestCompanyName");
        assertEquals("I am an error message", "TestCompanyName", employee.getCompanyName());
        employee.setEmpId(11);
        assertEquals("I am an error message", 11, employee.getEmpId());
        employee.setJobTitle("TestJobTitle");
        assertEquals("I am an error message", "TestJobTitle", employee.getJobTitle());
        employee.setSalary(0);
        assertEquals("I am an error message", 0.0, employee.getSalary());
        employee.setAge(123);
        assertEquals("I am an error message", 123, employee.getAge());


    }

    public void testcheckAnnounce() {
        Employee employee = new Employee();
        employee.setFirstName("TestName");
        employee.setAge(123);
        employee.setJobTitle("TestJobTitle");
        employee.setCompanyName("TestCompanyName");

        assertEquals("My name is TestName and I am 123 years old I am work as TestJobTitle in TestCompanyName","My name is "+employee.getFirstName()+" and I am "+employee.getAge()+" years old I am work as " +employee.getJobTitle()+" in "+employee.getCompanyName());
    }
}