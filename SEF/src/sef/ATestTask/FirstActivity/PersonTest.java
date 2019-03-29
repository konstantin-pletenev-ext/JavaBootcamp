package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class PersonTest extends TestCase {
    @Test
    public void checkPersonCreatedProperly() {
        Person student = new Person();

        student.setFirstName("Jorge");
        assertEquals("I am an error message", "Jorge", student.getFirstName());

        student.setSecondName("Bush");
        assertEquals("I am an error message", "Bush", student.getSecondName());

        student.setAge(60);
        assertEquals("I am an error message", 60, student.getAge());
    }
}
