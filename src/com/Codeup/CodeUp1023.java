package com.Codeup;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String n  = sc.next();

        String[] a = n.split("[.]");

        System.out.println(a[0]);
        System.out.println(a[1]);
    }

}
