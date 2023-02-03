package com.adriaanbf04.tema07.ejercicio07;

public class Paciente {
    private int sip;
    private String nombre;
    private char sexo;

    private int edad;
    private Ingreso[] ingresos;
    private Ingreso ingreso;

    public Paciente(int sip, String nombre, char sexo, int edad) {
        this.sip = sip;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        ingresos = new Ingreso[40*30];
    }

    public int getSip() {
        return sip;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public Ingreso getIngreso() {
        return ingreso;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "sip=" + sip +
                ", nombre='" + nombre + '\'' +
                ", sexo=" + sexo +
                ", edad=" + edad + '\'' +
                '}';
    }
}
