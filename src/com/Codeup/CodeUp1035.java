package com.Codeup;

import java.util.Scanner;

public class CodeUp1035 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	String n = sc.nextLine();
	
	int b = Integer.valueOf(n, 16);
	 
	System.out.println(Integer.toOctalString(b));

	}      
}

