package com.adriaanbf04.tema07.ejercicio02;

public class Ejercicio02 {
    public Ejercicio02() {
        Asignaturas[] asignaturas = new Asignaturas[5];
        for (int i = 0; i < asignaturas.length; i ++) {
            asignaturas[i] = new Asignaturas();
            System.out.println(asignaturas[i]);
        }
    }
}
