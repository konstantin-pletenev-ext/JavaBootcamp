package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    public void testCheckEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message","Test1", employee.getFirstName());
        employee.setSecondName("Test1");
        assertEquals("I am an error message","Test1", employee.getSecondName());
        employee.setAge(20);
        assertEquals("I am an error message",20, employee.getAge());
        employee.setEmpId(23);
        assertEquals("I am an error message",23, employee.getEmpId());
        employee.setJobTitle("Test1");
        assertEquals("I am an error message","Test1", employee.getJobTitle());
        employee.setCompanyName("Test1");
        assertEquals("I am an error message","Test1", employee.getCompanyName());
        employee.setSalary(1000);
        assertEquals("I am an error message",1000.0, employee.getSalary());
    }
    public void testCheckEmployeeAnnounceProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        employee.setSecondName("Test2");
        employee.setAge(22);
        employee.setJobTitle("Test3");
        employee.setCompanyName("Test4");
        employee.setEmpId(11);
        employee.setSalary(1000.0);
        assertEquals("I am an error message",
                "My name is Test1 Test2 and I am 22 year old I am working as Test3 In Test4", employee.announce());
    }

    public void testCheckEmployeeDefaultConstructor(){
        Employee employee = new Employee();
        assertEquals(0, employee.getEmpId());
        assertEquals("Unknown", employee.getJobTitle());
        assertEquals("Unknown", employee.getCompanyName());
        assertEquals(0.0, employee.getSalary());
    }

    public void testCheckEmployeeConstructor(){
        Employee employee = new Employee(11, "Test1", "Test2", 1000);
        assertEquals(11, employee.getEmpId());
        assertEquals("Test1", employee.getJobTitle());
        assertEquals("Test2", employee.getCompanyName());
        assertEquals(1000.0, employee.getSalary());
    }

    public void testCheckEmployeeShortConstructor(){
        Employee employee = new Employee(11, "Test1");
        assertEquals(11, employee.getEmpId());
        assertEquals("Test1", employee.getCompanyName());
    }
}