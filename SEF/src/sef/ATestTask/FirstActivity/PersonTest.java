package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {


    private Person person;

    protected void setUp() throws Exception {
        person = new Person();
    }

    public void testPersonCreatedProperly() {
        person.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", person.getFirstName());
    }
    public void testSetandGetFirstName() {
        String testFirstName = "VeryFirst";
        person.setFirstName(testFirstName);
        assertEquals(testFirstName, person.getFirstName());
    }
    public void testSetandGetSecondName() {
        String testSecondName = "VerySecond";
        person.setSecondName(testSecondName);
        assertEquals(testSecondName, person.getSecondName());
    }
    public void testAge() {
        person.setAge(1);
        assertEquals(1, person.getAge());
    }
    public void testFirstName() {
        person.setFirstName("Karlis");
        assertEquals("Karlis", person.getFirstName());
     }
    public void testSecondName() {
        person.setSecondName("Uzvards");
        assertEquals("Uzvards", person.getSecondName());
    }
    public void testAnnounce() {
        person.announce();
        assertEquals(person.announce(), person.announce());
    }

    }




