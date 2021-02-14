package com.alfabank.work55;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String line1 = sc.nextLine();
        Integer pos1 = 0;
        System.out.print("Repeating symbols: ");
        while (pos1 < line1.length()){
            if ((line1.indexOf(line1.charAt(pos1), pos1 + 1) > 0) & (line1.lastIndexOf(line1.charAt(pos1), pos1 - 1) < 0)){
                System.out.print(line1.charAt(pos1) + " ");
            }
            pos1++;
        }
        System.out.println();
        pos1 = 0;
        System.out.print("Don't repeating symbols: ");
        while (pos1 < line1.length()){
            if ((line1.indexOf(line1.charAt(pos1), pos1 + 1) < 0) & (line1.lastIndexOf(line1.charAt(pos1), pos1 - 1) < 0)){
                System.out.print(line1.charAt(pos1) + " ");
            }
            pos1++;
        }
        System.out.println();
    }
}
