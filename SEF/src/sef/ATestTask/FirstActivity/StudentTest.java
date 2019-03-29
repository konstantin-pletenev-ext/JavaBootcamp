package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    private Student student;

    protected void setUp() throws Exception {
        student = new Student();
    }

    public void testSetandGetGrade() {
        int grade = 3;
        student.setGrade(grade);
        assertEquals(3, student.getGrade());
    }

    public void testSetandGetSchool() {
        String school = "LU";
        student.setSchool(school);
        assertEquals("LU", student.getSchool());
    }

    public void testStudentCreatedProperly() {
        Student student = new Student();
        assertEquals(null, student.getFirstName());
        assertEquals(null, student.getSecondName());
        assertEquals(0, student.getAge());
        assertEquals(null, student.getSchool());
        assertEquals(0, student.getGrade());
    }

    public void testSecondStudentCreatedProperly() {
        Student student = new Student("Rita", "Ivanova", 29, 3, "LU");
        assertEquals("Rita", student.getFirstName());
        assertEquals("Ivanova", student.getSecondName());
        assertEquals(29, student.getAge());
        assertEquals("LU", student.getSchool());
        assertEquals(3, student.getGrade());
    }

    public void testThirdStudentCreatedProperly() {
        Student student = new Student("Rita", "Ivanova", 29);
        assertEquals("Rita", student.getFirstName());
        assertEquals("Ivanova", student.getSecondName());
        assertEquals(29, student.getAge());
    }

    public void testFourthStudentCreatedProperly() {
        Student student = new Student("Rita", "Ivanova", 29, "LU");
        assertEquals("Rita", student.getFirstName());
        assertEquals("Ivanova", student.getSecondName());
        assertEquals(29, student.getAge());
        assertEquals("LU", student.getSchool());

    }

    public void testAnnounce() {
        Student student = new Student("Rita", "Ivanova", 29, 3, "LU");
        assertEquals("I am student. My name is Rita Ivanova. I am 29 years old. I am study in university LU.", student.announce());
    }

    public void testIntroduce() {
        Student student = new Student("Rita", "Ivanova", 29, 3, "LU");
        student.introduce();
    }
}
