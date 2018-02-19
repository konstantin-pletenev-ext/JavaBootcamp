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

    }

/*
Add aditional tests based on Employee class
 */
}