package com.Codeup;

import java.util.Scanner;

//입력된 정수의 부호를 바꿔 출력해보자.
//단, -2147483647 ~ +2147483647 범위의 정수가 입력된다.
public class CodeUp1040 {
  public static void main(String[] args) {

  	Scanner sc = new Scanner(System.in);
  	
  	int a  = sc.nextInt();    	
  	
  	System.out.println(a*(-1));
	}      
}
