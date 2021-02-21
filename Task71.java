package com.alfabank.work71;

import java.util.Arrays;
import java.util.Scanner;

public class Task71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество членов массива :");
        Integer size = sc.nextInt();
        System.out.println("Массив -> " + Arrays.toString(createArray(size)));
    }

    public static int[] createArray(Integer size) {
        int[] arr = new int[size];
        int start = 2;
        for (int i = 0; i < size; i++){
            arr[i] = start + i * 2;
        }
        return arr;
    }
}
