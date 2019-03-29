package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    public void testStudentSchoolName(){
        Student s = new Student();
        s.setSchoolname("Accenture Bootcamp");
        assertEquals("Accenture Bootcamp",s.getSchoolname());
    }
    public void testStudentAnnounce() {
        Student s = new Student();
        s.announce();
        assertEquals("I am study in university" + s.getSchoolname(), s.announce());

    }
}
