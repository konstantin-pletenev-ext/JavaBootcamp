package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentTest extends TestCase {

    public void testCheckStudentCreatedProperly() {
        Student a = new Student();
        a.setFirstName("Maksims");
        a.setSecondName("Snezkins");
        a.setAge(22);
        a.setSchool("University of Latvia");
        a.setGrade(7);

        boolean badScenario = false;
        if (checkForNumbers(a.getFirstName())) {
            System.out.println("Error: " + a.getFirstName() + " is not a name! Please, correct the data!");
            badScenario = true;
        }
        if (checkForNumbers(a.getSecondName())) {
            System.out.println("Error: " + a.getSecondName() + " is not a surname! Please, correct the data!");
            badScenario = true;
        }


        assertEquals(false, checkForNumbers(a.getFirstName()));
        assertEquals(false, checkForNumbers(a.getSecondName()));
        assertEquals(false, badScenario);
        assertEquals("My name is Maksims Snezkins and I study at University of Latvia.", a.announce());
        assertEquals(7, a.getGrade());
        assertEquals(22, a.getAge());

    }

    public void testCheckStudentWithoutDataCreatedProperly() {
        Student b = new Student();

        assertEquals("My name is Unknown Unknown and I study at Unknown.", b.announce());
    }

    public void testCheckPersonWithIncorrectDataCreatedProperly() {
        Student c = new Student();

        c.setFirstName("Maks1ims");
        c.setSecondName("Snezkins3");

        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(c.getFirstName());
        Matcher m2 = p.matcher(c.getSecondName());

        boolean badScenario = false;
        if (m.find()) {
            System.out.println("Error: " + c.getFirstName() + " is not a name! Please, correct the data!");
            badScenario = true;
        }
        if (m2.find()) {
            System.out.println("Error: " + c.getSecondName() + " is not a surname! Please, correct the data!");
            badScenario = true;
        }

        assertEquals(true, badScenario);
        assertEquals(true, checkForNumbers(c.getFirstName()));
        assertEquals(true, checkForNumbers(c.getSecondName()));

        assertEquals("Error: Maks1ims is not a name! Please, correct the data!", "Error: " + c.getFirstName() +
                " is not a name! Please, correct the data!");
        assertEquals("Error: Snezkins3 is not a surname! Please, correct the data!", "Error: " + c.getSecondName() +
                " is not a surname! Please, correct the data!");


    }

    public static boolean checkForNumbers(String s) {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(s);

        return m.find();
    }


}
