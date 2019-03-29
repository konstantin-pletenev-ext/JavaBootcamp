package sef.ATestTask.SecondActivity;

public class Calculator {


    public double sum(int a, double b) {
        double result = a + b;
        return result;
    }

    public double differ(int a, int b) {
        double result = a - b;
        return result;
    }

    public double multiply(int a, int b) {
        double result = a * b;
        return result;
    }

    public double divide(double a, double b) {
        double result = 0;
        if (b == 0)
            throw new IllegalArgumentException("Second number must be more than zero.");
            // System.err.println("Second number must be more than zero.");
        else {
            result = a / b;
        }
        return result;
    }

}
