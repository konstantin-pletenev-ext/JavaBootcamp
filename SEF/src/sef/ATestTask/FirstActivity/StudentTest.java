package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    public void testEmployeeCreatedProperly() {
        Student student = new Student();
        student.setFirstName("Test1");
        assertEquals("Test1", student.getFirstName());
    }

    public void testEmployeeCreatedProperly2() {
        String school = "aSchool";
        int grade = 4;

        Student student = new Student(school, grade);
        assertEquals(school, student.getSchoolName());
        assertEquals(grade, student.getGrade());
    }

    public void testSetAndGetSchoolName() {
        String school = "aSchool";

        Student student = new Student();
        student.setSchoolName(school);
        assertEquals(school, student.getSchoolName());
    }

    public void testSetAndGetAge() {
        int grade = 4;

        Student student = new Student();
        student.setGrade(grade);
        assertEquals(grade, student.getGrade());
    }

    public void testAnnounce() {
        String firstName = "aName", secondName = "aSurname", school = "aSchool";

        Student student = new Student();
        student.setFirstName(firstName);
        student.setSecondName(secondName);
        student.setSchoolName(school);
        assertEquals("My name is " + firstName + " " + secondName +
                " and I study in " + school,
                    student.announce());
    }
}
