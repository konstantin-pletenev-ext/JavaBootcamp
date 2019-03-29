package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    public void testSetandGetage(){
        Person person = new Person();
        int testage = 10;
        assertEquals(0, person.getAge());
        person.setAge(testage);
        assertEquals(testage, person.getAge());
    }

    public void testSetandGetfirstName() {
        Person person = new Person();
        String testfirstName = "firstName";
        assertEquals("Unknown", person.getFirstName());
        person.setFirstName(testfirstName);
        assertEquals(testfirstName, person.getFirstName());
    }

    public void testSetandGetsecondName() {
        Person person = new Person();
        String testsecondName = "secondName";
        assertEquals("Unknown", person.getSecondName());
        person.setSecondName(testsecondName);
        assertEquals(testsecondName, person.getSecondName());
    }

    public void testPersonannounce(){
        Person person = new Person("firstName","lastName", 10);
        assertEquals("My name is  firstName lastName and I am 10 years old.", person.announce());
    }

}
