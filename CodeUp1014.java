package CodeUp;

import java.util.Scanner;


public class CodeUp1014 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		//charAt(index) : ���ڿ����� ���ڷ� �־��� ���� �ش��ϴ� ���ڸ� �����Ѵ�.
		char x = s.charAt(0);
		char y = s.charAt(2);
		
		System.out.println(y+ " " +x);
	}

}
