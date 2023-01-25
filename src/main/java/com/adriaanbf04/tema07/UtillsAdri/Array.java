package com.adriaanbf04.tema07.UtillsAdri;
import java.util.Objects;
import java.util.Random;

public class Array {
    public static Random random = new Random();
    /**
     * In this method we will request numbers (the number whatever we want) until the length that 
     * we request it before and return a new array
     * <p>
     * Example: 
     * <blockquote><pre>
     * int sizeArray = 10
     * int[] array = requestArray(sizeArray) --> CREATE AN ARRAY ON SIZE 10
     * </blockquote></pre>
     * @param arrayLength (The size of array)
     * @return A new array
     */
    public static int[] createArray(int arrayLength, int max) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i ++) {
            int num = IO.readNumber("Introduce a number: ", max);
            array[i] = num;
        }
        return array;
    }
    /**
     * In this method we will request numbers (the number whatever we want) 
     * until the length that we request it before and return a new array 
     */
    public static int[] createArray(int arrayLength, int min, int max) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i ++) {
            int num = IO.readNumber("Introduce a number: ", min, max);
            array[i] = num;
        }

        return array;
    }
    /**
     * In this method we will create random numbers (the number whatever we want) until the length that we request it before and return a new array
     * <p>
     * Example: 
     * <blockquote><pre>
     * int sizeArray = 10
     * int[] array = requestArray(sizeArray) --> CREATE AN ARRAY ON SIZE 10
     * </blockquote></pre>
     * @param arrayLength (The size of array)
     * @return A new array
     */
    public static int[] createRandomArray(int arrayLength, int min, int max) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i ++) {
            int num =  random.nextInt(max - min + 1) + min;
            array[i] = num;
        }
        return array;
    }
    /**
     * In this method we request the array created with the purpose to create an array with the condition 
     * that the numbers are from 0 until 50
     * @param vector The initial array
     * @return the new array in String
    */
    public static void showArray(int[] vector) {
        for (int num: vector) {
            System.out.println(num + " ");
        }
         
    }
    /**
     * In this method we request the array created with the purpose to create an array with the condition
     * that the numbers are from 0 until 50
     * @param vector The initial array
     * @return the new array in String
     */
    public static void showArray(Object[] vector) {
        for (Object foo: vector) {
            System.out.println(foo);
        }
    }
    /**
     * ACTIVITY 16 UNIT 6 (with int)
     * In this method we will request an array type int with the purpose to calculate the average of it 
     * @param array (initial array)
     * @return the average
    */
    public static double average(int[] array, int sizeArray) {
        double cont = 0;
        for (int mark: array) {
            cont += mark;
        }
        double finalRes = cont / sizeArray;
        return finalRes;
    }

    /**
     * ACTIVITY 16 UNIT 6 (with double)
     * In this method we will request an array type double with the purpose to calculate the average of it 
     * @param array (initial array)
     * @return the average
    */
    public static double average(double[] array, int sizeArray) {
        double cont = 0;
        for (double mark: array) {
            cont += mark;
        }
        double finalRes = cont / sizeArray;
        return finalRes;
    }
    /**
     * ACTIVITY 18 UNIT 6 A: 
     * <p>
     * In this method, we request two arrays and after, we sum each component of the array. And after, return the array in terminal
     * <p>
     * Example: 
     * <blockquote><pre>
     * addTwoArrays(arrayOne, arrayTwo); 
     * arrayOne = {1,2,3,4,5,6,7,8,9,10};
     * arrayTwo = {5,8,7,3,2,10,4,5,7,9};  
     * // outputs [6, 10, 10, 7, 7, 16, 11, 13, 16, 19]
     * </blockquote></pre>
     * @param arrayOne The first array
     * @param arrayTwo The second array
     * @return The result of the sum each component of the array
    */
    public static int[] addTwoArrays(int[] arrayOne, int[] arrayTwo) {
        if (arrayOne.length == arrayTwo.length) {
            return null;
        }
        int[] finalRes = new int[arrayOne.length];  
        for (int cont = 0; cont < arrayOne.length && cont < arrayTwo.length; cont ++) {
            int add = arrayOne[cont] + arrayTwo[cont];
            finalRes[cont] = add;
        }
        return finalRes;
    }
     /**
     * ACTIVITY 18 UNIT 6 B: 
     * <p>
     * In this method, we request two arrays and after, we div each component of the array. And after, return the array in terminal
     * <p>
     * Example: 
     * <blockquote><pre>
     * addTwoArrays(arrayOne, arrayTwo); 
     * arrayOne = {1,2,3,4,5,6,7,8,9,10};
     * arrayTwo = {5,8,7,3,2,10,4,5,7,9};  
     * // outputs [0.0, 0.0, 0.0, 1.0, 2.0, 0.0, 1.0, 1.0, 1.0, 1.0]
     * </blockquote></pre>
     * @param arrayOne The first array
     * @param arrayTwo The second array
     * @return The result of the div each component of the array
     */
    public static double[] divTwoArrays(int[] arrayOne, int[] arrayTwo) {
        if (arrayOne.length == arrayTwo.length) {
            return null;
        }
        double[] finalRes = new double[arrayOne.length];  
        for (int cont = 0; cont < arrayOne.length && cont < arrayTwo.length; cont ++) {
            double add = arrayOne[cont] / arrayTwo[cont];
            finalRes[cont] = add;
        }
        return finalRes;
    }
    /**
     * In this method we will request an array of ints with the purpose to show the multiple of the number
     * that the user puts before execute the method 
     * @param array The arrays of ints
     * @return The String with the numbers which are multiple of five
     */
    public static String multipleXNumber (int[] array, int number) {
        StringBuilder res = new StringBuilder(); 
        for (int num: array) {
            if (num % number == 0) {
                res.append(num).append("\n");
            }
        }
        return res.toString();
    }
    /**
     * In this method we will look up the number in the array
     * @param array The array created
     * @param numInArray The number which is will be searched
     * @return
     */
    public static int lookUpNumber(int[] array, int numInArray) {
        for (int num = 0; num < array.length; num ++) {
            if (array[num] == numInArray) {
                return num;
            }
        }
        return -1;
    }
}