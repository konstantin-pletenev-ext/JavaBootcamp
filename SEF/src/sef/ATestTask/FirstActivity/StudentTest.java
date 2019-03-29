package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    private Student student;

    protected void setUp() throws Exception{
        student = new Student();
    }

    public void testStudentCreatedProperly(){
        Student student = new Student();
        student.setFirstName("Test2");
        assertEquals("I am an error message", "Test2", student.getFirstName());
    }

    public void testSetandGetgrade(){
        int testgrade = 10;
        assertEquals(0, student.getGrade());
        student.setGrade(testgrade);
        assertEquals(testgrade, student.getGrade());
    }

    public void testSetandGetschoole() {
        String testschool = "school";
        assertEquals("Unknown", student.getSchool());
        student.setSchool(testschool);
        assertEquals(testschool, student.getSchool());
    }

    public void testStudenteannounce(){
        Student student = new Student("School", 10);
        assertEquals("My name is  Unknown Unknown and I am 0 years old. I'm studying in School grade 10", student.announce());
    }

}
