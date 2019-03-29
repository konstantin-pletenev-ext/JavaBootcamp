package sef.ATestTask.SecondActivity.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sef.ATestTask.SecondActivity.SimpleCalc;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

import static java.lang.Math.pow;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SimpleCalcSolveTest {

    @Parameterized.Parameter(0)
    public double x;
    @Parameterized.Parameter(1)
    public double y;
    @Parameterized.Parameter(2)
    public char op;
    @Parameterized.Parameter(3)
    public double expectedResult;
    @Parameterized.Parameter(4)
    public Class<? extends Exception> expectedException;
    @Parameterized.Parameter(5)
    public String expectedExceptionMsg;

    @Parameterized.Parameters
    public static Collection data() {
        Random rand = new Random();
        double a = rand.nextDouble() * 100000;
        double b = rand.nextDouble() * 100000;
        if (b == 0){
            b += 0.000000000001;
        }

        return Arrays.asList(new Object[][] {
                { 0, 0, '+', 0, null, null },
                { -1, 0, '+', -1, null, null },
                { 0, 1.1, '+', 1.1, null, null },
                { 3.2, 2, '+', 5.2, null, null },
                { 2.1, -5, '+', -2.9, null, null },
                { -11.3, -8, '+', -19.3, null, null },
                { a, b, '+', a + b, null, null },
                { 0, 0, '-', 0, null, null },
                { -1, 0, '-', -1, null, null },
                { 0, 1.1, '-', -1.1, null, null },
                { 3.2, 2, '-', 1.2, null, null },
                { 2.1, -5, '-', 7.1, null, null },
                { -11.3, -8, '-', -3.3, null, null },
                { a, b, '-', a - b, null, null },
                { 0, 0, '*', 0, null, null },
                { -1, 0, '*', 0, null, null },
                { 0, 1.1, '*', 0, null, null },
                { 3.2, 2, '*', 6.4, null, null },
                { 2.1, -5, '*', -10.5, null, null },
                { -11.3, -8, '*', 90.4, null, null },
                { a, b, '*', a * b, null, null },
                { 0, 0, '/', -1, ArithmeticException.class, "division by 0" },
                { -1, 0, '/', -1, ArithmeticException.class, "division by 0" },
                { 0, 1.1, '/', 0, null, null },
                { 3.2, 2, '/', 1.6, null, null },
                { 2.1, -5, '/', -0.42, null, null },
                { -11.3, -8, '/', 1.4125, null, null },
                { a, b, '/', a / b, null, null },
                { 0, 0, '^', 1, null, null },
                { -1, 0, '^', 1, null, null },
                { 0, 1.1, '^', 0, null, null },
                { 3.2, 2, '^', 10.24, null, null },
                { 2.1, -5, '^', 0.02448519270213934474196402096814, null, null },
                { -11.3, -8, '^', 3.7615986172224924652598913716374e-9, null, null },
                { a, b, '^', pow(a, b), null, null },
                { 0, 0, '1', -1, IllegalArgumentException.class, "invalid operator" },
                { -1, 0, 'a', -1, IllegalArgumentException.class, "invalid operator" },
                { 0, 1.1, ' ', -1, IllegalArgumentException.class, "invalid operator" },
                { 3.2, 2, '&', -1, IllegalArgumentException.class, "invalid operator" },
                { 2.1, -5, '%', -1, IllegalArgumentException.class, "invalid operator" },
                { -11.3, -8, '@', -1, IllegalArgumentException.class, "invalid operator" },
                { a, b, '.', -1, IllegalArgumentException.class, "invalid operator" }
        });
    }

    @Test
    public void testSolve() {

        if (this.expectedException != null) {
            try {
                assertEquals(expectedResult, SimpleCalc.solve(this.x, this.y, this.op), 0);
            } catch (Exception e){
                assertEquals(e.getClass(), this.expectedException);
                assertEquals(e.getMessage(), this.expectedExceptionMsg);
            }
        } else {
            assertEquals("Error: param x: " + this.x + ", param y: " + this.y + ", param op: " + this.op,
                    expectedResult, SimpleCalc.solve(this.x, this.y, this.op), 0.000000000001);
        }

    }
}
