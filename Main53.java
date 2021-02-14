package com.alfabank.work53;

public class Main {
    public static void main(String[] args) {
        String str1 = "An information system is designed to collect, ";
        str1 += "process, store and distribute information";
        System.out.println(str1);
        Integer pos1 = str1.indexOf(' ');
        Integer pos2 = str1.lastIndexOf(' ');
        String str2 = str1.substring( pos2 + 1 , str1.length());
        str2 += str1.substring( pos1 , pos2 + 1 ) + str1.substring( 0 , pos1 );
        System.out.println(str2);
    }
}
