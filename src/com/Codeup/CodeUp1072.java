package com.Codeup;

import java.util.Scanner;

public class CodeUp1072 {
  public static void main(String[] args) {

  	Scanner sc = new Scanner(System.in);
  	
  	int num = sc.nextInt();
  	int m[] = new int[num];
  	
  	for(int i = 0; i<num; i++) {
  		m[i] = sc.nextInt();
  	}
  	
  	for(int i = 0; i<num; i++) {
  		System.out.println(m[i]);
  	}
  	
  }
}      

