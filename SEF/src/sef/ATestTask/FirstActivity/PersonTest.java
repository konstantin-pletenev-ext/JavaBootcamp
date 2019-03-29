package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class PersonTest extends TestCase {
    public static void main(String [] args) {

        Person myPerson = new Person();
        try{
            myPerson.setFirstName("Ivan3");
        }catch (IllegalArgumentException e) {
            System.out.println("Person's name contains numbers");
        }

        Person myPerson = new Person();
        try{
            myPerson.setSecondName("D0nut");
        }catch (IllegalArgumentException e) {
            System.out.println("Person's second name contains numbers");
        }

    }
    @Test
    public void testAge (){
        Person myPerson = new Person();
        myPerson.setAge(20);
        assertEquals(20,myPerson.getAge());
    }
    @Test
    public void testAgeZero (){
        Person myPerson = new Person();
        myPerson.setAge(0);
        assertEquals(0,myPerson.getAge());
        assertTrue(myPerson.getAge() >= 0);
    }







}
