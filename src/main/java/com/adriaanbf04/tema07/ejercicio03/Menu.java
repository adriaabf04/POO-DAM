
package com.adriaanbf04.tema07.ejercicio03;
import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new Scanner(System.in);
    public int Menu() {
        boolean valid;
        int option;
        int min = 0;
        int max = 2;
        System.out.println("**********************");
        System.out.println("***GESTIÓN ALUMNOS****");
        System.out.println("**********************");
        System.out.println("\n");
        do {
            System.out.println();
            System.out.println();
            System.out.println();
            option = Integer.parseInt(scanner.nextLine());
            valid = option >= min && option <= max;
            if (!valid) {
                System.out.println("Intente otro número");
            }
        }while(!valid);
        return option;
    }
}
