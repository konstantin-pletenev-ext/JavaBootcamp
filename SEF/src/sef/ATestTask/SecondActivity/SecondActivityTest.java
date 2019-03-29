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

	@Test
	public void testDivideByZero(){
		assertEquals(5, SecondActivity.divide(10, 2));
		assertEquals(0, SecondActivity.divide(10, 0));
	}

	@Test
	public void testGetSumPositiveValue() {
		assertEquals(15, (theCalculator.add(5, 10)));
		assertEquals(15, (theCalculator.add(10, 5)));
	}

	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5, (theCalculator.add(-5, 10)));
		assertEquals(-5, (theCalculator.add(5, -10)));
	}
	@Test
	public void testMultiply(){
		assertEquals(9,theCalculator.multiply(3,3));
	}

}