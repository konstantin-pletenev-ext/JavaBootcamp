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
		Calculator calculator = new Calculator();
		assertEquals(15.0, (calculator.getSum(5, 10)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		Calculator calculator = new Calculator();
		assertEquals(5.0, (calculator.getSum(-5, 10)));
		assertEquals(-5.0, (calculator.getSum(5, -10)));
	}

	public void testGetDifference() {
		Calculator calculator = new Calculator();
		int a = 3;
		int b = 2;
		// Checks if b is lesser than a
		assertEquals(1.0, (calculator.getDifference(a, b)));
		// Checks if b is greater than a
		assertEquals(-1.0, (calculator.getDifference(b, a)));

		a = 5;
		b = -4;
		// Checks if negative value is subtracted from positive value
		assertEquals(9.0, (calculator.getDifference(a, b)));
		// Checks if positive value is subtracted from negative value
		assertEquals(-9.0, (calculator.getDifference(b, a)));

		a = -10;
		b = -5;
		// Checks if negative value is subtracted from negative value: a > b
		assertEquals(-5.0, (calculator.getDifference(a, b)));
		// Checks if negative value is subtracted from negative value: b < a
		assertEquals(5.0, (calculator.getDifference(b, a)));

	}

	public void testGetProduct() {

		Calculator calculator = new Calculator();

		double a = 5;
		double b = 10;
		// Checks the product of two (2) positive values
		assertEquals(50.0, (calculator.getProduct(a,b)),0);
		assertEquals(50.0, (calculator.getProduct(b,a)),0);

		a = -5;
		b = 10;
		// Checks the product of a positive value and a negative value
		assertEquals(-50.0, (calculator.getProduct(a,b)),0);
		assertEquals(-50.0, (calculator.getProduct(b,a)),0);

		a = -3;
		b = -10;
		// Checks the product of two (2) negative values
		assertEquals(30.0, (calculator.getProduct(a,b)),0);
		assertEquals(30.0, (calculator.getProduct(b,a)),0);

	}

	public void testGetQuotient() {

		Calculator calculator = new Calculator();

		double a = 10;	double b = 5;
		// Checks if b is lesser than a
		assertEquals(2.0, (calculator.getQuotient(a,b)),0);
		// Checks if b is greater than a
		assertEquals(0.5, (calculator.getQuotient(b,a)),0);

		a = 9;	b = -3;
		// Checks if positive value is divided with negative value
		assertEquals(-3.0, (calculator.getQuotient(a,b)),0);
		// Checks if negative value is divided with positive value
		assertEquals(-0.33, (calculator.getQuotient(b,a)),0.007);

		a = -10;	b = -5;
		// Checks if negative value is divided with negative value: a > b
		assertEquals(2.0, (calculator.getQuotient(a,b)),0);
		// Checks if negative value is divided with negative value: b < a
		assertEquals(0.5, (calculator.getQuotient(b,a)),0);
	}
}





