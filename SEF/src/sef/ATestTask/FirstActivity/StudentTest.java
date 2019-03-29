package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class StudentTest extends TestCase {

    private Student theStudentTest;

    protected void setUp() throws Exception {
        super.setUp();
        theStudentTest = new Student("ggg");
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetSchoolName() {
        theStudentTest.getSchoolName();
        assertEquals(theStudentTest.getSchoolName(), "ggg");
    }

}

