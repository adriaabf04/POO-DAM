package com.adriaanbf04.tema07.ejercicio04_05;

public class Circle {
    public static final double PI = 3.14;
    private Point point;
    private double radiusCircle;
    public Circle(Point point, double radiusCircle) {
        this.point = point;
        this.radiusCircle = radiusCircle;
    }

    public Circle(double x, double y, double radiusCircle) {
        this.point = new Point(x,y);
        this.radiusCircle = radiusCircle;
    }

    public Circle() {
        this(new Point(2.3,5.4),8.52);
    }

    public Point getPoint() {
        return point;
    }

    public double getRadiusCircle() {
        return radiusCircle;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setRadiusCircle(double radiusCircle) {
        this.radiusCircle = radiusCircle;
    }

    public double distance(Point point) {
        return 0.0;
    }

    public double calculateArea() {
        double res = Math.pow(PI * radiusCircle,2);
        return res;
    }

    public double calculatePerimetre() {
        double res = (2 * PI) * this.radiusCircle;
        return res;
    }

    public String showInfoCircle() {
        double x = point.getPointX();
        double y = point.getPointY();
        if (x == 0 && y == 0) {
            return "Circle in " +
                    "the origins of coordinate" +
                    "with radius of " + radiusCircle;
        }
        return "Circle in " +
                "point" + point +
                "with radius of " + radiusCircle;
    }
}
