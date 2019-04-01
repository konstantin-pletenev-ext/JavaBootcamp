package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonTest extends TestCase {
    public void testCheckPersonCreatedProperly() {
        Person a = new Person();
        a.setFirstName("Maksims");
        a.setSecondName("Snezkins");
        a.setAge(22);

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
        assertEquals("My name is Maksims Snezkins and I am 22 years old.", a.announce());
    }

    public void testCheckPersonWithoutDataCreatedProperly() {
        Person b = new Person();

        assertEquals("My name is Unknown Unknown and I am 0 years old.", b.announce());
    }

    public void testCheckPersonWithIncorrectDataCreatedProperly() {
        Person c = new Person();

        c.setFirstName("Maks1ims");
        c.setSecondName("Snezkins3");
        c.setAge(22);

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
