package sef.ATestTask.SecondActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {
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
	public void testSumPositiveValue() {
		assertEquals(15.0, (theCalculator.sum(5, 10)));
		assertEquals(15.0, (theCalculator.sum(10, 5)));
	}

	@Test
	public void testSumNegativeValue() {
		assertEquals(-5.0, (theCalculator.sum(5, -10)));
		assertEquals(-5.0, (theCalculator.sum(-10, 5)));
	}

	@Test
	public void testSubstractPositiveValue() {
		assertEquals(5.0, (theCalculator.subtract(10, 5)));
		assertEquals(-5.0, (theCalculator.subtract(5, 10)));
	}

	@Test
	public void testMultiplyPositiveValue() {
		assertEquals(50.0, (theCalculator.multiply(10, 5)));
		assertEquals(50.0, (theCalculator.multiply(5, 10)));
	}

	@Test
	public void testMultiplyNegativeValue() {
		assertEquals(-50.0, (theCalculator.multiply(-10, 5)));
		assertEquals(-50.0, (theCalculator.multiply(5, -10)));
	}

	@Test
	public void testDividePositiveValue() {
		assertEquals(2.0, (theCalculator.divide(10, 5)));
		assertEquals(0.5, (theCalculator.divide(5, 10)));
	}

	@Test
	public void testDivideNegativeValue() {
		assertEquals(-2.0, (theCalculator.divide(-10, 5)));
		assertEquals(-0.5, (theCalculator.divide(5, -10)));
	}
}
