package com.adriaanbf04.tema07.UtillsAdri;

import java.util.Scanner;

public class Conversion {
    public static Scanner lector = new Scanner(System.in);
    /**
     * In this method we will convert a string to int
     * @param s (the string that you would pass to int)
     * @return the number that is passed
     */
    public static int string2int(String s) {
        int i = Integer.parseInt(s);
        return i;
    }
    /**
     * In this method we will convert an int to String
     * @param number the int that you would pass to String)
     * @return the string that is passed
     */
    public static String int2string(int number) {
        String s = String.valueOf(number);
        return s;
    }
    /**
     * In this method we will convert an char to String 
     * @param c the char that you would like to pass
     * @return the String that is passed
     */
    public static String char2string(char c) {
        String s = Character.toString(c);
        return s;
    }
    /**
     * In this method we will convert an String to int
     * @param c the char that you would like to pass to int
     * @return the int that is passed
     */
    public static int char2int(char c) {
        int i = Character.getNumericValue(c);
        return i;
    }
}
