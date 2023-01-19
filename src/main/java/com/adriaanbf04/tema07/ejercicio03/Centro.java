package com.adriaanbf04.tema07.ejercicio03;

import com.github.javafaker.Faker;

public class Centro {
    private final Alumnos[] alumnos;
    private final Faker faker = new Faker();

    public Centro(int maxAlumnos) {
        alumnos = new Alumnos[maxAlumnos];
        for (int i = 0; i < alumnos.length; i ++) {
            int nia = faker.number().numberBetween(100000000,999999999);
            String nombre = faker.name().name();
            String apellido = faker.name().name();
            String fecha = faker.date().toString();
            int grupo = faker.number().numberBetween(0,10);
            int telefono = faker.number().numberBetween(60000000,69999999);
            Alumnos alumno = new Alumnos(nia,nombre,apellido,fecha,grupo,telefono);
        }
    }

    public void addClassmate() {
        //Añadir a un alumno
    }

    public void deleteClassmate(int niaClassmate) {
        for (int i = 0; i < alumnos.length; i ++) {
            int nia =  0; //Obtener NIA del alumno
            if (niaClassmate == nia) {
                boolean delete = false;
                if (delete == true) {
                    //Eliminar el alumno
                }else {
                    /*Ignorar hasta que encuetre el alumno o
                    no este ese alumno*/
                    continue;
                }
            }
        }
    }
}
