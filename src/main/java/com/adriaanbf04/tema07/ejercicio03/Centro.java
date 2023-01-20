package com.adriaanbf04.tema07.ejercicio03;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Centro {
    private final Alumnos[] alumnos;
    private Alumnos alumno;

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
            alumno = new Alumnos(nia,nombre,apellido,fecha,grupo,telefono);
        }
    }

    public void addClassmate() {
        Alumnos[] res = Arrays.copyOf(alumnos,(alumnos.length)+1);
        int nia = faker.number().numberBetween(100000000,999999999);
        String nombre = faker.name().name();
        String apellido = faker.name().name();
        String fecha = faker.date().toString();
        int grupo = faker.number().numberBetween(0,10);
        int telefono = faker.number().numberBetween(60000000,69999999);

        res[res.length-1] = new Alumnos(nia,nombre,apellido,fecha,grupo,telefono);
    }

    public void deleteClassmate(int niaIntroduced) {
        //Alumnos[] res = Arrays.copyOf(alumnos,(alumnos.length)-1);
        for (int i = 0; i < alumnos.length; i ++) {
            int nia = alumno.getNia();
            if (nia == niaIntroduced) {
                //borrar el alumno
            }
        }
    }

    public String searchForGroup(int group) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < alumnos.length; i ++) {
            //Si pertenecen al mismo grupo, se añade en res para luego sacar todos los alumnos con esas condiciones
            int course = alumno.getGrupo();
            if (course== group) {
                res.append(alumno.toString());
                break;
            }
        }
        if (res.equals(" ")) {
            return "We didn't find the classmate";
        }
        return res.toString();
    }



    public String searchForAge(int age) {
        return" ";
    }

    public String searchForSurname(char surnameLetter) {
        StringBuilder res = new StringBuilder();
        String surname = Character.toString(surnameLetter);
        //Si empieza por la misma letra, se añade en res para luego sacar todos los alumnos con esas condiciones
        for (Alumnos classmate : alumnos)
            if (classmate.getApellidos().equals(surname)) {
                res.append(classmate);
                break;
            }
        return res.toString();
    }
}
