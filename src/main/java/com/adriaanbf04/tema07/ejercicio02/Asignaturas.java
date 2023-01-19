package com.adriaanbf04.tema07.ejercicio02;

public class Asignaturas {
    private final String nombre;
    private final int codigoNumerico;
    private final int curso;
    public Asignaturas (String nombre, int codigoNumerico, int curso) {
        this.nombre = nombre;
        this.codigoNumerico = codigoNumerico;
        this.curso = curso;
    }

    public Asignaturas () {
        this("Programación", 1017, 1);
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigoNumerico() {
        return codigoNumerico;
    }

    public int getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Asignaturas{" +
                "nombre='" + nombre + '\'' +
                ", codigoNumerico=" + codigoNumerico +
                ", curso=" + curso +
                '}';
    }
}
