
package sef.ATestTask.SecondActivity;

public class SecondActivity {

    public static void main(String[] args) {
        SecondActivity calculator = new SecondActivity();

        double a = 10;
        double b = 5;

        System.out.println(a + " + " + b + " = " + calculator.sum(a, b));
        System.out.println(a + " / " + b + " = " + calculator.divide(a, b));
        System.out.println(a + " * " + b + " = " + calculator.multiply(a, b));
        System.out.println(a + " - " + b + " = " + calculator.subtract(a, b));
    }


    public double sum(double x, double y) {
        return x + y;
    }

    public double divide(double x, double y) {
        return x / y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x - y;
    }
}

