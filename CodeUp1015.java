package CodeUp;

import java.util.Scanner;

//실수(float) 1개를 입력받아 저장한 후,
//저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여
//소수점 이하 둘 째 자리까지 출력하시오.
public class CodeUp1015 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float x = sc.nextFloat();
		
		//%.2f : 소숫점 3번째 자리를 반올림하여 소수점 2번째 자리까지만 표현
		System.out.println(String.format("%.2f", x));
		
		
	}
	

}
