package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EmployeeTest {

    @Test
    public void checkEmployeeCreatedProperly(){
        Employee emp = new Employee("Name", "Surname", 33, 5, "Job", "Company", 2.0);
        assertEquals("Name", emp.getFirstName());
        assertEquals("Surname", emp.getSecondName());
        assertEquals(33, emp.getAge());
        assertEquals(5, emp.getEmpId());
        assertEquals("Job", emp.getJobTitle());
        assertEquals("Company", emp.getCompanyName());
        assertEquals(2.0, emp.getSalary());
    }

}