package com.adriaanbf04.tema07.ejercicio06;

public class Bicycle {
    private String reference;
    private String brand;
    private String model;
    private int peso;
    private int wheelsSize;
    private boolean containMotor;
    private String dataDone;
    private int price;
    private int cuantityProduct;

    public Bicycle(String reference, String brand, String model, int peso, int wheelsSize, boolean containMotor, String dataDone, int price, int cuantityProduct) {
        this.reference = reference;
        this.brand = brand;
        this.model = model;
        this.peso = peso;
        this.wheelsSize = wheelsSize;
        this.containMotor = containMotor;
        this.dataDone = dataDone;
        this.price = price;
        this.cuantityProduct = cuantityProduct;
    }

    public String getReference() {
        return reference;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPeso() {
        return peso;
    }

    public int getWheelsSize() {
        return wheelsSize;
    }

    public boolean isContainMotor() {
        return containMotor;
    }

    public String getDataDone() {
        return dataDone;
    }

    public int getPrice() {
        return price;
    }

    public int getCuantityProduct() {
        return cuantityProduct;
    }

    public void setCuantityProduct(int cuantityProduct) {
        this.cuantityProduct = cuantityProduct;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "reference='" + reference + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", peso=" + peso +
                ", wheelsSize=" + wheelsSize +
                ", containMotor=" + containMotor +
                ", dataDone='" + dataDone + '\'' +
                ", price=" + price +
                ", cuantityProduct=" + cuantityProduct +
                '}';
    }
}
