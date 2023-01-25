package com.adriaanbf04.tema07.ejercicio04;

import com.adriaanbf04.tema07.UtillsAdri.Array;

public class Ejercicio04 {
    public Ejercicio04() {
        int maxPoints = 2;
        Point[] pointCreated = new Point[maxPoints];
        showPoints(pointCreated);
    }

    public void showPoints(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
        }
    }
}
