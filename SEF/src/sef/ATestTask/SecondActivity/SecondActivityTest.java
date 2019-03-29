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
		assertEquals(15, (theCalculator.getSum(5, 10)));
		assertEquals(15, (theCalculator.getSum(10, 5)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5, (theCalculator.getSum(-5, 10)));
		assertEquals(-5, (theCalculator.getSum(5, -10)));
	}
	public void testMultiplication(){
		assertEquals(10, (theCalculator.mult(5 ,2)));
		assertEquals(-10, (theCalculator.mult(-2 ,5)));
	}
	public void testSubtraction(){
		assertEquals(3, (theCalculator.sub(5 ,2)));
		assertEquals(-7, (theCalculator.sub(-2 ,5)));
		assertEquals(3, (theCalculator.sub(-2 ,-5)));
	}
	public void testDivision() {

		assertEquals(2., theCalculator.divide(10,5), 0.);
		assertEquals(0., (theCalculator.divide(10,0)), 0.);
		assertEquals(-3., (theCalculator.divide(9,-3)), 0.);
		assertEquals(2., (theCalculator.divide(-10,-5)), 0.);
		assertEquals(0.5, (theCalculator.divide(-5,-10)), 0.);
	}

	public void testThrowException(){
		try {
			theCalculator.getSum(5, 10);
			theCalculator.mult(5,2);
			new SecondActivity();
		} catch (Exception e1) {
			fail();
		}
	}

}

