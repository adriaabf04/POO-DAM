package com.adriaanbf04.tema07.ejercicio04_05;

public class Ejercicio04 {
    public Ejercicio04() {
        int maxPoints = 1;
        Point point = new Point();
        System.out.println(point.toString());
        double distance = point.distanceCalculation(point);
        System.out.printf("The distance is: %.2f", distance);
    }
}
