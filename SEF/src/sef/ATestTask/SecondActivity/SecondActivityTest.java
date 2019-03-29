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
	public void testSumPositiveValue() {
		assertEquals(28, (theCalculator.sum(13, 15)));
		assertEquals(20, (theCalculator.sum(13, 7)));
	}

	//Example ->
	@Test
	public void testSumNegativeValue() {
		assertEquals(5, (theCalculator.sum(-5, 10)));
		assertEquals(-5, (theCalculator.sum(5, -10)));
	}
	public void testSubPositiveValue(){
		assertEquals(1, (theCalculator.sub(100, 99)));
		assertEquals(-5, (theCalculator.sub(3, 8)));
	}
	public void testSubNegativeValue() {
		assertEquals(5, (theCalculator.sub(-5, -10)));
		assertEquals(-2, (theCalculator.sub(-2, 0)));
	}
	public void testMulPositiveValue() {
		assertEquals(30, (theCalculator.mul(3, 10)));
		assertEquals(0, (theCalculator.mul(0, 5)));
	}
	public void testMulNegativeValue() {
		assertEquals(20, (theCalculator.mul(-5, -4)));
		assertEquals(-24, (theCalculator.mul(-3, 8)));
	}
	public void testDivPositiveValue() {
		assertEquals(10, (theCalculator.div(100, 10)));
		assertEquals(5, (theCalculator.div(5, 1)));
	}
	public void testDivNegativeValue() {
		assertEquals(-20, (theCalculator.div(100, -5)));
		assertEquals(1, (theCalculator.div(-3, -3)));
	}
}

