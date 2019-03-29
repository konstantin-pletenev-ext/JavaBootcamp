package sef.ATestTask.SecondActivity;

import java.util.Scanner;

import static java.lang.Math.pow;

public class SimpleCalc {

    private double x;
    private char op;
    private enum State { STARTUP, INPUTX, INPUTOP, INPUTY, EXITED }
    private State state;

    public SimpleCalc(){
        this.state = State.STARTUP;
    }

    public static double solve(double x, double y, char op) throws ArithmeticException, IllegalArgumentException{
        switch (op){
            case '+':{
                return x + y;
            }
            case '-':{
                return x - y;
            }
            case '*':{
                return x * y;
            }
            case '/':{
                if (y == 0){
                    throw new ArithmeticException("division by 0");
                }
                return x / y;
            }
            case '^':{
                return pow(x, y);
            }
            default:{
                throw new IllegalArgumentException("invalid operator");
            }
        }
    }

    public static boolean checkOperator(char op){
        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '^'){
            return true;
        }
        return false;
    }

    public static boolean checkOperator(String op){
        if (op.contentEquals("+") || op.contentEquals("-")
                || op.contentEquals("*") || op.contentEquals("/")
                || op.contentEquals("^"))
        {
            return true;
        }
        return false;
    }

    private String initialize(){
        this.state = State.INPUTX;
        return "Enter exit at any point to quit the application\n" + "Enter x: ";
    }

    private String calcInterface(String input) throws IllegalStateException{
        switch (this.state){
            case STARTUP:{
                throw new IllegalStateException("initialize method is not called");
            }
            case EXITED:{
                throw new IllegalStateException("unexpected calcInterface method call");
            }
            case INPUTX:

                if (input.equals("exit")){
                    this.state = State.EXITED;
                    return "Good bye!\n";
                }

                try {
                    this.x = Double.parseDouble(input);
                    this.state = State.INPUTOP;
                    return "Enter operator (+, -, *, /, ^, C): ";
                } catch (Exception e) {
                    return "Invalid input\n" + "Enter x: ";
                }

            case INPUTY: {

                if (input.equals("exit")) {
                    this.state = State.EXITED;
                    return "Good bye!\n";
                }

                double y;
                try {
                    y = Double.parseDouble(input);
                } catch (Exception e) {
                    return "Invalid input\n" + "Enter y: ";
                }

                double result;
                try {
                    result = solve(this.x, y, this.op);
                } catch (Exception e) {
                    this.state = State.INPUTX;
                    return "Error: " + e.getMessage() + "\n" + "Enter x: ";
                }

                this.state = State.INPUTOP;
                this.x = result;
                return "Result: " + result + "\n" + "Enter operator (+, -, *, /, ^, C): ";

            }
            case INPUTOP:{

                if (input.equals("exit")){
                    this.state = State.EXITED;
                    return "Good bye!\n";
                }

                if (input.equals("C") || input.equals("c")){
                    this.state = State.INPUTX;
                    return "Enter x: ";
                }

                if (!checkOperator(input)) {
                    return "Invalid operator\n" + "Enter operator (+, -, *, /, ^, C): ";
                }

                this.op = input.charAt(0);
                this.state = State.INPUTY;
                return "Enter y: ";

            }
            default:{
                throw new IllegalStateException("unknown state");
            }
        }
    }

    public void start() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print(initialize());
        boolean exit = false;
        do{
            String output = calcInterface(sc.nextLine());
            System.out.print(output);
            if (output.equals("Good bye!\n")){
                exit = true;
            }
        } while (!exit);
    }

    public static void main(String[] args) {

        SimpleCalc calc = new SimpleCalc();
        try {
            calc.start();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
