package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest extends TestCase {

    public static void testCheckStudentCreatedProperly(){
        Student student = new Student();
        student.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", student.getFirstName());
        student.setSecondName("TestName");
        assertEquals("I am an error message for second name", "TestName", student.getSecondName());
        student.setAge(35);
        assertEquals("Error message for age", 35, student.getAge());
        student.setSchoolName("Bootcamp");
        assertEquals("Error message for School name", "Bootcamp", student.getSchoolName());
        student.setGrade(5);
        assertEquals("Error message for grade", 5, student.getGrade());
    }

    public static void testCheckStudentAnnounce() {
        Student student = new Student();
        student.setSchoolName("Bootcamp");
        assertEquals("I am studying in university Bootcamp", student.announce());
    }

}
