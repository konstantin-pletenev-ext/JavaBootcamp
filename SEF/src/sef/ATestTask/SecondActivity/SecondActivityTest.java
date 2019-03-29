package sef.ATestTask.SecondActivity;
// Complete Code

import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {


    //TODO try to achieve 100% of test coverage

    private SecondActivity theCalculator;

    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        theCalculator = new SecondActivity();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //Example ->
    @Test
    public void testGetSumPositiveValue() {
        assertEquals(15, (theCalculator.add(5, 10)));
        assertEquals(15, (theCalculator.add(10, 5)));
        assertEquals(20.3, (theCalculator.add(20, 0.3)));
        assertEquals(20.3, (theCalculator.add(0.3, 20)));
    }

    //Example ->
    @Test
    public void testGetSumNegativeValue() {
        assertEquals(-15, (theCalculator.add(-5, -10)));
        assertEquals(-15, (theCalculator.add(-10, -5)));
        assertEquals(-5.5, (theCalculator.add(-5, -0.5)));
        assertEquals(-5, (theCalculator.add(-0.5, -5)));
        assertEquals(-5, (theCalculator.add(5, -10)));
        assertEquals(-5, (theCalculator.add(-10, 5)));
        assertEquals(-1, (theCalculator.add(2.5, -3.5)));
        assertEquals(-1, (theCalculator.add(-3.5, 2.5)));
    }

    @Test
    public void testGetSubPositiveValue() {
        assertEquals(5, (theCalculator.substract(10, 5);));
        assertEquals(9, (theCalculator.substract(9.3, 0.3);));
        assertEquals(20.3, (theCalculator.substract(20, 0.3);));
        assertEquals(20.3, (theCalculator.substract(0.3, 20););)
    }

}

