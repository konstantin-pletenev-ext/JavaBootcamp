package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeTest extends TestCase {
    public void testCheckEmployeeCreatedProperly() {
        Employee a = new Employee();
        a.setFirstName("Linda");
        a.setSecondName("Belicka");
        a.setAge(22);
        a.setEmpId(1);
        a.setJobTitle("tester");
        a.setCompanyName("Accenture");
        a.setSalary(1234.50);

        boolean badScenario = false;
        if (checkForNumbers(a.getFirstName())) {
            System.out.println("Error: " + a.getFirstName() + " is not a name! Please, correct the data!");
            badScenario = true;
        }
        if (checkForNumbers(a.getSecondName())) {
            System.out.println("Error: " + a.getFirstName() + " is not a surname! Please, correct the data!");
            badScenario = true;
        }


        assertEquals(false, checkForNumbers(a.getFirstName()));
        assertEquals(false, checkForNumbers(a.getSecondName()));
        assertEquals(false, badScenario);
        assertEquals("My name is Linda Belicka and I work as a tester in Accenture.", a.announce());
        assertEquals(1, a.getEmpId());
        assertEquals(1234.50, a.getSalary());

    }

    public void testCheckEmployeeWithoutDataCreatedProperly() {
        Employee b = new Employee();

        assertEquals("My name is Unknown Unknown and I work as an unknown in Unknown.", b.announce());
    }

    public void testCheckEmployeeWithIncorrectDataCreatedProperly() {
        Employee c = new Employee();

        c.setFirstName("Maks1ims");
        c.setSecondName("Snezkins3");
        c.setEmpId(1);

        boolean badScenario = false;
        if (checkForNumbers(c.getFirstName())) {
            System.out.println("Error: " + c.getFirstName() + " is not a name! Please, correct the data!");
            badScenario = true;
        }
        if (checkForNumbers(c.getSecondName())) {
            System.out.println("Error: " + c.getSecondName() + " is not a surname! Please, correct the data!");
            badScenario = true;
        }

        assertEquals(true, badScenario);
        assertEquals(true, checkForNumbers(c.getFirstName()));
        assertEquals(true, checkForNumbers(c.getSecondName()));

        assertEquals("Error: Maks1ims is not a name! Please, correct the data!", "Error: "
                + c.getFirstName() + " is not a name! Please, correct the data!");
        assertEquals("Error: Snezkins3 is not a surname! Please, correct the data!", "Error: "
                + c.getSecondName() + " is not a surname! " +
                "Please, correct the data!");


    }

    public static boolean checkForNumbers(String s) {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(s);

        return m.find();
    }
}