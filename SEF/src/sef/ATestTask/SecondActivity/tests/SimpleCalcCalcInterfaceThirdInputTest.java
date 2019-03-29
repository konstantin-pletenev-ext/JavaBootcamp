package sef.ATestTask.SecondActivity.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sef.ATestTask.SecondActivity.SimpleCalc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

import static java.lang.Math.pow;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class SimpleCalcCalcInterfaceThirdInputTest {

    @Parameterized.Parameter(0)
    public String x;
    @Parameterized.Parameter(1)
    public String secondInput;
    @Parameterized.Parameter(2)
    public String thirdInput;
    @Parameterized.Parameter(3)
    public String expectedResult;
    @Parameterized.Parameter(4)
    public Class<? extends Exception> expectedException;
    @Parameterized.Parameter(5)
    public String expectedExceptionMsg;

    private SimpleCalc calc;
    private Method calcInterface;

    @Before
    public void setUp() throws Exception {
        this.calc = new SimpleCalc();
        this.calcInterface = this.calc.getClass().getDeclaredMethod("calcInterface", String.class);
        Method initialize = this.calc.getClass().getDeclaredMethod("initialize");
        this.calcInterface.setAccessible(true);
        initialize.setAccessible(true);
        initialize.invoke(this.calc);
    }

    @Parameterized.Parameters
    public static Collection data() {
        Random rand = new Random();
        double a = rand.nextDouble() * 100000;
        double b = rand.nextDouble() * 100000;
        if (b == 0) {
            b += 0.000000000001;
        }

        return Arrays.asList(new Object[][]{
                //Enter y tests
                { "0", "+", "0", "Result: " + ((double)0 + 0) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-1", "+", "0", "Result: " + ((double)-1 + 0) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "0", "+", "1.1", "Result: " + (0 + 1.1) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "3.2", "+", "2", "Result: " + (3.2 + 2) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "2.1", "+", "-5", "Result: " + (2.1 + -5) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-11.3", "+", "-8", "Result: " + (-11.3 + -8) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { Double.toString(a), "+", Double.toString(b),
                        "Result: " + (a + b) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "0", "-", "0", "Result: " + ((double)0 - 0) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-1", "-", "0", "Result: " + ((double)-1 - 0) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "0", "-", "1.1", "Result: " + (0 - 1.1) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "3.2", "-", "2", "Result: " + (3.2 - 2) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "2.1", "-", "-5", "Result: " + (2.1 - -5) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-11.3", "-", "-8", "Result: " + (-11.3 - -8) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { Double.toString(a), "-", Double.toString(b),
                        "Result: " + (a - b) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "0", "*", "0", "Result: " + ((double)0 * 0) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-1", "*", "0", "Result: " + ((double)-1 * 0) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "0", "*", "1.1", "Result: " + (0 * 1.1) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "3.2", "*", "2", "Result: " + (3.2 * 2) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "2.1", "*", "-5", "Result: " + (2.1 * -5) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-11.3", "*", "-8", "Result: " + (-11.3 * -8) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { Double.toString(a), "*", Double.toString(b),
                        "Result: " + (a * b) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "0", "/", "0", "Error: division by 0\nEnter x: ", null, null },
                { "-1", "/", "0", "Error: division by 0\nEnter x: ", null, null },
                { "0", "/", "1.1", "Result: " + (0 / 1.1) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "3.2", "/", "2", "Result: " + (3.2 / 2) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "2.1", "/", "-5", "Result: " + (2.1 / -5) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-11.3", "/", "-8", "Result: " + (-11.3 / -8) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { Double.toString(a), "/", Double.toString(b),
                        "Result: " + (a / b) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "0", "^", "0", "Result: " + pow(0, 0) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-1", "^", "0", "Result: " + pow(-1, 0) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "0", "^", "1.1", "Result: " + pow(0, 1.1) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "3.2", "^", "2", "Result: " + pow(3.2, 2) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "2.1", "^", "-5", "Result: " + pow(2.1, -5) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-11.3", "^", "-8", "Result: " + pow(-11.3, -8) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { Double.toString(a), "^", Double.toString(b),
                        "Result: " + pow(a, b) + "\nEnter operator (+, -, *, /, ^, C): ", null, null },
                {"-1", "+", "jskjandj", "Invalid input\nEnter y: ", null, null},
                {"-1", "+", "10a", "Invalid input\nEnter y: ", null, null},
                {"-1", "+", "10 10", "Invalid input\nEnter y: ", null, null},
                {"-1", "+", "", "Invalid input\nEnter y: ", null, null},
                {"-1", "+", "- 10", "Invalid input\nEnter y: ", null, null},
                {"-1", "+", "10,1234", "Invalid input\nEnter y: ", null, null},
                {"-1", "+", "exit", "Good bye!\n", null, null},
                {"-1", "+", null, null, NullPointerException.class, null},
                {"-1", "exit", "10", null, IllegalStateException.class, "unexpected calcInterface method call"},
                //Enter operator again tests
                {"-1", "", "+", "Enter y: ", null, null},
                {"-1", "", "-", "Enter y: ", null, null},
                {"-1", "", "*", "Enter y: ", null, null},
                {"-1", "", "/", "Enter y: ", null, null},
                {"-1", "", "^", "Enter y: ", null, null},
                {"-1", "", "C", "Enter x: ", null, null},
                {"-1", "", "c", "Enter x: ", null, null},
                {"-1", "", "exit", "Good bye!\n", null, null},
                {"-1", "", "&", "Invalid operator\nEnter operator (+, -, *, /, ^, C): ", null, null},
                {"-1", "", "**", "Invalid operator\nEnter operator (+, -, *, /, ^, C): ", null, null},
                {"-1", "", "+-", "Invalid operator\nEnter operator (+, -, *, /, ^, C): ", null, null},
                {"-1", "", "+ -", "Invalid operator\nEnter operator (+, -, *, /, ^, C): ", null, null},
                {"-1", "", "a", "Invalid operator\nEnter operator (+, -, *, /, ^, C): ", null, null},
                {"-1", "", "5", "Invalid operator\nEnter operator (+, -, *, /, ^, C): ", null, null},
                {"-1", "", "", "Invalid operator\nEnter operator (+, -, *, /, ^, C): ", null, null},
                {"-1", "", null, null, NullPointerException.class, null},
                //Enter x after a reset tests
                {"-1", "C", "jskjandj", "Invalid input\nEnter x: ", null, null},
                {"-1", "C", "10a", "Invalid input\nEnter x: ", null, null},
                {"-1", "C", "10 10", "Invalid input\nEnter x: ", null, null},
                {"-1", "C", "", "Invalid input\nEnter x: ", null, null},
                {"-1", "C", "- 10", "Invalid input\nEnter x: ", null, null},
                {"-1", "C", "10,1234", "Invalid input\nEnter x: ", null, null},
                {"-1", "C", "10", "Enter operator (+, -, *, /, ^, C): ", null, null},
                {"-1", "C", "-10", "Enter operator (+, -, *, /, ^, C): ", null, null},
                {"-1", "C", "10 ", "Enter operator (+, -, *, /, ^, C): ", null, null},
                {"-1", "C", " 10", "Enter operator (+, -, *, /, ^, C): ", null, null},
                {"-1", "C", "10.34534", "Enter operator (+, -, *, /, ^, C): ", null, null},
                {"-1", "C", "-10.34534", "Enter operator (+, -, *, /, ^, C): ", null, null},
                {"-1", "C", "0", "Enter operator (+, -, *, /, ^, C): ", null, null},
                {"-1", "C", "exit", "Good bye!\n", null, null},
                {"-1", "C", null, null, NullPointerException.class, null}
        });
    }

    @Test
    public void testCalcInterface(){
        try {
            this.calcInterface.invoke(this.calc, this.x);
            this.calcInterface.invoke(this.calc, this.secondInput);
            if (this.expectedException != null) {
                try {
                    assertEquals(this.expectedResult, this.calcInterface.invoke(this.calc, this.thirdInput));
                } catch (InvocationTargetException e) {
                    assertEquals(e.getCause().getClass(), this.expectedException);
                    assertEquals(e.getCause().getMessage(), this.expectedExceptionMsg);
                }
            } else {
                assertEquals("Error: first input: " + this.x +
                                ", second input: " + this.secondInput + ", third input: " + this.thirdInput,
                        this.expectedResult, this.calcInterface.invoke(this.calc, this.thirdInput));
            }
        } catch (InvocationTargetException e){
            fail(e.getCause().getClass() + " " + e.getCause().getMessage());
        } catch (Exception e){
            fail(e.getClass() + " : " + e.getMessage());
        } catch (Error er){
            fail(er.getClass() + " : " + er.getMessage());
        }
    }
}