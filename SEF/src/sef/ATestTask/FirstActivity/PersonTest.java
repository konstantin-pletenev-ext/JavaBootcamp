package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

public class PersonTest extends TestCase {

    public void testcheckAnnounce() {
        Person person = new Person();
        person.setFirstName("TestName");
        person.setSecondName("TestSecondName");
        person.setAge(123);


        assertEquals("I am TestName TestSecondName and I am 123 years old.", "I am " + person.getFirstName() + " " + person.getSecondName() + " and I am " + person.getAge() + " years old.");
    }
}
