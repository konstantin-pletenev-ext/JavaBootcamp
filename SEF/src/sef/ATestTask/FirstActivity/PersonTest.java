package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class PersonTest extends TestCase {
    Person myperson;

    public static void main(String[] args) {

        Person myperson= new Person();
        try {
            myperson.setFirstName("Ivan3");
        }catch (CustumizeException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected void setUp() throws Exception {
        myperson= new Person();
    }

    @Test
    public void testAge(){
        myperson.setAge(12);
        assertEquals(12, myperson.getAge());
    }

    @Test
    public void testFirstName(){
        try {
            myperson.setFirstName("Ivan");
        } catch (CustumizeException e) {
            fail();
        }
        assertEquals("Ivan",myperson.getFirstName());

        try {
            myperson.setFirstName("Ivan1");
            fail();
        } catch (CustumizeException e) {
            assertEquals("Name contains numbers", e.getMessage());
        }

    }
}
