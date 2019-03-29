package sef.ATestTask.FirstActivity;
import java.sql.Connection;
import java.util.Scanner;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }

    private void assertEquals(String i_am_an_error_message, String test1, String firstName) {
    }


    public class EmployeeCTest extends TestCase {

        Employee emp;

        protected void setUp() throws  {

            emp = new Employee();
        }

        private Connection Emplyee() {
            return null;

        }
    }



}