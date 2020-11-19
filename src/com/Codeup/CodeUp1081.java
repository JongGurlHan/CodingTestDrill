package com.Codeup;

import java.util.Scanner;

public class CodeUp1081 {
  public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);
	  
	  int n = sc.nextInt();
	  int m = sc.nextInt();
	  
	  if(1 <= n && n <= 10 && 1 <= m && m <= 10) {
		  for(int i = 1; i<= n; i++) {
			  for(int j= 1; j<=m; j++) {
				  System.out.println(i +" "+ j);
			  }
		  }
		  
	  }
	  
	  
  }
}