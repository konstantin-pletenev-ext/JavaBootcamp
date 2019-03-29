package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    public void testCheckStudentCreatedProperly(){
        Student student = new Student();
        student.setFirstName("Test1");
        assertEquals("I am an error message","Test1", student.getFirstName());
        student.setSecondName("Test1");
        assertEquals("I am an error message","Test1", student.getSecondName());
        student.setAge(20);
        assertEquals("I am an error message",20, student.getAge());
        student.setSchoolName("Test1");
        assertEquals("I am an error message","Test1", student.getSchoolName());
    }

    public void testCheckStudentAnnounceProperly(){
        Student student = new Student();
        student.setFirstName("Test1");
        student.setSecondName("Test2");
        student.setAge(22);
        student.setSchoolName("Test3");
        assertEquals("I am an error message","I am study in university Test3", student.announce());
    }

    public void testCheckStudentDefaultConstructor(){
         Student student = new Student();
         assertEquals("Unknown", student.getSchoolName());
    }

    public void testCheckStudentConstructorOnlySchool(){
        Student student = new Student("Test1");
        assertEquals("Test1", student.getSchoolName());
    }

    public void testCheckStudentConstructorLong(){
        Student student = new Student("Test1", "Test2", 20, "Test3");
        assertEquals("Test1", student.getSchoolName());
        assertEquals("Test2", student.getSecondName());
        assertEquals(20, student.getAge());
        assertEquals("Test3", student.getSchoolName());
    }
}
