package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class PersonTest {

    @Test
    public void testConstructors(){
        Person person = new Person();
        assertEquals("Unknown", person.getFirstName());
        assertEquals("Unknown", person.getSecondName());
        assertEquals(0, person.getAge());

        try {
            person = new Person("Name", "Surname", 20);
        } catch (InvalidPersonNameException e) {
            fail();
        }
        assertEquals("Name", person.getFirstName());
        assertEquals("Surname", person.getSecondName());
        assertEquals(20, person.getAge());
    }

    @Test
    public void testFirstName(){
        Person person = new Person();
        assertEquals("Unknown", person.getFirstName());
        try {
            person.setFirstName("Name");
        } catch (InvalidPersonNameException e) {
            fail();
        }
        assertEquals("Name", person.getFirstName());
        try {
            person.setFirstName("");
        } catch (InvalidPersonNameException e) {
            fail();
        }
        assertEquals("", person.getFirstName());
        try {
            person.setFirstName(null);
        } catch (InvalidPersonNameException e) {
            assertEquals("invalid name", e.getMessage());
        }
        try {
            person.setFirstName("Name1");
        } catch (InvalidPersonNameException e) {
            assertEquals("invalid name", e.getMessage());
        }
    }

    @Test
    public void testSecondName(){
        Person person = new Person();
        assertEquals("Unknown", person.getSecondName());
        try {
            person.setSecondName("Surname");
        } catch (InvalidPersonNameException e) {
            fail();
        }
        assertEquals("Surname", person.getSecondName());
        try {
            person.setSecondName("");
        } catch (InvalidPersonNameException e) {
            fail();
        }
        assertEquals("", person.getSecondName());
        try {
            person.setSecondName(null);
        } catch (InvalidPersonNameException e) {
            assertEquals("invalid name", e.getMessage());
        }
        try {
            person.setSecondName("Surname1");
        } catch (InvalidPersonNameException e) {
            assertEquals("invalid name", e.getMessage());
        }
    }

    @Test
    public void checkAge(){
        Person person = new Person();
        assertEquals(0, person.getAge());
        person.setAge(1);
        assertEquals(1, person.getAge());
        person.setAge(-10);
        assertEquals(-10, person.getAge());
    }

    @Test
    public void checkAnnounce(){
        Person person = new Person();
        assertEquals("My name is Unknown Unknown and i am 0 years old",
                person.announce());
        try {
            person.setFirstName("Name");
        } catch (InvalidPersonNameException e) {
            fail();
        }
        try {
            person.setSecondName("Surname");
        } catch (InvalidPersonNameException e) {
            fail();
        }
        person.setAge(20);
        assertEquals("My name is Name Surname and i am 20 years old",
                person.announce());
    }
}
