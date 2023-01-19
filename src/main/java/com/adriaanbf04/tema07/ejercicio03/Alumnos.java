package com.adriaanbf04.tema07.ejercicio03;

public class Alumnos {
    private int nia;
    private String nombre;
    private String apellidos ;
    private String fecha;
    private int grupo;
    private int telefono;

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

    public int getGrupo() {
        return grupo;
    }

    public int getTelefono() {
        return telefono;
    }
}
