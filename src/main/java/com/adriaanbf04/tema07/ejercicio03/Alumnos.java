package com.adriaanbf04.tema07.ejercicio03;

public class Alumnos {
    private final int nia;
    private final String nombre;
    private final String apellidos ;
    private final String fecha;
    private final int grupo;
    private final int telefono;

    public Alumnos(int nia, String nombre, String apellidos, String fecha, int grupo, int telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
        this.grupo = grupo;
        this.telefono = telefono;
    }

    public int getNia() {
        return nia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFecha() {
        return fecha;
    }

    public int getGrupo() {return grupo;}

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "nia=" + nia +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha='" + fecha + '\'' +
                ", grupo=" + grupo +
                ", telefono=" + telefono +
                '}';
    }
}
