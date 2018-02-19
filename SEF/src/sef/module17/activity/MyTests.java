package sef.module17.activity;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyTests {

    @Test
    public void mySimpleEqualsTest(){

        String expectedName = "Nattu";
        assertEquals(expectedName, Employee.getEmpNameWithHighestSalary());
    }

    @Test
    public void myObjectEqualsTest(){

        Employee expectedEmpObj = new Employee(1, "Nattu", 15000);
        assertEquals(expectedEmpObj, Employee.getHighestPaidEmployee());
    }

    @Test
    public void checkAddEmployeeTest(){
        Employee expectedEmpObj =
                new Employee(1, "Nattu", 15000);

        assertEquals(1, expectedEmpObj.getEmpId());
        assertEquals("Nattu", expectedEmpObj.getName());
        assertEquals(15000, expectedEmpObj.getSalary(), 2);
    }

    @Test
    public void checkEmployeeSalaryTest(){
        Employee expectedEmpObj = new Employee(1, "Nattu", 15000);
        assertNotNull(expectedEmpObj.getSalary());

        expectedEmpObj.setSalary(300);
        assertEquals(300, expectedEmpObj.getSalary(), 2);
    }

    @Test
    public void checkEmployeeNameTest(){
        Employee expectedEmpObj = new Employee(1, "Nattu", 15000);
        assertNotNull("Name is nulle", expectedEmpObj.getName());

        expectedEmpObj.setName("NewName");
        assertEquals("NewName", expectedEmpObj.getName());
    }

/*
Add aditional tests based on Employee class
 */
}