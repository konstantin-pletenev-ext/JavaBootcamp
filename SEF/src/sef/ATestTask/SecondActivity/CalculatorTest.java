package sef.ATestTask.SecondActivity;
// Complete Code

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {


    //TODO try to achieve 100% of test coverage

    private Calculator theCalculator;

    protected void setUp() throws Exception {
        //super.setUp();
        //	Initialize variables to be used here
        theCalculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //Example ->
    //@Test
    public void testSumPositiveValue() {
        assertEquals(15.0, (theCalculator.sum(5, 10)));
        assertEquals(15.0, (theCalculator.sum(10, 5)));
    }

    public void testSumNegativeValue() {
        assertEquals(5.0, (theCalculator.sum(-5, 10)));
        assertEquals(-5.0, (theCalculator.sum(5, -10)));
        assertEquals(-15.0, (theCalculator.sum(-5, -10)));
    }

    public void testDifferPositiveValue() {
        assertEquals(-5.0, (theCalculator.differ(5, 10)));
        assertEquals(5.0, (theCalculator.differ(10, 5)));
    }

    public void testDifferNegativeValue() {
        assertEquals(-15.0, (theCalculator.differ(-5, 10)));
        assertEquals(15.0, (theCalculator.differ(10, -5)));
        assertEquals(-5.0, (theCalculator.differ(-10, -5)));
    }

    public void testMultiplyPositiveValue() {
        assertEquals(50.0, (theCalculator.multiply(5, 10)));
        assertEquals(50.0, (theCalculator.multiply(10, 5)));
    }

    public void testMultiplyNegativeValue() {
        assertEquals(-50.0, (theCalculator.multiply(-5, 10)));
        assertEquals(-50.0, (theCalculator.multiply(10, -5)));
        assertEquals(50.0, (theCalculator.multiply(-10, -5)));
    }

    public void testDividePositiveValue() {
        assertEquals(0.5, (theCalculator.divide(5, 10)));
        assertEquals(2.0, (theCalculator.divide(10, 5)));
    }

    public void testDivideNegativeValue() {
        assertEquals(-0.5, (theCalculator.divide(-5, 10)));
        assertEquals(-2.0, (theCalculator.divide(10, -5)));
        assertEquals(2.0, (theCalculator.divide(-10, -5)));
    }


    public void testDivideByZeroThrowException() {
        try {
            theCalculator.divide(-5, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Second number must be more than zero.", e.getMessage());
        } catch (Exception ex) {
            fail("There is an exception" + ex.getMessage());
        } catch (Error er) {
            fail();
        }
    }

}

