package com.adriaanbf04.tema07.ejercicio04_05;

public class Circle {
    public static final double PI = Math.PI;
    private Point point;
    private double radiusCircle;
    public Circle(Point point, double radiusCircle) {
        this.point = point;
        this.radiusCircle = radiusCircle;
    }

    public Circle(double x, double y, double radiusCircle) {
        this(new Point(x,y),radiusCircle);
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

    /**
     * This method calculate the distance between the center and the point passed
     * @param point
     * @return distance
     */
    public double distance(Point point) {
        return this.point.distanceCalculation(point);
    }

    /**
     * This method calculate the area
     * @return area
     */
    public double calculateArea() {
        return PI * Math.pow(radiusCircle,2);
    }

    /**
     * This method calculate the perimetre
     * @return perimetre
     */
    public double calculatePerimetre() {
        return (2 * PI) * this.radiusCircle;
    }

    /**
     * This method show the info of the circle with the center of the circle and the radius
     * @return teh info of the circle
     */
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
