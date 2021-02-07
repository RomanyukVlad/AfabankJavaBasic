package com.alfabank.work3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        System.out.print("Введите сумму депозита:");
        Double deposit = d.nextDouble();
        System.out.print("Введите количество месяцев:");
        Integer month = m.nextInt();
        System.out.println("Вы получите прибыль - " + (Double) (deposit * month * (0.12 / 12)) );
    }
}
