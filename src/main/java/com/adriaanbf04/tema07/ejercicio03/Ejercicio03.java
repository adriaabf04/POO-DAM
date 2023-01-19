package com.adriaanbf04.tema07.ejercicio03;
import java.util.Scanner;
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
                    //Añadir un alumno al centro (Centro.addClasmate())
                    break;
                case 2:
                    //Centro.deleteClassmate(NIA del alumno);
                    break;
                case 3:
                    //Añadir un alumno al centro(int opcionDos = menuDos())
                    do {
                        optionTwo = secondaryMenu();
                        switch (optionTwo) {
                            case 1:
                                //Todos los que pertenezcan a ese grupo
                                break;
                            case 2:
                                //Todos los que tengan esa edad
                                break;
                            case 3:
                                //Cuando ponga el NIA, datos del alumno
                                break;
                            case 4:
                                //Los que empiezan por la misma letra de apellido
                        }
                    }while(optionTwo!= 0);
                    break;
            }
        }while(opcion!= 0);
    }

    public static int principalMenu() {
        boolean valid;
        int option;
        int min = 0;
        int max = 2;
        System.out.println("************************");
        System.out.println("*******CLASSMATES*******");
        System.out.println("************************");
        System.out.println("\n");
        do {
            System.out.println("1. New classmate");
            System.out.println("2. Baja classmate");
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
