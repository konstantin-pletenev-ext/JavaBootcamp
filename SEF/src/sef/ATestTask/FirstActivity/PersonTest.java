package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    public void testPersonCreatedProperly() {
        Person person = new Person();
        person.setFirstName("aName");
        assertEquals("aName", person.getFirstName());
    }

    public void testPersonCreatedProperly2() {
        String firstName = "aName", secondName = "aSurname";
        int age = 25;

        Person person = new Person(firstName, secondName, age);
        assertEquals(firstName, person.getFirstName());
        assertEquals(secondName, person.getSecondName());
        assertEquals(age, person.getAge());
    }

    public void testSetAndGetFirstName() {
        String firstName = "aName";

        Person person = new Person();
        person.setFirstName(firstName);
        assertEquals(firstName, person.getFirstName());
    }

    public void testSetAndGetSecondName() {
        String secondName = "aSurname";

        Person person = new Person();
        person.setSecondName(secondName);
        assertEquals(secondName, person.getSecondName());
    }

    public void testSetAndGetAge() {
        int age = 43;

        Person person = new Person();
        person.setAge(age);
        assertEquals(age, person.getAge());
    }

    public void testAnnounce() {
        String firstName = "aName", secondName = "aSurname";
        int age = 25;

        Person person = new Person(firstName, secondName, age);
        assertEquals("My name is " + firstName + " " + secondName +
                " and i am " + age + " years old",
                    person.announce());
    }

    public void testCheckContainsNumbers() {
        int number = 1;

        try {
            Person person = new Person();
            person.checkContainsNumbers("Ivan");
            number = 2;

        } catch(IllegalArgumentException num) { }
        assertEquals("Ivan should be allowed, but isn't!", 2, number);

        number = 1;
        try {
            Person person = new Person();
            person.checkContainsNumbers("Ivan3");
            number = 2;

        } catch(IllegalArgumentException num) { }
        assertEquals("Ivan3 should not be allowed, but is", 1, number);
    }


}
