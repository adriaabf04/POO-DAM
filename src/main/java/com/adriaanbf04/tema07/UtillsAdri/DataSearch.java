package com.adriaanbf04.tema07.UtillsAdri;
public class DataSearch {
    public static int binarySearch(int[] array, int elemento) {
        int numeroCentral;
        int ini = 0; 
        int fin = array.length-1;

        do {
            numeroCentral = (ini + fin) / 2;
            int num = array[numeroCentral];
            if (num == elemento) {
                return numeroCentral;

            } else if (num > elemento) {
                ini = numeroCentral + 1;
            } else {
                fin = numeroCentral -1;
            }
        } while (ini <= fin);
        return -1;
    }
}
