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

	public void testAdd() {
		assertEquals(15, theCalculator.add(7, 8));
		assertEquals(15, theCalculator.add(8, 7));
		assertEquals(4, theCalculator.add(-4, 8));
	}

	public void testSubtract() {
		assertEquals(7, theCalculator.subtract(12, 5));
		assertEquals(-7, theCalculator.subtract(5, 12));
		assertEquals(17, theCalculator.subtract(4, -13));
	}

	public void testMultiply() {
		assertEquals(24, theCalculator.mulitply(4, 6));
		assertEquals(24, theCalculator.mulitply(6, 4));
		assertEquals(0, theCalculator.mulitply(4, 0));
	}

	public void testDivide() {
		assertEquals(5.0, theCalculator.divide(25, 5));
		assertEquals(0.2, theCalculator.divide(5, 25));
	}

	public void testDivideWithZero() {
		assertEquals(0.0, theCalculator.divide(15, 0));
		assertEquals(0.0, theCalculator.divide(0, 15));
	}


}

