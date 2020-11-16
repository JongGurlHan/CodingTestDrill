package com.Codeup;

import java.util.Scanner;

public class CodeUp1078 {
  public static void main(String[] args) {

  	Scanner sc = new Scanner(System.in);
  		
  	int num = sc.nextInt();
  	
  	for(int i = 1; i<= num; i++) {
  		if(i%2 == 0) {
  			i+= i;
  		}
  		System.out.println(i);
  	}
  		
  }
}      

