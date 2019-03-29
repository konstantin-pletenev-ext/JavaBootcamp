package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class PersonTest extends TestCase {
    private Person thePersonTest;

    protected void setUp() throws Exception {
        super.setUp();
        thePersonTest = new Person();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testGetFirstName() {
        thePersonTest.getFirstName();
        assertEquals(thePersonTest.getFirstName(), thePersonTest.getFirstName()
        );
    }

    @Test
    public void testSetFirstName() {
        thePersonTest.setFirstName("First Name");
        assertEquals("First Name", thePersonTest.getFirstName()
        );
    }

        @Test
        public void testGetSecondName () {
            thePersonTest.getSecondName();
            assertEquals(thePersonTest.getSecondName(), thePersonTest.getSecondName()
            );
        }

        @Test
        public void testGetAge () {
            thePersonTest.getAge();
            assertEquals(thePersonTest.getAge(), thePersonTest.getAge()
            );
        }

        @Test
        public void testAnnounce () {
            thePersonTest.announce();
            assertEquals(thePersonTest.announce(), thePersonTest.announce()
            );
        }
    }





}
