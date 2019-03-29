package sef.ATestTask.SecondActivity;

// Complete Code
public class SecondActivity {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        //TODO Use the calculator to calculate different values
        //Example ->
        //calculator.sum(10.2, 5);
        //calculator.divide(100, 33);
        // and more
        double result = calculator.sum(4, 5.0);
//        System.out.println("Sum result is " + result);
//        result = calculator.differ(4, 5);
//        System.out.println("Difference result is " + result);
//        result = calculator.divide(4, 5.0);
//        System.out.println("Dividing result is " + result);
        result = calculator.divide(4, 0);
        System.out.println("Dividing by zero result is " + result);
//        result = calculator.multiply(4, 5);
//        System.out.println("Multiply result is " + result);



    }

    //TODO create the Calculator (here or in additional class)

}
