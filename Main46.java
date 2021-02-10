package com.alfabank.work3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer sqv = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число :");
        Integer num = sc.nextInt();
        while (num >= 10){
            Integer rest = num % 10;
            sqv = sqv + (rest * rest);
            num = num / 10;
        }
        sqv = sqv + (num * num);
        System.out.println("Квадрат :" + sqv);
    }
}