package com.Codeup;

import java.util.Scanner;

public class CodeUp1080 {
  public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);
	  	  
//	  int input = sc.nextInt();
//	  int sum = 0;
//	  
//	  for(int i =0; ; i++) {
//		sum +=i;
//		
//		if(sum >= input) {
//			System.out.println(i);
//			break;
//		}		  
//		  
//	  }	  
	  
	  int input = sc.nextInt();
	  int cnt = 0;
	  int sum = 0;
	  
	 while(true) {
		 cnt++;
		 sum+=cnt;
		 
		 if(sum >= input) {
			 System.out.println(cnt);
			 break;
		 }
		 
	 }
	  
	  
  }
}