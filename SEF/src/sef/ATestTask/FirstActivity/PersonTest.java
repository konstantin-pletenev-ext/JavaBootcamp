package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    public void testCheckPersonCreatedProperly() {
        Person person = new Person();
        person.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", person.getFirstName());
        person.setSecondName("Test1");
        assertEquals("I am an error message", "Test1", person.getSecondName());
        person.setAge(20);
        assertEquals("I am an error message",20, person.getAge());
    }

    public void testCheckPersonAnnounceProperly(){
        Person person = new Person();
        person.setFirstName("Test1");
        person.setSecondName("Test2");
        person.setAge(20);
        assertEquals("I am an error message", "My name is Test1 Test2 and I am 20 year old", person.announce());
    }

    public void testCheckPersonDefaultConstructor(){
        Person person = new Person();
        assertEquals("Unknown", person.getFirstName());
        assertEquals("Unknown", person.getSecondName());
        assertEquals(0, person.getAge());
    }

    public void testCheckPersonConstructor(){
        Person person = new Person("Test1", "Test2", 20);
        assertEquals("Test1", person.getFirstName());
        assertEquals("Test2", person.getSecondName());
        assertEquals(20, person.getAge());
    }
}
