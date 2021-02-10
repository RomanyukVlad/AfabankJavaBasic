package com.alfabank.work3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ââåäèòå ÷èñëî:");
        Integer number = sc.nextInt();
        switch (number){
            case 1: System.out.print("îäèí");
                break;
            case 2: System.out.print("äâà");
                break;
            case 3: System.out.print("òðè");
                break;
            case 4: System.out.print("÷åòûðå");
                break;
            case 5: System.out.print("ïÿòü");
                break;
            case 6: System.out.print("øåñòü");
                break;
            case 7: System.out.print("ñåìü");
                break;
            case 8: System.out.print("âîñåìü");
                break;
            case 9: System.out.print("äåâÿòü");
                break;
            default: System.out.print("äðóãîå");
        }

    }
}