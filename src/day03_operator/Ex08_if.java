package day03_operator;

import java.util.Scanner;

public class Ex08_if {

	public static void main(String[] args) {
		/*
		 ��� : ���α׷��� �帧�� �����Ѵ�
		 if(���ǽ�){
		 	���ǽ��� ���ΰ�� �߰�ȣ�� ������ ����ȴ�
		 	�߰�ȣ ���� ������ if���� ���� ������̴�.
		 }
		 */
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("1.�������");
		System.out.println("2.��������");
		System.out.println("3.����");
		System.out.println(">>> : ");
		num = scan.nextInt();
		if(num==1) {
			System.out.println("���� ���� ����");
			System.out.println("���� ���� ����");
			System.out.println("���� ���� ����");
		}
		if(num==2) {
			System.out.println("����� ���� ����");
		}
		if(num==3) {
			System.out.println("������ ���� �մϴ�");
		}
		
	}

}
