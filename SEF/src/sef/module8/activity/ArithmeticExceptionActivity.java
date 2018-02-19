package sef.module8.activity;

// Needs to be completed
public class ArithmeticExceptionActivity {
    //1 - Type main method and call catchMe with 10 and 0
    public static void main(String[] args) {
        catchMe(10, 0);
        catchMe(10, 2);
        catchMe(0, 2);

    }


    static void catchMe(int num1, int num2) {
        //The following code results in an Exception.
        //2 - Identify the exception and write code to handle this exception.
        try {
            int result = num1 / num2;
            System.out.println("The result is : " + result);
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Generic Exception");
        }
        finally {
            System.out.println("-----------\n" +
                    "Thank you for using this program.");
        }

        //4- try to call catchMe with 10 and 2 now and see which messages get printed.

    }

}
