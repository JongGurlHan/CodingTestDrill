package com.Codeup;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

//      String ymd = sc.next();
//      String[]b = ymd.split("[.]");
//
//      int y = Integer.parseInt(b[0]);
//      int m = Integer.parseInt(b[1]);
//      int d = Integer.parseInt(b[2]);F
//
//      System.out.printf("%02d-%02d-%d", d,m,y);

        String a = sc.next();
        a = a.replace(".", "-");
        String[]b = a.split("-");
        System.out.println(b[2] +"-"+b[1]+"-"+b[0]);

    }
}


