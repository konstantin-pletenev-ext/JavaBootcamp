package sef.module6.activity;

public class Tringle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    Tringle() {

    }

    Tringle(double sideA, double sideB) {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = calculateSideC(sideA, sideB);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return side * 4;
    }
private double calculateSideC(double SideA, double sideB) {

}

}
