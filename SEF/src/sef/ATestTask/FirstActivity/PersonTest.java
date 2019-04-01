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

        // Create a Pattern object
        Pattern p = Pattern.compile("^[a-zA-Z ]+$");

        // Now create matcher object.
        Matcher m = p.matcher(a.getFirstName());
        Matcher m2 = p.matcher(emp.getSecondName());
        if (!m.find()) {
            System.out.println("Error: " + emp.getFirstName() + " is not a name! Please, correct the data!");
            badScenario = true;
        }
        if (!m2.find()) {
            System.out.println("Error: " + emp.getSecondName() + " is not a surname! Please, correct the data!");
            badScenario = true;
        }


        assertEquals("My name is Maksims Snezkins and I am 22 years old.", "My name is " +
                a.getFirstName() + " " + a.getSecondName() + " and I am " + a.getAge() + " years old.");

        Person b = new Person();

        assertEquals("My name is Unknown Unknown and I am 0 years old.", "My name is " +
                b.getFirstName() + " " + b.getSecondName() + " and I am " + b.getAge() + " years old.");

    }
}
