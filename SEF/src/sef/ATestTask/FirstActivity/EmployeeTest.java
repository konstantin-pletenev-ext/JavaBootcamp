package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class EmployeeTest extends TestCase {

    public void testCheckEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
        employee.setSecondName("TestName");
        assertEquals("I am an error message for second name", "TestName", employee.getSecondName());
        employee.setAge(35);
        assertEquals("Error message for age", 35, employee.getAge());
        employee.setEmpId(2);
        assertEquals("Error message for ID", 2, employee.getEmpId());
        employee.setJobTitle("Cleaner");
        assertEquals("Error message for jobtitle", "Cleaner", employee.getJobTitle());
        employee.setCompanyName("Company");
        assertEquals("Error message for company", "Company", employee.getCompanyName());
        employee.setSalary(1000);
        assertEquals("Error message for salary", 1000.0, employee.getSalary());
    }

    public void testAnnounceCreatedProperly() {
        Employee employee = new Employee();
        employee.setFirstName("Vasja");
        employee.setAge(35);
        employee.setJobTitle("Translator");
        employee.setCompanyName("SDI");
        assertEquals("My name is Vasja, i am 35 years old. I am working as Translator at the SDI", employee.announce());
    }


}