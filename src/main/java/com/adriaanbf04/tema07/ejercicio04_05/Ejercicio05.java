package com.adriaanbf04.tema07.ejercicio04_05;

public class Ejercicio05 {
    public Ejercicio05() {
        Circle circleOne = new Circle(2.3,5.6,6.4);
        Circle circleTwo = new Circle(9.7,7.4,7.6);
        String info = circleOne.showInfoCircle();
        System.out.println(info);
        double area = circleOne.calculateArea();
        System.out.printf("The area is: %.2f\n",area);
        double perimetro = circleOne.calculatePerimetre();
        System.out.printf("The perimetrer is: %.2f", perimetro);
    }
}
