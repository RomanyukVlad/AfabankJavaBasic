package com.alfabank.work75;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.Scanner;

public class Task75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку цыфр :");
        String str = sc.nextLine();
        int[] count = new int[10];
        System.out.println("Массив -> " + Arrays.toString(countOfSequenceNumbers(str)));
    }

    public static int[] countOfSequenceNumbers(String numbers) {
        int[] counts = new int[10];
        int count;
        for (int i = 0; i < 10; i++){
            count = 0;
            for (int j = 0; j < numbers.length(); j++){
                if (i == (numbers.charAt(j) - 48)){
                    count = count + 1;
                }
            }
            counts[i] = count;
        }
        return  counts;
    }
}
