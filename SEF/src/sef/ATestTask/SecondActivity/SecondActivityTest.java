package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SecondActivityTest extends SecondActivity {


	//TODO try to achieve 100% of test coverage

	private SecondActivity theCalculator;

	@Before
	public void setUp() throws Exception {
		//	Initialize variables to be used here


		theCalculator = new SecondActivity();
	}

	@After
	public void tearDown() throws Exception {
	}

	//Example ->
	@Test
	public void testGetSumPositiveValue() {
		int a = 5;
		int b = 10;
		Assert.assertEquals(15, (theCalculator.getSum(a, b)));
		Assert.assertEquals(15, (theCalculator.getSum(b, a)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		Assert.assertEquals(5, (theCalculator.getSum(-5, 10)));
		Assert.assertEquals(-5, (theCalculator.getSum(5, -10)));
	}

	@Test
	public void testGetDifference() {
		Assert.assertEquals(5, (theCalculator.getDifference(10, 5)));
		Assert.assertEquals(-5, (theCalculator.getDifference(5, 10)));
	}
@Test
	public void testGetProduct() {
		Assert.assertEquals( (theCalculator.getProduct(10, 5));     //why this does not work ??
		Assert.assertEquals(-50, (theCalculator.getProduct(5, -10)));
	}
@Test
	public void testGetQuotient() {
		Assert.assertEquals(2, (theCalculator.getQuotient(10, 5)));
		Assert.assertEquals(0.5, (theCalculator.getQuotient(5, 10)));
	}
}


