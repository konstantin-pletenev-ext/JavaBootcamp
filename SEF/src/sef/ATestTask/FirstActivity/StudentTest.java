package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

public class StudentTest extends TestCase {


    public void testcheckAnnounce() {
        Student student = new Student();
        student.setSchoolName("TestSchoolName");
        student.setGrade(12);



        assertEquals("I am studying in university TestSchoolName, I have grade 12","I am studying in university " +student.getSchoolName()+", I have grade "+student.getGrade());
    }




}
