package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
    private  Employee employee;
    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        employee = new Employee();
    }

    public void testEmployeeFirstName() {
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());

    }
    public void testEmployeeSecondName(){
        employee.setSecondName("Anandan");
        assertEquals("Anandan", employee.getSecondName());
    }

    public void testEmployeeId(){
        employee.setEmpId(01);
        assertEquals(01,employee.getEmpId());

    }
    public void testEmployeeJobTitle(){
        employee.setJobTitle("fwefewf");
        assertEquals("I am an error message", "fwefewf", employee.getJobTitle());
    }
   public void testEmployeeCompanyName(){
        employee.setCompanyName("TATA");
        assertEquals("TATA", employee.getCompanyName());
   }
   public void testEmployeeSalary(){
       // toString().replace(employee.setSalary(3422);)
        employee.setSalary(3422);
        assertEquals(3422.0, employee.getSalary());
   }
   public void testEmployeeAnnounce(){
        employee.announce();
        assertEquals(employee.announce(),employee.announce());
   }

   }
