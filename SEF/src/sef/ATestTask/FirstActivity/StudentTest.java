package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    private Student student;

    protected void setUp() throws Exception {
        student = new Student();
    }

    public void testGetAndSetSchoolName() {
        String testSchoolName = "MySchool";
        student.setSchoolName(testSchoolName);
        assertEquals(testSchoolName, student.getSchoolName());
    }
    public void testAnnounce() {
        student.announce();
        assertEquals(student.announce(), student.announce());
    }
      }

