package com.adriaanbf04.tema07.UtillsAdri;
public class DataSort {
    /**
     * En este método se realizará la búsqueda del valor mínimo del array
     * @param array El array inical 
     * @return El valor mínimo del array pasado
    */
    public static int minNum(int[] array) {
        int i = 0; 
        for (int num: array) {
            if (num < i) {
                i = num;
            }
        }
        return i;
    }
    /**
     * En este método, se realizará la búsqueda del valor máximo del array
     * @param array El array inicial 
     * @return El valor máximo del array pasado
    */
    public static int maxNum(int[] array) {
        int i = 0;
        for(int num: array) {
            if (num > i) {
                i = num;
            }
        }
        return i;
    }

    public static void change(int[] array, int indiceOrigen, int indiceDestino) {
        int auxiliar = array[indiceOrigen];
        array[indiceOrigen] = array[indiceDestino];
        array[indiceDestino] = auxiliar; 
    }

    public static void ordenarArraySeleccion(int[] array) {
        int min; 
        int posMin;
        for (int i = 0; i < array.length-1; i ++) {
            min = array[i];
            posMin = i;
            for (int j = i + 1; j < array.length; j ++) {
                if (array[j] < min) {
                    min = array[j];
                    if (posMin != min)
                        posMin = j;
                }
            }
            change(array, min, posMin);
        }
    }

    public static void bubbleShot(int[] array) {
        boolean changes = true;
        while (changes) {
            changes = false;
            for (int i = 0; i < array.length-1; i ++) {
                if (array[i] > array[i+1]) {
                    change(array, i, i + 1);
                    changes = true;
                }
            }
        } 
    }
}
