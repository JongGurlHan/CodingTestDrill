package CodeUp;

import java.util.Scanner;


public class CodeUp1014 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		//charAt(index) : 문자열에서 인자로 주어진 값에 해당하는 문자를 리턴한다.
		char x = s.charAt(0);
		char y = s.charAt(2);
		
		System.out.println(y+ " " +x);
	}

}
