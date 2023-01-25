package com.adriaanbf04.tema07.UtillsAdri;
import java.util.Random;
public class Table {
    public static Random random = new Random();
    /**
     * In this method, we generate a table
     * @param rows The table
     * @return res (The table which is generated)
     */
    public static int[][] generateRandomTable(int rows, int cols, int min, int max) {
        int [][] res = new int[rows][cols];
        for (int i = 0; i < res.length; i ++) {
            for (int j = 0; j < res[i].length; j ++) {
                res[i][j] = random.nextInt(max-min+1)+min;
            }
           
        }
        return res;
    }
    /**
     * In this method, we print the table
     * @param table The table
     */
    public static void printTable(int[][] table) {
        for (int i = 0; i < table.length; i ++) {
            for (int j = 0; j < table[i].length; j ++) {
                System.out.println(table[i][j]);
            }
        }
    }
    public static int[][] trasposeMatrix(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];
        for (int j = 0; j < matrix.length; j ++) {
            for (int i = 0; i < matrix[j].length; i ++){
                System.out.printf("%d\t", matrix[i][j]);
            }
            
        }
        return res;
    }
    public static int maxNumMatrix(int[][] matrix) {
        int max = Integer.MIN_VALUE; 
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix.length; j ++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public static int minNumMatrix(int[][] matrix) {
        int min = Integer.MAX_VALUE; 
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix.length; j ++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }
    public static int averageMatrix(int[][] matrix) {
        int sum = 0;
        int average;
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[i].length; j ++) {
                sum += matrix[i][j];
            }
        }
        average = sum / matrix.length;
        return average;
    }
    public static int elementMatrix(int[][] matrix, int row, int col) {
        return matrix[row][col];
    }
    public static int[][] addNumber(int[][] matrix, int number, int row, int col) {
        matrix[row][col] = number;
        return matrix;
    }
    public static String accesRow(int[][] matrix, int row) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[i].length; j ++) {
                if (i == row) {
                    sb.append(matrix[i][j]).append("\t");
                }
            }
        }
        return sb.toString();
    }
    public static String accesCol(int[][] matrix, int col) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[i].length; j ++) {
                if (i == col) {
                    sb.append(matrix[i][j]).append("\t");
                }
            }
        }
        return sb.toString();
    }
    public static int[][] multiplication(int[][] matrixOne, int[][] matrixTwo, int rowsOne, int rowsTwo, int colsOne, int colsTwo) {
        int[][] matrixRes = new int[rowsTwo][colsOne];
        int i,j,k,l;
        i = 0;
        j = 0; 
        k = 0;
        l = 0;
        int row = 0; 
        int col = 0;
        int res = 0;
        do {
            col = 0;
            l = 0;
            do {
                res = 0;
                j = 0; 
                k = 0;
                do {
        
                    int numOne = matrixOne[i][j];
                    int numTwo = matrixTwo[k][l];
        
                    res += numOne * numTwo;
        
                    j++;
                    k++;
        
                }while(j < colsTwo && k < rowsOne);
                matrixRes[row][col] = res;
                l++;
                col++;
            }while (col < colsTwo);
            row ++;
            i ++;
        }while(row < rowsTwo);
        
        return matrixRes;
    } 
}
