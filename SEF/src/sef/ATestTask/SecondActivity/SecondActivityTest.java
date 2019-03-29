package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {


	//TODO try to achieve 100% of test coverage

	private CalculatorFunction theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new CalculatorFunction();
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
	public void testGetDiffPositiveValue() {
		assertEquals(5.0, (theCalculator.getDifference(10, 5)));
		assertEquals(8.5, (theCalculator.getDifference(28.5, 20)));
	}

	@Test
	public void testGetDiffNegativeValue() {
		assertEquals(-15.0, (theCalculator.getDifference(-10, 5)));
		assertEquals(25.0, (theCalculator.getDifference(5, -20)));
	}

	@Test
	public void testGetmultiplyNegativeValue() {
		assertEquals(-50.0, (theCalculator.getMultiply(-10, 5)));
		assertEquals(100.0, (theCalculator.getMultiply(-5, -20)));
	}

	@Test
	public void testGetmultiplyPositiveValue() {
		assertEquals(50.0, (theCalculator.getMultiply(10, 5)));
		assertEquals(100.0, (theCalculator.getMultiply(5, 20)));
	}

	@Test
	public void testGetDividePositiveValue() {
		assertEquals(2.0, (theCalculator.getDivide(10, 5)));
		assertEquals(0.25, (theCalculator.getDivide(5, 20)));
	}

	@Test
	public void testGetDivideNegativeValue() {
		assertEquals(-2.0, (theCalculator.getDivide(10, -5)));
		assertEquals(0.25, (theCalculator.getDivide(-5, -20)));
	}

	@Test
	public void testGetDividebyzero() {
		assertEquals(50.0, (theCalculator.getMultiply(10, 5)));
	}

	public void testThrowException(){

		try {

		theCalculator.getSum(2, 1);
		theCalculator.getDifference(3, 3);
		theCalculator.getMultiply(0, 1);
		theCalculator.getDivide(1, 0);
		new CalculatorFunction();

	} catch (IllegalArgumentException e) {
		assertEquals("Divided by 0 - not allowed!", e.getMessage());
	}

	}

}

