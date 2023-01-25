package com.adriaanbf04.tema07.ejercicio04_05;

public class Ejercicio04 {
    public Ejercicio04() {
        int maxPoints = 1;
        Point[] pointCreated = new Point[maxPoints];
        createPoints(pointCreated);
        showPoints(pointCreated);
    }
    public void createPoints(Point[] point) {
        for (int i = 0; i < point.length; i ++) {
            point[i] = new Point();
        }
    }
    public void showPoints(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
        }
    }
}
