package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;
import sef.ATestTask.ThirdActivity.CustomException;

public class EmployeeTest extends TestCase {

    @Test
    public void checkEmployeeName(){
        Employee employee = new Employee();
        try{
            employee.setFirstName("Test1");
            fail();
        }catch (CustomException e) {

        }try{
            employee.setFirstName("Test");
        }catch (CustomException e) {
            fail();
        }

    }

}