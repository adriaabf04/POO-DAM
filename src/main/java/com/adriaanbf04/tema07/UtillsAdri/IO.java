package com.adriaanbf04.tema07.UtillsAdri;

import java.util.Scanner;

import com.adriaanbf04.tema07.UtillsAdri.IO;

import java.util.Random;

public class IO {
    public static Scanner lector = new Scanner(System.in);
    public static StringBuilder sb = new StringBuilder();
    public static Random random = new Random();
    /**
     * In this method we will request a message, which it outputs in screen 
     * This method return the final text
     * @param message (The message that would show)
     * @param minLengthStr (min length of the string)
     * @param maxLengthStr (max length of the string)
     * @return finalText (an String that the user introduces and is kept in a variable)
     */
    public static String readMessage(String message, int minLengthStr, int maxLengthStr) {
        boolean valid;
        String finalText = "";
        do {
            System.out.println(message);
            finalText = lector.nextLine();
            valid = finalText.length() > minLengthStr && finalText.length() < maxLengthStr;
            if (!valid) {
                System.out.printf("The string have to have got %d to %d letters", minLengthStr, maxLengthStr);
            }
        } while (!valid);
        return finalText;
    }
    /**
     * In this method we will request a message, which it outputs in screen 
     * This method return the final text
     * @param message (The message that would show)
     * @param minLengthStr (min length of the string)
     * @param maxLengthStr (max length of the string)
     * @return finalText (an String that the user introduces and is kept in a variable)
     */
    public static String readMessage(String message, int minLengthStr) {
        boolean valid;
        String finalText = "";
        do {
            System.out.println(message);
            finalText = lector.nextLine();
            valid = finalText.length() > minLengthStr;
            if (!valid) {
                System.out.printf("The string have to have got %d letters", minLengthStr);
            }
        } while (!valid);
        return finalText;
    }
    /**
     * In this method, we will request a message  which it outputs in screen
     * This method return the final text
     * @param message
     * @param min (The minium of the number that the users introduces)
     * @param max (The max of the number that the users introduces)
     * @return finalNumber (The number that the user introduces, an int)
     */
    public static int readNumber(String message, int min, int max) {
        boolean valid;
        int finalNumber;
        do {
            System.out.println(message);
            finalNumber = lector.nextInt();
            lector.nextLine();
            valid = finalNumber >= min && finalNumber <= max;
            if (!valid) {
                System.out.printf("The char have to have got a minium of %d and a max of %d numbers", min, max);
            }
        } while(!valid);
        return finalNumber;
    }
    /**
     * In this method, we will request a message without a max of nums which it outputs in screen
     * This method return the final text
     * @param message
     * @param min (The minium of the number that the users introduces)
     * @return finalNumber (The number that the user introduces, an int)
     */
    public static int readNumber(String message, int min) {
        boolean valid;
        int finalNumber;
        do {
            System.out.println(message);
            finalNumber = lector.nextInt();
            lector.nextLine();
            valid = finalNumber >= min; 
            if (!valid) {
                System.out.printf("The char have to have got a minium of %d", min);
            }
        } while(!valid);
        return finalNumber;
    }
    /**
     * In this method, we will request a message  which it outputs in screen
     * This method return the final text
     * @param message
     * @param min
     * @param max
     * @return finalNumber (The number that the user introduces, a double)
     */
    public static double readDoubleNumber(String message, int min, int max) {
        boolean valid;
        double finalNumber;
        do {
            System.out.println(message);
            finalNumber = lector.nextDouble();
            lector.nextLine();
            valid = finalNumber >= min && finalNumber <= max;
            if (!valid) {
                System.out.printf("The double have to have got a minum of %d and a max of %d numbers", min, max);
            }
        } while(!valid);
        return finalNumber;
    }
    /**
     * In this method, we will request a message  which it outputs in screen
     * This method return the final text
     * @param message
     * @param min
     * @return finalNumber (The number that the user introduces, a double)
     */
    public static double readDoubleNumber(String message, int min) {
        boolean valid;
        double finalNumber;
        do {
            System.out.println(message);
            finalNumber = lector.nextDouble();
            lector.nextLine();
            valid = finalNumber >= min;
            if (!valid) {
                System.out.printf("The double have to have got a minum of numbers", min);
            }
        } while(!valid);
        return finalNumber;
    }
    /**
     * In this method, we will request a message  which it outputs in screen
     * This method return the final text
     * @param message
     * @param min
     * @param max
     * @return finalNumber (The number that the user introduces, a float)
     */
    public static double readFloatNumber(String message, int min, int max) {
        boolean valid;
        float finalNumber;
        do {
            System.out.println(message);
            finalNumber = lector.nextFloat();
            lector.nextLine();
            valid = finalNumber >= min;
            if (!valid) {
                System.out.printf("The float have to have got a minum of %d and a max of %d numbers", min, max);
            }
        } while(!valid);
        return finalNumber;
    }
    /**
     * In this method, we will request a message  which it outputs in screen
     * This method return the final text
     * @param message
     * @param min
     * @param max
     * @return character (a char that the user introduces)
     */
    public static void readChar(String message, int min, int max) {
        boolean valid;
        char character;
        do {
            System.out.println(message);
            character = lector.next().charAt(0);
            valid = character >= min && character <= max;
            if (!valid) {
                System.out.printf("The char have to have got a minum of %d and a max of %d letters", min, max);
            }
        } while(!valid);
    }
    
}