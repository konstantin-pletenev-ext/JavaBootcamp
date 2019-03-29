package sef.ATestTask.SecondActivity;

public class CalculatorFunction {

    private double Sum;
    private double Diff;
    private double Multiply;
    private double Divide;

    public double getSum(double a, double b) {

            return a+b;
        }

        public double getDifference(double a, double b) {
            return a - b;
        }

        public double getMultiply(double a, double b) {
        return a * b;
        }

        public double getDivide(double a, double b) {
            if (b == 0)
                throw new IllegalArgumentException("Divided by 0 - not allowed!");
            return a / b;
        }

}
