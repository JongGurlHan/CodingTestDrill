package com.Codeup;

import java.util.Scanner;

public class CodeUp1033 {
    public static void main(String[] args) {


       Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
       
        String HexString = Integer.toHexString(n).toUpperCase();
        
        System.out.println(HexString);
        
      }      
  }
