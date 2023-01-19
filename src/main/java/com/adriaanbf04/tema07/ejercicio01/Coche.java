package com.adriaanbf04.tema07.ejercicio01;
public class Coche {
    public enum Tipo{MINI,UTILITARIO,FAMILIAR, DEPORTIVO}
    public enum Seguro {TERCEROS, RIESGO}
    private int count;
    private int id;
    private String modelo;
    private String color;
    private boolean metalizada;
    private String matricula;
    private Tipo tipoDeCoche;
    private int anyoFabricacion;
    private Seguro modalidadSeguro;

    public Coche(String modelo, String color, boolean metalizada, String matricula, Tipo tipoDeCoche, int anyoFabricacion, Seguro modalidadsSeguro) {
        this.id = ++count;
        this.modelo = modelo;
        this.color = color;
        this.metalizada = metalizada;
        this.matricula = matricula;
        this.tipoDeCoche = Tipo.MINI;
        this.anyoFabricacion = anyoFabricacion;
        this.modalidadSeguro = Seguro.TERCEROS;
    }
    public Coche() {
        this("Peugeot", "#FFFFFF", false, "7865KZG",  Tipo.DEPORTIVO, 2006, Seguro.RIESGO);
    }

    public int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public boolean isMetalizada() {
        return metalizada;
    }

    public String getMatricula() {
        return matricula;
    }

    public Tipo getTipoDeCoche() {
        return tipoDeCoche;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public Seguro getModalidadSeguro() {
        return modalidadSeguro;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMetalizada(boolean metalizada) {
        this.metalizada = metalizada;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTipoDeCoche(Tipo tipoDeCoche) {
        this.tipoDeCoche = tipoDeCoche;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public void setModalidadSeguro(Seguro modalidadSeguro) {
        this.modalidadSeguro = modalidadSeguro;
    }

    @Override
    public String toString() {
        return "Coche{" +
                ", id=" + id +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", metalizada=" + metalizada +
                ", matricula='" + matricula + '\'' +
                ", tipoDeCoche=" + tipoDeCoche +
                ", anyoFabricacion=" + anyoFabricacion +
                ", modalidadSeguro=" + modalidadSeguro +
                '}';
    }
}
