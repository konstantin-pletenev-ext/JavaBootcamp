package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    private Student student;

    protected void setUp() throws Exception {
        student = new Student();
    }

    public void testGetSetSchoolName(){
        String testSchoolName = "SchoolName";
        assertEquals("MySchool", student.getSchoolName());
        student.setSchoolName(testSchoolName);
        assertEquals(testSchoolName, student.getSchoolName());
    }
    public void testStudent(){
        Student st = new Student("SomeSchool");
        assertEquals("SomeSchool", st.getSchoolName());
    }
    public void testIntroduceStudent(){
        String testIntro = "I am study in university MySchool";
        assertEquals(testIntro, student.introduceStudent());
    }

}
