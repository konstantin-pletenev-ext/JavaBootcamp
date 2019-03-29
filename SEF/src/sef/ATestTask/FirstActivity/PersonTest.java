package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
    private Person person;

    protected void setUp() throws Exception {
        person = new Person();
    }

    public void testSetGetFirstName() {
        String testFirstName = "Name";

        assertEquals("Unknown", person.getFirstName());

        person.setFirstName(testFirstName);
        assertEquals(testFirstName, person.getFirstName());

        person.setFirstName("");
        assertEquals("", person.getFirstName());
    }
    public void testSetGetSecondName() {
        String testSecondName = "Name";

        assertEquals("Unknown", person.getSecondName());

        person.setSecondName(testSecondName);
        assertEquals(testSecondName, person.getSecondName());
    }
    public void testSetGetAge() {
        int testAge = 21;

        assertEquals(0, person.getAge());

        person.setAge(testAge);
        assertEquals(testAge, person.getAge());
    }
    public void testAnnounce() {
        String testAnnounce = "I am Unknown Unknown and i am 0 years old";
        assertEquals(testAnnounce, person.announce());
    }
    public void testPerson(){
        Person gg = new Person("Ivan", "Lunkov", 23);
        assertEquals("Ivan", gg.getFirstName());
        assertEquals("Lunkov", gg.getSecondName());
        assertEquals(23, gg.getAge());
    }


}
