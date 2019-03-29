package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class StudentTest extends TestCase {
    @Test
    public void checkStudentCreatedProperly() {
        Student student = new Student();

        student.setFirstName("Jorge");
        assertEquals("I am an error message", "Jorge", student.getFirstName());

        student.setSecondName("Bush");
        assertEquals("I am an error message", "Bush", student.getSecondName());

        student.setAge(18);
        assertEquals("I am an error message", 18, student.getAge());

        student.setSchoolName("MySchool");
        assertEquals("I am an error message", "MySchool", student.getSchoolName());
    }
}

