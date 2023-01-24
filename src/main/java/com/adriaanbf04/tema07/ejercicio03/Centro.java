package com.adriaanbf04.tema07.ejercicio03;

import com.github.javafaker.Faker;

public class Centro {
    private final Alumnos[] alumnos;
    private int contador;
    private Alumnos alumno;

    private final Faker faker = new Faker();

    public Centro(int maxAlumnos) {
        alumnos = new Alumnos[maxAlumnos];
        for (int i = 0; i < alumnos.length; i ++) {
            int nia = faker.number().numberBetween(100000000,999999999);
            String nombre = faker.name().name();
            String apellido = faker.name().name();
            int edad = faker.number().numberBetween(7, 30);
            int grupo = faker.number().numberBetween(0,10);
            int telefono = faker.number().numberBetween(60000000,69999999);
            alumno = new Alumnos(nia,nombre,apellido,edad,grupo,telefono);
        }
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
        int nia = faker.number().numberBetween(100000000,999999999);
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
            return true;
        }
        return false;
    }

    public String searchForGroup(int group) {
        StringBuilder res = new StringBuilder();
        for (Alumnos value : alumnos) {
            //Si pertenecen al mismo grupo, se añade en res para luego sacar todos los alumnos con esas condiciones
            //int course = value.getGrupo();
            /*if (course == group) {
                res.append(alumno.getNombre()).append("-").append(alumno.getApellidos()).append("-").append(alumno.getGrupo()).append("-").append(alumno.getNia()).append("-");
            } */
        }
        return res.toString(); 
    }



    public String searchForAge(int age) {
        for (int i = 0; i < alumnos.length; i ++) {
            int yearTwo = alumnos[i].getEdad();
        }
        return" ";
    }

    public String searchForSurname(char surnameLetter) {
        StringBuilder res = new StringBuilder();
        String surname = Character.toString(surnameLetter);
        //Si empieza por la misma letra, se añade en res para luego sacar todos los alumnos con esas condiciones
        return res.toString();
    }

    public int searchForNia(int niaStudent) {
        for (int i = 1; i < alumnos.length; i ++) {
            int nia = alumno.getNia();
            if (nia == niaStudent) {
                return i;
            }
        }
        return -1;
    }
}
