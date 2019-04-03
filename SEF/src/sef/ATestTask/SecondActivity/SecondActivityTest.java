package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {


	//TODO try to achieve 100% of test coverage

	private SecondActivity theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		theCalculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetSumPositiveValue() {
		Calculator calculator = new Calculator();
		assertEquals(15.0, (calculator.getSum(5, 10)));
	}

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
		assertEquals(1.0, (calculator.getDifference(a, b)));
		assertEquals(-1.0, (calculator.getDifference(b, a)));

		a = 5;
		b = -4;
		assertEquals(9.0, (calculator.getDifference(a, b)));
		assertEquals(-9.0, (calculator.getDifference(b, a)));

		a = -10;
		b = -5;
		assertEquals(-5.0, (calculator.getDifference(a, b)));
		assertEquals(5.0, (calculator.getDifference(b, a)));

	}

	public void testGetProduct() {

		Calculator calculator = new Calculator();

		double a = 5;
		double b = 10;
		assertEquals(50.0, (calculator.getProduct(a,b)),0);
		assertEquals(50.0, (calculator.getProduct(b,a)),0);

		a = -5;
		b = 10;
		assertEquals(-50.0, (calculator.getProduct(a,b)),0);
		assertEquals(-50.0, (calculator.getProduct(b,a)),0);

		a = -3;
		b = -10;
		assertEquals(30.0, (calculator.getProduct(a,b)),0);
		assertEquals(30.0, (calculator.getProduct(b,a)),0);

	}

	public void testGetQuotient() {

		Calculator calculator = new Calculator();

		double a = 10;	double b = 5;
		assertEquals(2.0, (calculator.getQuotient(a,b)),0);
		assertEquals(0.5, (calculator.getQuotient(b,a)),0);

		a = 9;	b = -3;
		assertEquals(-3.0, (calculator.getQuotient(a,b)),0);
		assertEquals(-0.33, (calculator.getQuotient(b,a)),0.007);

		a = -10;	b = -5;
		assertEquals(2.0, (calculator.getQuotient(a,b)),0);
		assertEquals(0.5, (calculator.getQuotient(b,a)),0);
	}
}





