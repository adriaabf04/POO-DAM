package com.adriaanbf04.tema07.ejercicio01;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ejercicio01 {
    public Ejercicio01() {
        Faker faker = new Faker();
        Coche[] coches = new Coche[5];
        for (int i = 0; i < coches.length / 2; i ++) {
            coches[i] = new Coche();
            System.out.println(coches[i]);
        }
    int count = 20;
        for (int i = coches.length / 2; i < coches.length; i ++) {
            String modelo = faker.company().name();
            String color = faker.color().hex();
            boolean metalizado = faker.bool().bool();
            String matricula = String.format("%04d", faker.number().numberBetween(0,9999));
            Coche.Tipo tipo = Coche.Tipo.values()[faker.number().numberBetween(0, Coche.Tipo.values().length-1)];
            int anyoabricacion = faker.number().numberBetween(2010,2013);
            Coche.Seguro modalidadSeguro = Coche.Seguro.values()[faker.number().numberBetween(0,Coche.Seguro.values().length-1)];
            coches[i] = new Coche(modelo,color,metalizado,matricula,tipo,anyoabricacion,modalidadSeguro);
        }
        Arrays.toString(coches);
    }
}
