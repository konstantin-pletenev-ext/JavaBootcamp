package sef.module6.activity;

public class AbstractActivity {

    public static void main(String arg[]) {

        Shape square = new Square();
        Shape rectangle = new Rectangle();

        System.out.println("Square perimeter " + square.calculatePerimeter());

    }
}
