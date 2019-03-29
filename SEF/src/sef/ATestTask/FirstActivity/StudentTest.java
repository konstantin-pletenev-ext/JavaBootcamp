package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.fail;

public class StudentTest {

    @Test
    public void testConstructors(){
        Student student = new Student();
        assertEquals("Unknown", student.getFirstName());
        assertEquals("Unknown", student.getSecondName());
        assertEquals(0, student.getAge());
        assertNull(student.getSchoolName());

        try {
            student = new Student("Name", "Surname", 35, "SchoolName");
        } catch (InvalidPersonNameException e) {
            fail();
        }
        assertEquals("Name", student.getFirstName());
        assertEquals("Surname", student.getSecondName());
        assertEquals(35, student.getAge());
        assertEquals("SchoolName", student.getSchoolName());
    }
    
    @Test
    public void testSchoolName(){
        Student student = new Student();
        assertNull(student.getSchoolName());
        student.setSchoolName("SchoolName");
        assertEquals("SchoolName", student.getSchoolName());
        student.setSchoolName("");
        assertEquals("", student.getSchoolName());
    }

    @Test
    public void checkAnnounce(){
        Student student = new Student();
        assertEquals("My name is Unknown Unknown and i am 0 years old\nI am study in university null",
                student.announce());
        try {
            student.setFirstName("Name");
        } catch (InvalidPersonNameException e) {
            fail();
        }
        try {
            student.setSecondName("Surname");
        } catch (InvalidPersonNameException e) {
            fail();
        }
        student.setAge(20);
        student.setSchoolName("SchoolName");
        assertEquals("My name is Name Surname and i am 20 years old\nI am study in university SchoolName",
                student.announce());
    }
}
