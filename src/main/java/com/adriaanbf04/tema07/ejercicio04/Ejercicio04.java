package com.adriaanbf04.tema07.ejercicio04;

public class Ejercicio04 {
    public Ejercicio04() {
        Point pointOne = new Point();
        Point pointTwo = new Point(5.3,8.7);

        double res = pointTwo.distanceCalculation(pointTwo);
        System.out.printf("The point is: %.2f",res);
    }
}
