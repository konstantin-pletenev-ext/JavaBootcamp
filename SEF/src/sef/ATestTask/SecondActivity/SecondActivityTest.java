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
		assertEquals(15.0, (theCalculator.getSum(5.0, 10.0)));
		assertEquals(15.0, (theCalculator.getSum(10.0, 5.0)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5.0, (theCalculator.getSum(-5.0, 10.0)));
		assertEquals(-5.0, (theCalculator.getSum(5.0, -10.0)));
	}

	@Test
	public void testGetDifPositiveValue() {
		assertEquals(-5.0, (theCalculator.getDif(5.0, 10.0)));
		assertEquals(5.0, (theCalculator.getDif(10.0, 5.0)));
	}



	@Test
	public void testGetDifNegativeValue() {
		assertEquals(-15.0, (theCalculator.getDif(-5.0, 10.0)));
		assertEquals(15.0, (theCalculator.getDif(5.0, -10.0)));
	}



	@Test
	public void testGetDividePositiveValue() {
		assertEquals(0.5, (theCalculator.getDivide(5.0, 10.0)));
		assertEquals(2.0, (theCalculator.getDivide(10.0, 5.0)));
	}

	@Test
	public void testGetDivideZero() {
		assertEquals(0.0, (theCalculator.getDivide(5.0, 0.0)));
		assertEquals(0.0, (theCalculator.getDivide(0.0, 5.0)));
	}


	@Test
	public void testGetDivideNegativeValue() {
		assertEquals(-0.5, (theCalculator.getDivide(-5.0, 10.0)));
		assertEquals(-0.5, (theCalculator.getDivide(5.0, -10.0)));
	}

	@Test
	public void testGetMultPositiveValue() {
		assertEquals(50.0, (theCalculator.getMult(5.0, 10.0)));
		assertEquals(50.0, (theCalculator.getMult(10.0, 5.0)));
	}



	@Test
	public void testGetMultNegativeValue() {
		assertEquals(-50.0, (theCalculator.getMult(-5.0, 10.0)));
		assertEquals(-50.0, (theCalculator.getMult(5.0, -10.0)));
	}
}

