package com.adriaanbf04.tema07.ejercicio04_05;

public class Ejercicio05 {
    public Ejercicio05() {
        Circle circleOne = new Circle(2.3,5.6,6.4);
        Point point = new Point(2.3,8.4);
        circleOne.setPoint(point);
        System.out.println(circleOne.showInfoCircle());
        point.setPointX(10);
        System.out.println(circleOne.showInfoCircle());
        String info = circleOne.showInfoCircle();
        System.out.println(info);
        double area = circleOne.calculateArea();
        System.out.printf("The area is: %.2f\n",area);
        double perimetro = circleOne.calculatePerimetre();
        System.out.printf("The perimetrer is: %.2f\n", perimetro);
        double distance = circleOne.distance(point);
        System.out.printf("The distance beginning the center of the circle until the point passed is: %.2f", distance);
    }
}
