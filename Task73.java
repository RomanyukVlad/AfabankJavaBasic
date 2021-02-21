package com.alfabank.work72;

import java.util.Arrays;
import java.util.Scanner;

public class Task72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность мартрицы :");
        Integer size = sc.nextInt();
        printMatrix(createMatrix(size));
    }

    public static int[][] createMatrix(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                arr[i][j] = (i + 1) + (size * j);
            }
        }
        return arr;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Созданная матрица > " + Arrays.deepToString(matrix));
    }
}
