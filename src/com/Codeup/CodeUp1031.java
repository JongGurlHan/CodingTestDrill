package com.Codeup;

import java.util.Scanner;

public class CodeUp1031 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
       
        String octalString = Integer.toOctalString(n);
        
        System.out.println(octalString);
        
      }      
  }
