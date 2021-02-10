package com.alfabank.work3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Integer x = 1;
        Integer y = 1;
        System.out.println("* | 1  2  3  4  5  6  7  8  9");
        System.out.println("-----------------------------");
        while (y <= 9){
            Integer x = 1;
            Integer sqv;
            System.out.print(y + " | ");
            while (x <= 9){
                sqv = x * y;
                if (sqv <= 9){
                    System.out.print(sqv + "  ");
                } else {
                    System.out.print(sqv + " ");
                }
                x++;
            }
            System.out.println("");
            y++;
        }
    }
}