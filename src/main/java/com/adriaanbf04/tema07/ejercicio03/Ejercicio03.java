package com.adriaanbf04.tema07.ejercicio03;
import java.util.Scanner;
import com.adriaanbf04.tema07.UtillsAdri.IO;
public class Ejercicio03 {
    public static Scanner scanner = new Scanner(System.in);
    private final static int MAX_ALUMNOS = 10;

    public Ejercicio03() {
        Centro centro = new Centro(MAX_ALUMNOS);
        int opcion,optionTwo;
        do {
            opcion = principalMenu();
            switch (opcion) {
                case 1:
                    if (!centro.newStudent()) {
                        System.out.println("Ya no se admiten más alumnos");
                    } else {
                        System.out.println("Student added");
                    }
                    break;
                case 2:
                    int niaDeleted = IO.readNumber("Introduce the NIA: ", 10000000,99999999);
                    if(!centro.deleteStudent(niaDeleted)) {
                        System.out.println("No se encuentra el alumno");
                    } else {
                        System.out.println("Student deleted");
                    }
                    break;
                case 3:
                    do {
                        optionTwo = secondaryMenu();
                        switch (optionTwo) {
                            case 1:
                                int group = IO.readNumber("Introduce the group: ", 1);
                                String res = centro.searchForGroup(group);
                                if (res.equals(" ")) { 
                                    System.out.println("Don't have results");
                                } else {
                                    System.out.println(res);
                                }
                                break;
                            case 2:
                                int age = IO.readNumber("Introduce the age: ", 7);
                                String years = centro.searchForAge(age);
                                if (years.equals(" ")) {
                                    System.out.println("Don't have results");
                                } else {
                                    System.out.println(years);
                                }
                                break;
                            case 3:
                                int niaStudent = IO.readNumber("Introduce the NIA: ", 10000000,99999999);
                                int nia =centro.searchForNia(niaStudent);
                                if (nia < 0) {
                                    System.out.println("Don't have results");
                                } else {
                                    System.out.println(nia);
                                }
                                break;
                            case 4:
                                String surname = IO.readMessage("Introduce the surname: ", 0);
                                char letter = surname.charAt(0);
                                String firstLetter = String.valueOf(letter);
                                String results = centro.searchForSurname(letter);
                                if (results.equalsIgnoreCase(" ")) {
                                    System.out.println("Don't have results");
                                } else {
                                    System.out.println(results);
                                }
                                break;
                        }
                    }while(optionTwo!= 0);
            }
        }while(opcion!= 0);
    }

    public static int principalMenu() {
        boolean valid;
        int option;
        int min = 0;
        int max = 3;
        System.out.println("************************");
        System.out.println("*******CLASSMATES*******");
        System.out.println("************************");
        System.out.println("\n");
        do {
            System.out.println("1. New classmate");
            System.out.println("2. Delete classmate");
            System.out.println("3. Queries");
            System.out.println("-------------------------");
            System.out.println("0. Exit");
            System.out.println("Choose an option: ");
            option = Integer.parseInt(scanner.nextLine());
            valid = option >= min && option <= max;
            if (!valid) {
                System.out.println("Number out of range. Try again");
            }
        }while(!valid);
        return option;
    }

    public static int secondaryMenu() {
        boolean valid;
        int option;
        int min = 0;
        int max = 4;
        System.out.println("************************");
        System.out.println("*********QUERYS*********");
        System.out.println("************************");
        System.out.println("\n");
        do {
            System.out.println("1. Group");
            System.out.println("2. Age");
            System.out.println("3. NIA");
            System.out.println("4. Surname");
            System.out.println("-------------------------");
            System.out.println("0. Exit");
            System.out.println("Choose an option: ");
            option = Integer.parseInt(scanner.nextLine());
            valid = option >= min && option <= max;
            if (!valid) {
                System.out.println("Number out of range. Try again");
            }
        }while(!valid);
        return option;
    }
}
