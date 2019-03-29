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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class SimpleCalcCalcInterfaceSecondInputTest {

    @Parameterized.Parameter(0)
    public String x;
    @Parameterized.Parameter(1)
    public String secondInput;
    @Parameterized.Parameter(2)
    public String expectedResult;
    @Parameterized.Parameter(3)
    public Class<? extends Exception> expectedException;
    @Parameterized.Parameter(4)
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
        return Arrays.asList(new Object[][]{
                //Enter operator tests
                { "-1", "+", "Enter y: ", null, null },
                { "-1", "-", "Enter y: ", null, null },
                { "-1", "*", "Enter y: ", null, null },
                { "-1", "/", "Enter y: ", null, null },
                { "-1", "^", "Enter y: ", null, null },
                { "-1", "C", "Enter x: ", null, null },
                { "-1", "c", "Enter x: ", null, null },
                { "-1", "exit", "Good bye!\n", null, null },
                { "-1", "&", "Invalid operator\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-1", "**", "Invalid operator\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-1", "+-", "Invalid operator\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-1", "+ -", "Invalid operator\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-1", "a", "Invalid operator\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-1", "5", "Invalid operator\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-1", "", "Invalid operator\nEnter operator (+, -, *, /, ^, C): ", null, null },
                { "-1", null, null, NullPointerException.class, null },
                { "exit", "+", null, IllegalStateException.class, "unexpected calcInterface method call" },
                //Enter x again tests
                { "", "jskjandj", "Invalid input\nEnter x: ", null, null },
                { "", "10a", "Invalid input\nEnter x: ", null, null },
                { "", "10 10", "Invalid input\nEnter x: ", null, null },
                { "", "", "Invalid input\nEnter x: ", null, null },
                { "", "- 10", "Invalid input\nEnter x: ", null, null },
                { "", "10,1234", "Invalid input\nEnter x: ", null, null },
                { "", "10", "Enter operator (+, -, *, /, ^, C): ", null, null },
                { "", "-10", "Enter operator (+, -, *, /, ^, C): ", null, null },
                { "", "10 ", "Enter operator (+, -, *, /, ^, C): ", null, null },
                { "", " 10", "Enter operator (+, -, *, /, ^, C): ", null, null },
                { "", "10.34534", "Enter operator (+, -, *, /, ^, C): ", null, null },
                { "", "-10.34534", "Enter operator (+, -, *, /, ^, C): ", null, null },
                { "", "0", "Enter operator (+, -, *, /, ^, C): ", null, null },
                { "", "exit", "Good bye!\n", null, null },
                { "", null, null, NullPointerException.class, null }
        });
    }

    @Test
    public void testCalcInterface(){
        try {
            this.calcInterface.invoke(this.calc, this.x);
            if (this.expectedException != null) {
                try {
                    assertEquals(this.expectedResult, this.calcInterface.invoke(this.calc, this.secondInput));
                } catch (InvocationTargetException e) {
                    assertEquals(e.getCause().getClass(), this.expectedException);
                    assertEquals(e.getCause().getMessage(), this.expectedExceptionMsg);
                }
            } else {
                assertEquals(this.expectedResult, this.calcInterface.invoke(this.calc, this.secondInput));
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