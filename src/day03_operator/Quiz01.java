package day03_operator;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		System.out.println("�� �Է�: ");
		num1 = scan.nextInt();
		String s;
		s = (num1%2 == 0)? "¦��" : "Ȧ��";
		System.out.println(num1+"="+s);
		s = (num1%3 == 0)? "3�ǹ��" : "3�ǹ�� �ƴ�";
		System.out.println(num1+"="+s);
		System.out.println("�� �� �Է�: ");
		num1= scan.nextInt();
		num2= scan.nextInt();
		s = (num1>num2)?"num1�� num2���� ũ��":"num2�� num1����ũ��";
		System.out.println("num1: "+num1+", num2: "+num2);
		System.out.println(s);

	}

}
