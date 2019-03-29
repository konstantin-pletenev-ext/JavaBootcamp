package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class StudentTest extends TestCase {

    Person myPerson = new Student();
        try{
        myPerson.setFirstName("Ivan3");
    }catch (IllegalArgumentException e) {
        System.out.println("Student's name contains numbers");
    }
    @Test
    public void testAge (){
        Person myStudent = new Student();
        myStudent.setAge(20);
        assertEquals(20,myStudent.getAge());
    }
}
