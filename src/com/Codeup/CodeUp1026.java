package com.Codeup;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String[]b = a.split("[:]");

        int h = Integer.parseInt(b[0]);
        int m = Integer.parseInt(b[1]);
        int s = Integer.parseInt(b[2]);

        System.out.println(m);

    }
}


