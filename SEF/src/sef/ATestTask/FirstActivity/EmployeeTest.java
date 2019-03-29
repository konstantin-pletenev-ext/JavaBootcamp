package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;


public class EmployeeTest extends TestCase {

    private Employee employee;

    protected void setUp() throws Exception {
        employee = new Employee();
    }

    public void testSetandGetFirstName() {
        String firstName = "Alex";
        employee.setFirstName(firstName);
        assertEquals("Alex", employee.getFirstName());
    }

    public void testSetandGetSecondName() {
        String secondName = "Ivanov";
        employee.setSecondName(secondName);
        assertEquals("Ivanov", employee.getSecondName());
    }

    public void testSetandGetAge() {
        int age = 88;
        employee.setAge(age);
        assertEquals(88, employee.getAge());
    }

    public void testSetAndGetEmpId() {
        int empId = 12;
        employee.setEmpId(empId);
        assertEquals(12, employee.getEmpId());
    }

    public void testSetandGetJobTitle() {
        String jobTitle = "Manager";
        employee.setJobTitle(jobTitle);
        assertEquals("Manager", employee.getJobTitle());
    }

    public void testSetAndGetCompanyName() {
        String companyName = "Samsung";
        employee.setCompanyName(companyName);
        assertEquals("Samsung", employee.getCompanyName());
    }

    public void testSetAndGetSalary() {
        double salary = 255.5;
        employee.setSalary(salary);
        assertEquals(255.5, employee.getSalary());
    }

    // @Test
    public void testEmployeeCreatedProperly() {
        Employee employee = new Employee(12, "Manager", "Samsung", 250.0);
        assertEquals(12, employee.getEmpId());
        assertEquals("Manager", employee.getJobTitle());
        assertEquals("Samsung", employee.getCompanyName());
        assertEquals(250.0, employee.getSalary());
    }

    public void testSecondEmployeeCreatedProperly() {
        Employee employee = new Employee("Rita", "Ivanova", "Manager", 259.0);
        assertEquals("Rita", employee.getFirstName());
        assertEquals("Ivanova", employee.getSecondName());
        assertEquals("Manager", employee.getJobTitle());
        assertEquals(259.0, employee.getSalary());
    }

    public void testThirdEmployeeCreatedProperly() {
        Employee employee = new Employee("Rita", "Ivanova", 25, "Manager", "Samsung", 350.0);
        assertEquals("Rita", employee.getFirstName());
        assertEquals("Ivanova", employee.getSecondName());
        assertEquals(25, employee.getAge());
        assertEquals("Manager", employee.getJobTitle());
        assertEquals("Samsung", employee.getCompanyName());
        assertEquals(350.0, employee.getSalary());
    }

    public void testFourthEmployeeCreatedProperly() {
        Employee employee = new Employee("Rita", "Ivanova", 26, "Manager", "Samsung");
        assertEquals("Rita", employee.getFirstName());
        assertEquals("Ivanova", employee.getSecondName());
        assertEquals(26, employee.getAge());
        assertEquals("Manager", employee.getJobTitle());
        assertEquals("Samsung", employee.getCompanyName());
    }

    public void testFifthEmployeeCreatedProperly() {
        Employee employee = new Employee();
        assertEquals(null, employee.getFirstName());
        assertEquals(null, employee.getSecondName());
        assertEquals(0, employee.getAge());
        assertEquals(0, employee.getEmpId());
        assertEquals(null, employee.getJobTitle());
        assertEquals(null, employee.getCompanyName());
        assertEquals(0.0, employee.getSalary());
    }

    public void testAnnounce() {
        Employee employee = new Employee("Rita", "Ivanova", 26, "Manager", "Samsung");
        assertEquals("I am Employee. My name is Rita Ivanova. I am 26 years old. I am work as Manager in company Samsung.", employee.announce());
    }

}