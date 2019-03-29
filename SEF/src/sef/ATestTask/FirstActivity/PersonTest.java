package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    public void testCheckPersonCreatedProperly() {
        Person person = new Person();
        person.setFirstName("Test");
        assertEquals("I am an error message for name", "Test", person.getFirstName());
        person.setSecondName("TestSurname");
        assertEquals("I am an error message for surname", "TestSurname", person.getSecondName());
        person.setAge(18);
        assertEquals("I am an error message for age", 18, person.getAge());
    }

    public void testPersonAnnounceCreatedProperly() {
        Person person = new Person();
        person.setFirstName("Test");
        person.setSecondName("TestSurname");
        person.setAge(15);
        assertEquals("My name is Test TestSurname and i am 15 years old.", person.announce());
    }
}
