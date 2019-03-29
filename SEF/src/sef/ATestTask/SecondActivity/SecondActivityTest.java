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
        assertEquals(15.0, (theCalculator.getSum(5, 10)));
        assertEquals(15.0, (theCalculator.getSum(10, 5)));
    }

    //Example ->
    @Test
    public void testGetSumNegativeValue() {
        assertEquals(5.0, (theCalculator.getSum(-5, 10)));
        assertEquals(-5.0, (theCalculator.getSum(5, -10)));
    }

    @Test
    public void testGetQuotient() {
        assertEquals(10.0, theCalculator.getQuotient(100, 10));
        assertEquals(2.5, theCalculator.getQuotient(5, 2));
    }

    @Test
    public void testGetQuotientNegative() {
        assertEquals(-10.0, theCalculator.getQuotient(-100, 10));
        assertEquals(-1.0, theCalculator.getQuotient(1, -1));
    }

    @Test
    public void testDivideByZero() {
        assertEquals(0.0, theCalculator.getQuotient(100, 0));
    }


    // -------------------------
    @Test
    public void testGetSumProductValue() {
        assertEquals(42.0, (theCalculator.getProduct(6, 7)));
        assertEquals(42.0, (theCalculator.getProduct(7, 6)));
    }

    //Example ->
    @Test
    public void testGetProductNegativeValue() {
        assertEquals(-22.0, (theCalculator.getProduct(-11, 2)));
        assertEquals(-22.0, (theCalculator.getProduct(2, -11)));
    }

    // ------------------------------
    @Test
    public void testGetDifferencePositiveValue() {
        assertEquals(10.0, (theCalculator.getDifference(20, 10)));
        assertEquals(-10.0, (theCalculator.getDifference(10, 20)));
    }

    //Example ->
    @Test
    public void testGetDifferenceNegativeValue() {
        assertEquals(-20.0, (theCalculator.getDifference(-10, 10)));
        assertEquals(30.0, (theCalculator.getDifference(20, -10)));
    }


    @Test
    public void testThrowException() {

        try {

            theCalculator.getSum(2, 1);
            theCalculator.getDifference(3, 3);
            theCalculator.getProduct(0, 1);
            theCalculator.getQuotient(1, 1);
            new SecondActivity();

        } catch (IllegalArgumentException e) {
            fail("Divided by zero " + e.getMessage());

        } catch (Exception e) {
            fail("There is an exception " + e.getMessage());
        } catch (Error e) {
            fail();
        }
    }
}

