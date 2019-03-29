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
public class SimpleCalcCalcInterfaceFirstInputTest {

    @Parameterized.Parameter(0)
    public String input;
    @Parameterized.Parameter(1)
    public String expectedResult;
    @Parameterized.Parameter(2)
    public boolean callInitialize;
    @Parameterized.Parameter(3)
    public Class<? extends Exception> expectedException;
    @Parameterized.Parameter(4)
    public String expectedExceptionMsg;

    private SimpleCalc calc;
    private Method calcInterface;
    private Method initialize;
    private static final boolean CALL_INITIALIZE = true;
    private static final boolean DO_NOT_CALL_INITIALIZE = false;

    @Before
    public void setUp() throws Exception {
        this.calc = new SimpleCalc();
        this.calcInterface = this.calc.getClass().getDeclaredMethod("calcInterface", String.class);
        this.initialize = this.calc.getClass().getDeclaredMethod("initialize");
        this.calcInterface.setAccessible(true);
        this.initialize.setAccessible(true);
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                { "jskjandj", "Invalid input\nEnter x: ", CALL_INITIALIZE, null, null },
                { "10a", "Invalid input\nEnter x: ", CALL_INITIALIZE, null, null },
                { "10 10", "Invalid input\nEnter x: ", CALL_INITIALIZE, null, null },
                { "", "Invalid input\nEnter x: ", CALL_INITIALIZE, null, null },
                { "- 10", "Invalid input\nEnter x: ", CALL_INITIALIZE, null, null },
                { "10,1234", "Invalid input\nEnter x: ", CALL_INITIALIZE, null, null },
                { "10", "Enter operator (+, -, *, /, ^, C): ", CALL_INITIALIZE, null, null },
                { "-10", "Enter operator (+, -, *, /, ^, C): ", CALL_INITIALIZE, null, null },
                { "10 ", "Enter operator (+, -, *, /, ^, C): ", CALL_INITIALIZE, null, null },
                { " 10", "Enter operator (+, -, *, /, ^, C): ", CALL_INITIALIZE, null, null },
                { "10.34534", "Enter operator (+, -, *, /, ^, C): ", CALL_INITIALIZE, null, null },
                { "-10.34534", "Enter operator (+, -, *, /, ^, C): ", CALL_INITIALIZE, null, null },
                { "0", "Enter operator (+, -, *, /, ^, C): ", CALL_INITIALIZE, null, null },
                { "exit", "Good bye!\n", CALL_INITIALIZE, null, null },
                { "", null, DO_NOT_CALL_INITIALIZE,
                        IllegalStateException.class, "initialize method is not called" },
                { null, null, CALL_INITIALIZE, NullPointerException.class, null }
        });
    }

    @Test
    public void testCalcInterface(){
        try {
            if (this.callInitialize){
                this.initialize.invoke(this.calc);
            }
            if (this.expectedException != null) {
                try {
                    assertEquals(this.expectedResult, this.calcInterface.invoke(this.calc, this.input));
                } catch (InvocationTargetException e) {
                    assertEquals(e.getCause().getClass(), this.expectedException);
                    assertEquals(e.getCause().getMessage(), this.expectedExceptionMsg);
                }
            } else {
                assertEquals(this.expectedResult, this.calcInterface.invoke(this.calc, this.input));
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