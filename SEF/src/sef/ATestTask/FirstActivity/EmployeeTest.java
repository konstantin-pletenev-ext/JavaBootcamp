package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    public void testEmployeeCreatedProperly() {
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("Test1", employee.getFirstName());
    }

    public void testEmployeeCreatedProperly2() {
        Employee employee = new Employee(5, "testTitle", "testCompany", 150.0);
        assertEquals(5, employee.getEmpId());
        assertEquals("testTitle", employee.getJobTitle());
        assertEquals("testCompany", employee.getCompanyName());
        assertEquals(150.0, employee.getSalary());
    }

    public void testSetAndGetEmpID() {
        Employee employee = new Employee();
        employee.setEmpId(3);
        assertEquals(3, employee.getEmpId());
    }

    public void testSetAndGetJobTitle() {
        Employee employee = new Employee();
        employee.setJobTitle("aTitle");
        assertEquals("aTitle", employee.getJobTitle());
    }

    public void testSetAndGetCompanyName() {
        Employee employee = new Employee();
        employee.setCompanyName("aCompany");
        assertEquals("aCompany", employee.getCompanyName());
    }

    public void testSetAndGetSalary() {
        Employee employee = new Employee();
        employee.setSalary(35.0);
        assertEquals(35.0, employee.getSalary());
    }

    public void testAnnounce() {
        Employee employee = new Employee();
        employee.setFirstName("aName");
        employee.setSecondName("aSurname");
        employee.setAge(50);
        employee.setJobTitle("aTitle");
        employee.setCompanyName("aCompany");
        assertEquals("my name is " + employee.getFirstName() + " " + employee.getSecondName() +
                " and i am " + employee.getAge() + " years old\n" +
                "I work as a " + employee.getJobTitle() +
                " in " + employee.getCompanyName(),
                       employee.announce());
    }

    public void testFullChange() {
        Employee employee = new Employee();
        String name = "aName", name2 = "aName2";
        String surname = "aSurname", surname2 = "aSurname2";
        String title = "aTitle", title2 = "aTitle2";
        String company = "aCompany", company2 = "aCompany2";
        int age = 10, age2 = 20;
        int empID = 5, empID2 = 6;
        double salary = 15.0, salary2 = 20.0;

        employee.setFirstName(name);
        employee.setSecondName(surname);
        employee.setAge(age);
        employee.setEmpId(empID);
        employee.setJobTitle(title);
        employee.setCompanyName(company);
        employee.setSalary(salary);

        employee.fullChange(name2, surname2, age2, empID2, title2, company2, salary2);

        assertEquals(name2, employee.getFirstName());
        assertEquals(surname2, employee.getSecondName());
        assertEquals(age2, employee.getAge());
        assertEquals(empID2, employee.getEmpId());
        assertEquals(title2, employee.getJobTitle());
        assertEquals(company2, employee.getCompanyName());
        assertEquals(salary2, employee.getSalary());
    }

}