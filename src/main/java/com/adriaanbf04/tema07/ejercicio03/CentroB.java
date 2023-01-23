package com.adriaanbf04.tema07.ejercicio03;

import com.github.javafaker.Faker;

public class CentroB {
    private final Alumnos[] alumnos;
    private int contador;
    private Alumnos alumno;

    private final Faker faker = new Faker();

    public CentroB(int maxAlumnos) {
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
        String fecha = faker.date().toString();
        int grupo = faker.number().numberBetween(0,10);
        int telefono = faker.number().numberBetween(60000000,69999999);

        int pos = recorrerArray(alumnos);
        if (pos >= 0) {
            alumnos[pos] = new Alumnos(nia,nombre,apellido,fecha,grupo,telefono);
        } else {
            alumnos[contador] = new Alumnos(nia,nombre,apellido,fecha,grupo,telefono);
            contador ++;
        }
    }

    public boolean deleteStudent(int niaIntroduced) {
        int pos = searchForNia(niaIntroduced);
        boolean valid = !(pos <= 0 && pos == 0);
        if (valid) {
            alumnos[pos] = null;
            return true;
        }
        return false;
    }

    public void searchForGroup(int group) {
        StringBuilder res = new StringBuilder();
        for (Alumnos value : alumnos) {
            //Si pertenecen al mismo grupo, se añade en res para luego sacar todos los alumnos con esas condiciones
            int course = value.getGrupo();
            if (course == group) {
                res.append(alumno.toString());
                break;
            }
        }
        if (res.equals(" ")) {
        }
    }



    public String searchForAge(int age) {
        for (int i = 0; i < alumnos.length; i ++) {
            String year = Integer.toString(age);
            String yearTwo = alumnos[i].getFecha();
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
        for (int i = 0; i < alumnos.length; i ++) {
            if (alumnos[i].getNia() == niaStudent) {
                return i;
            }
        }
        return -1;
    }

    int recorrerArray(Alumnos[] alumnos) {
        for (int i = 0; i < alumnos.length; i ++) {
            if (alumnos[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
