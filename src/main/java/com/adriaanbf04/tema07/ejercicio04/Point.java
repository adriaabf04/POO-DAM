package com.adriaanbf04.tema07.ejercicio04;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public Point() {
        this(2.6,0.2);
    }
    //Getters

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    //Setters

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    //Methods
    public double distanceCalculation(Point point) {
        double a = point.getPointX();
        double b = point.getPointY();
        a = Math.pow(a,2);
        b = Math.pow(b,2);
        double res = Math.sqrt(a+b);
        return res;
    }

    @Override
    public String toString() {
        return "Point = " +
                "( " + pointX +
                "," + pointY +
                " )";
    }
}
