package sef.ATestTask.SecondActivity;

// Complete Code
public class SecondActivity {

    public static void main(String[] args) {
        SecondActivity calculator = new SecondActivity();

        //TODO Use the calculator to calculate different values
        System.out.println(calculator.add(10, 5));
        System.out.println(calculator.sub(5, 10));
        System.out.println(calculator.div(100, 33));
        System.out.println(calculator.mod(97, 33));
        System.out.println(calculator.multi(35, 3));
    }

    //TODO create the Calculator (here or in additional class)
//    public void add(double x, double y) {
//        String x1 = getRidofZeros(x);
//        String y1 = getRidofZeros(y);
//        double sum = x + y;
//        String sum2 = getRidofZeros(sum);
//        System.out.println(x1 + " + " + y1 + " = " + sum2);
//    }
//
//    // Subtract
//    public void substract(double x, double y) {
//        String x1 = getRidofZeros(x);
//        String y1 = getRidofZeros(y);
//        double sub = x - y;
//        String sub2 = getRidofZeros(sub);
//        System.out.println(x1 + " - " + y1 + " = " + sub2);
//    }
//
//    // Multiply
//    public void multiply(double x, double y) {
//        String x1 = getRidofZeros(x);
//        String y1 = getRidofZeros(y);
//        double multi = x * y;
//        String multi2 = getRidofZeros(multi);
//        System.out.println(x1 + " * " + y1 + " = " + multi2);
//    }
//
//    // Divide
//    public void dividefloat(double x, double y) {
//        String x1 = getRidofZeros(x);
//        String y1 = getRidofZeros(y);
//        if (y != 0) {
//            double div = x / y;
//            String div2 = getRidofZeros(div);
//            System.out.println(x1 + " / " + y1 + " = " + div2);
//
//        } else {
//            System.out.println("You can't divide with 0!");
//        }
//    }
//
//    public void divide(double x, double y) {
//        String x1 = getRidofZeros(x);
//        String y1 = getRidofZeros(y);
//        if (y != 0) {
//            double div = x / y;
//            System.out.println(x1 + " / " + y1 + " = " + (int) div);
//
//        } else {
//            System.out.println("You can't divide with 0!");
//        }
//    }
//
//    public void mod(double x, double y) {
//        String x1 = getRidofZeros(x);
//        String y1 = getRidofZeros(y);
//        if (y != 0) {
//            double mod = x % y;
//            String mod2 = getRidofZeros(mod);
//            System.out.println(x1 + " % " + y1 + " = " + mod2);
//
//        } else {
//            System.out.println("You can't divide with 0!");
//        }
//    }
//
//
//    public String getRidofZeros(double number)
//    {
//        if(number == (long) number)
//            return String.format("%d",(long)number);
//        else
//            return String.format("%s",number);
//}

    public int add(int x, int y) {
        return x + y;
    }

    // Subtract
    public int sub(int x, int y) {
        return x - y;
    }

    // Multiply
    public int multi(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("Argument 'divisor' is 0!");
        }
    }

    public int mod(int x, int y) {
        if (y != 0) {
            return x % y;
        } else {
            throw new ArithmeticException();
        }
    }
}



