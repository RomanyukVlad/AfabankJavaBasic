package com.alfabank.work74;

import java.util.Arrays;
import java.util.Scanner;

public class Task74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность мартрицы :");
        Integer size = sc.nextInt();
        int[][] arr = new int[size][size];
        arr = createMatrix(size);
        printMatrix(arr);
        transpositionMatrix(arr);
    }
    public static int[][] createMatrix(int size) {
        int[][] arr1 = new int[size][size];
        double random;
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                random = Math.random() * 100;
                arr1[i][j] = (int) random ;
            }
        }
        return arr1;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Созданная матрица > " + Arrays.deepToString(matrix));
    }

    public static void transpositionMatrix(int[][] matrix) {
        int[][] arrNew = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                arrNew[i][j] = matrix[j][i] ;
            }
        }
        System.out.println("Транспонированная матрица > " + Arrays.deepToString(arrNew));
    }

}
