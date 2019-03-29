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

	@Test
	public void testGetDifferencePositiveValue(){
		assertEquals(5, (theCalculator.getDifference(10, 5)));
		assertEquals(5, (theCalculator.getDifference(-5, -10)));
	}

	@Test
	public void testGetDifferenceNegativeValue(){
		assertEquals(-5, (theCalculator.getDifference(5, 10)));
		assertEquals(-5, (theCalculator.getDifference(-10, -5)));
	}

	@Test
	public void testGetProductPositiveValue(){
		assertEquals(50.0, (theCalculator.getProduct(5, 10)));
		assertEquals(50.0, (theCalculator.getProduct(-5, -10)));
	}

	@Test
	public void testGetProductNegativeValue(){
		assertEquals(-50.0, (theCalculator.getProduct(-5, 10)));
		assertEquals(-50.0, (theCalculator.getProduct(5, -10)));
	}

	@Test
	public void testGetProductZeroValue(){
		assertEquals(0.0, (theCalculator.getProduct(0, 10)));
		assertEquals(-0.0, (theCalculator.getProduct(-5, 0)));
	}

	@Test
	public void testGetQuotientPositiveValue(){
		assertEquals(2.0, (theCalculator.getQuotient(10, 5)));
		assertEquals(2.0, (theCalculator.getQuotient(-10, -5)));
	}

	@Test
	public void testGetQuotientNegativeValue(){
		assertEquals(-2.0, (theCalculator.getQuotient(10, -5)));
		assertEquals(-2.0, (theCalculator.getQuotient(-10, 5)));
	}
}

