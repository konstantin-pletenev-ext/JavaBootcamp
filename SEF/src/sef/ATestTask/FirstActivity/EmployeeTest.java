package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    private Employee employee;

    protected void setUp() throws Exception {
         employee = new Employee();
    }

    public void testEmployeeCreatedProperly() {
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());

    }
        public void testSetandGetJobTitle() {
            String testJobTitle = "AJobTitle";
           employee.setJobTitle(testJobTitle);
            assertEquals(testJobTitle, employee.getJobTitle());
        }

    public void testSetandGetComapnyName() {
        String testCompanyName = "ACompanyName";
      employee.setCompanyName(testCompanyName);
        assertEquals(testCompanyName, employee.getCompanyName());
    }
    public void testSetandGetEmpId() {
        int testEmpId = 123;
       employee.setEmpId(testEmpId);
        assertEquals(testEmpId, employee.getEmpId());
    }
    public void testSetandGetSalary() {
        double testSalary = 1230.50;
       employee.setSalary(testSalary);
        assertEquals(testSalary, employee.getSalary());
    }

    }


