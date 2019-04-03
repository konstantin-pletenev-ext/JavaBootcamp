package sef.ATestTask.SecondActivity;

public class Calculator {

        public double getSum(double a, double b){
            return a + b;
        }
        public double getDifference(double a, double b){
            return a - b;
        }
        public double getProduct(double a, double b){
            return a * b;
        }

        public double getQuotient(double a, double b) {

            if (b == 0) {
                throw new ArithmeticException("Illegal operation: division by zero");
            }
            else {
                return a / b;
            }
        }
        // check 4/3/2019
    }
