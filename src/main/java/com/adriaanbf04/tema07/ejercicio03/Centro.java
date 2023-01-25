package com.adriaanbf04.tema07.ejercicio03;

import com.adriaanbf04.tema07.UtillsAdri.Array;
import com.github.javafaker.Faker;

public class Centro {
    private final Alumnos[] alumnos;
    private int contador;
    private Alumnos alumno;

    private final Faker faker = new Faker();

    public Centro(int maxAlumnos) {
        alumnos = new Alumnos[maxAlumnos];
        contador = 0;
    }

    public Alumnos[] getAlumnos() {
        return alumnos;
    }
    public boolean newStudent() {
        if (contador < alumnos.length) {
            addStudent();
            return true;
        }
        return false;
    }
    void addStudent() {
        int nia = faker.number().numberBetween(10000000,99999999);
        String nombre = faker.name().name();
        String apellido = faker.name().name();
        int edad = faker.number().numberBetween(7, 30);
        int grupo = faker.number().numberBetween(0,10);
        int telefono = faker.number().numberBetween(60000000,69999999);
        alumnos[contador] = new Alumnos(nia,nombre,apellido,edad,grupo,telefono);
        contador++;
    }

    public boolean deleteStudent(int niaIntroduced) {
        int pos = searchForNia(niaIntroduced);
        boolean valid = !(pos <= 0);
        if (valid) {
            alumnos[pos] = null;
            alumnos[pos] = alumnos[contador-1];
            contador --;
            return true;
        }
        return false;
    }
    public Alumnos[] searchForGroup(int group) {

        int cont = 0;
        for (int i = 1; i < alumnos.length; i ++) {
            int course = alumnos[i].getGrupo();
            if (course == group) {
                cont++;
            }
        }
        Alumnos[] results = new Alumnos[cont];
        for (int i = 1; i < cont; i ++) {
            int course = alumnos[i].getGrupo();
            if (course == group) {
                //Añadir a los alumnos
                results[i] = alumnos[i];
            }
        }
        return results;
    }



    public Alumnos[] searchForAge(int age) {
        int cont = 0;
        for (int i = 0; i < contador; i ++) {
            int yearTwo = alumnos[i].getEdad();
            if (age == yearTwo) {
                cont++;
            }
        }
        Alumnos[] results = new Alumnos[cont];
        for(int i = 0; i < cont; i ++) {
            int yearTwo = alumnos[i].getEdad();
            if (age == yearTwo) {
                results[i] = alumnos[i];
            }
        }
        return results;
    }

    public String searchForSurname(char surnameLetter) {
        //First letter of the surname written
        StringBuilder res = new StringBuilder();
        String surname = Character.toString(surnameLetter);
        return res.toString();
    }

    public int searchForNia(int niaStudent) {
        for (int i = 0; i < contador; i ++) {
            int nia = alumnos[i].getNia();
            if (nia == niaStudent) {
                return i;
            }
        }
        return -1;
    }
    public void listStudents() {
        int cont = 0;
        for (int i = 0; i < alumnos.length; i ++) {
            if (alumnos[i] != null) {
                cont ++;
            }
        }
        if (cont <= 0) {
            System.out.println("Don't have students");
        } else {
            Alumnos[] res = new Alumnos[cont];
            for (int i = 0; i < cont; i ++) {
                if (alumnos[i] != null) {
                    res[i] = alumnos[i];
                }
            }
            Array.showArray(res);
        }
    }
}
