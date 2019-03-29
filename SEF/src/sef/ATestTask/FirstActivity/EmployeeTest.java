package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class EmployeeTest extends TestCase {
    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testEmployeeCreatedProperly() {
        Employee employee = new Employee();
        employee.setFirstName("Jorge");
        assertEquals("I am an error message", "Jorge", employee.getFirstName());

        employee.setSecondName("Bush");
        assertEquals("I am an error message", "Bush", employee.getSecondName());

        employee.setSalary(100);
        assertEquals("I am an error message", 100, employee.getSalary());

        employee.setJobTitle("QA");
        assertEquals("I am an error message", "QA", employee.getJobTitle());

        employee.setCompanyName("Accenture");
        assertEquals("I am an error message", "Accenture", employee.getCompanyName());

        employee.setAge(50);
        assertEquals("I am an error message", 50, employee.getAge());

        employee.setEmpId(1);
        assertEquals("I am an error message", 1, employee.getEmpId());

        String expectedAnnounce = "My name is Jorge and i am 50 years old\n" +
                "   I am work as QA in Accenture";
        assertEquals(expectedAnnounce, employee.announce());
    }
}

