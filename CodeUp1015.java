package CodeUp;

import java.util.Scanner;

//�Ǽ�(float) 1���� �Է¹޾� ������ ��,
//����Ǿ� �ִ� ���� �Ҽ��� �� ° �ڸ����� �ݿø��Ͽ�
//�Ҽ��� ���� �� ° �ڸ����� ����Ͻÿ�.
public class CodeUp1015 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float x = sc.nextFloat();
		
		//%.2f : �Ҽ��� 3��° �ڸ��� �ݿø��Ͽ� �Ҽ��� 2��° �ڸ������� ǥ��
		System.out.println(String.format("%.2f", x));
		
		
	}
	

}
