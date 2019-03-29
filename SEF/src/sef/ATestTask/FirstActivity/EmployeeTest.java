package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.fail;

public class EmployeeTest {

    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        assertEquals("Unknown", employee.getFirstName());
        try {
            employee.setFirstName("Test");
        } catch (InvalidPersonNameException e) {
            fail();
        }
        assertEquals("Test", employee.getFirstName());

        try {
            employee = new Employee("Employee", "Surname", 20, 0, "Dancer", "Company1", 2);
        } catch (InvalidPersonNameException e) {
            fail();
        }
        assertEquals("Employee", employee.getFirstName());
        assertEquals("Surname", employee.getSecondName());
        assertEquals(20, employee.getAge());
        assertEquals(0, employee.getEmpId());
        assertEquals("Dancer", employee.getJobTitle());
        assertEquals("Company1", employee.getCompanyName());
        assertEquals(2., employee.getSalary(), 0.);

        Employee employee2 = null;
        try {
            employee2 = new Employee(employee);
        } catch (InvalidPersonNameException e) {
            fail();
        }
        assertEquals("Employee", employee2.getFirstName());
        assertEquals("Surname", employee2.getSecondName());
        assertEquals(20, employee2.getAge());
        assertEquals(0, employee2.getEmpId());
        assertEquals("Dancer", employee2.getJobTitle());
        assertEquals("Company1", employee2.getCompanyName());
        assertEquals(2., employee2.getSalary(), 0.);
    }

    @Test
    public void checkEmployeeId(){
        Employee employee = new Employee();
        assertEquals(0, employee.getEmpId());
        employee.setEmpId(1);
        assertEquals(1, employee.getEmpId());
        employee.setEmpId(-10);
        assertEquals(-10, employee.getEmpId());
    }

    @Test
    public void checkJobTitle(){
        Employee employee = new Employee();
        assertNull(employee.getJobTitle());
        employee.setJobTitle("");
        assertEquals("", employee.getJobTitle());
        employee.setJobTitle("Some Job");
        assertEquals("Some Job", employee.getJobTitle());
    }

    @Test
    public void checkCompanyName(){
        Employee employee = new Employee();
        assertNull(employee.getCompanyName());
        employee.setCompanyName("");
        assertEquals("", employee.getCompanyName());
        employee.setCompanyName("Some Company");
        assertEquals("Some Company", employee.getCompanyName());
    }

    @Test
    public void checkSalary(){
        Employee employee = new Employee();
        assertEquals(0, employee.getSalary(), 0.);
        employee.setSalary(1.1);
        assertEquals(1.1, employee.getSalary(), 0.);
        employee.setSalary(-10);
        assertEquals(-10, employee.getSalary(), 0.);
    }

    @Test
    public void checkAnnounce(){
        Employee employee = new Employee();
        assertEquals("My name is Unknown Unknown and i am 0 years old\nI am work as null in null",
                employee.announce());
        employee.setJobTitle("Janitor");
        employee.setCompanyName("Company");
        employee.setAge(30);
        assertEquals("My name is Unknown Unknown and i am 30 years old\nI am work as Janitor in Company",
                employee.announce());
    }

    @Test
    public void checkSetAll(){
        Employee employee = new Employee();
        try {
            employee.setAll("Employee", "Surname", 20, 0, "Dancer", "Company1", 2.);
        } catch (InvalidPersonNameException e) {
            fail();
        }
        assertEquals("Employee", employee.getFirstName());
        assertEquals("Surname", employee.getSecondName());
        assertEquals(20, employee.getAge());
        assertEquals(0, employee.getEmpId());
        assertEquals("Dancer", employee.getJobTitle());
        assertEquals("Company1", employee.getCompanyName());
        assertEquals(2., employee.getSalary(), 0.);
    }
}