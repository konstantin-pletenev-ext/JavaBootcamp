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
    }

    //Example ->
    @Test
    public void testGetSumNegativeValue() {
        assertEquals(-15, (theCalculator.add(-5, -10)));
        assertEquals(-15, (theCalculator.add(-10, -5)));
        assertEquals(-5, (theCalculator.add(10, -15)));
        assertEquals(-5, (theCalculator.add(-15, 10)));
    }

    @Test
    public void testGetSubPositiveValue() {
        assertEquals(5, (theCalculator.sub(10, 5)));
        assertEquals(10, (theCalculator.sub(5, -5)));
        assertEquals(5, (theCalculator.sub(-5, -10)));
    }

    @Test
    public void testGetSubNegativeValue() {
        assertEquals(-5, (theCalculator.sub(5, 10)));
        assertEquals(-15, (theCalculator.sub(-5, 10)));
        assertEquals(-5, (theCalculator.sub(-10, -5)));
    }

    @Test
    public void testGetMultiPositiveValue() {
        assertEquals(50, (theCalculator.multi(10, 5)));
        assertEquals(25, (theCalculator.multi(-5, -5)));
        assertEquals(50, (theCalculator.multi(5, 10)));
    }

    @Test
    public void testGetMultiNegativeValue() {
        assertEquals(-50, (theCalculator.multi(-5, 10)));
        assertEquals(-50, (theCalculator.multi(5, -10)));
    }

    @Test
    public void testGetDivPositiveValue() {
        assertEquals(2, (theCalculator.div(10, 5)));
        assertEquals(0, (theCalculator.div(5, 10)));
        try {
            theCalculator.div(5, 0);
            fail();
        } catch (ArithmeticException e){

        }

    }

    @Test
    public void testGetDivNegativeValue() {
        assertEquals(-2, (theCalculator.div(-10, 5)));
        assertEquals(0, (theCalculator.div(5, -10)));
        assertEquals(-2, (theCalculator.div(10, -5)));
        try {
            theCalculator.div(-5, 0);
            fail();
        } catch (ArithmeticException e){

        }
    }

    @Test
    public void testGetModPositiveValue() {
        assertEquals(0, (theCalculator.mod(10, 5)));
        assertEquals(1, (theCalculator.mod(10, 3)));
        assertEquals(5, (theCalculator.mod(5, 10)));
        assertEquals(5, (theCalculator.mod(5, -10)));
        try {
            theCalculator.mod(5, 0);
            fail();
        } catch (ArithmeticException e){

        }

    }

    @Test
    public void testGetModNegativeValue() {
        assertEquals(0, (theCalculator.mod(-10, 5)));
        assertEquals(-1, (theCalculator.mod(-10, 3)));
        assertEquals(-5, (theCalculator.mod(-5, 10)));
        assertEquals(-5, (theCalculator.mod(-5, -10)));
        try {
            theCalculator.mod(-5, 0);
            fail();
        } catch (ArithmeticException e){

        }

    }



}

