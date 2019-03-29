package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class EmployeeTest {

    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        try {
            employee.setFirstName("Test1");
            fail();
        } catch (CustumizeException e) {

        }
        try {
            employee.setFirstName("Test");
        } catch (CustumizeException e) {
            fail();
        }
        assertEquals("Test", employee.getFirstName());
    }
    @Test
    public void setSalary(){
        Employee employee = new Employee();
        employee.setSalary(1000.);
        assertEquals(1000.,employee.getSalary());
    }
}
