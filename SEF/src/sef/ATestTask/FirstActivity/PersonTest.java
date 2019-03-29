package sef.ATestTask.FirstActivity;
import junit.framework.TestCase;
public class PersonTest extends TestCase{
    private  Person person;
    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        person = new Person();
    }
    public void testPersonFistName(){
        person.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", person.getFirstName());
    }
    public void testPesonSecondName(){
        person.setSecondName("Anandan");
        assertEquals("Anandan", person.getSecondName());
    }
    public void testPersonAge(){
        person.setAge(22);
        assertEquals(22, person.getAge() );
    }
    public void testPersonAnnounce() {
        person.announce();
        String names = person.firstName + person.secondName;
        assertEquals("My Name is " + names + "and I am " + person.getAge()
                +"years old",person.announce());
    }
}
