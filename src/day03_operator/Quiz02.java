package day03_operator;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, num1,num2;
		//1��
		System.out.println("3�� ����� ��� ���: ");
		num = scan.nextInt();
		if(num%3==0) System.out.println(num+": 3�ǹ���Դϴ�");
		//2��
		System.out.println("���밪�� ���ص����: ");
		num = scan.nextInt();
		if(num<0) System.out.println(num+"���밪-> "+num*-1);
		else System.out.println(num+"���밪-> "+num);
		//3��
		System.out.println("�μ��� �Է¹޾� ū�� ���");
		System.out.println("ù �� �Է�: ");
		num1 = scan.nextInt();
		System.out.println("�ι�°�� �Է�: ");
		num2 = scan.nextInt();
		System.out.println("num1: "+num1+", num2: "+num2);
		if(num1>num2) System.out.println(num1+": ū���Դϴ�");
		if(num2>num1) System.out.println(num2+": ū���Դϴ�");
		else System.out.println(num1+"��"+num2+"�� �������Դϴ�");
		
		//System.out.println("������ �Է¹޾� ū�� ���");
		//System.out.println("ù �� �Է�: ");
		//num1 = scan.nextInt();
		//System.out.println("�ι�°�� �Է�: ");
		//num2 = scan.nextInt();
		//System.out.println("����°�� �Է�: ");
		//num3 = scan.nextInt();
		
		System.out.println("�μ��� �Է¹޾� ū���� ¦���� ���");
		System.out.println("ù �� �Է�: ");
		num1 = scan.nextInt();
		System.out.println("�ι�°�� �Է�: ");
		num2 = scan.nextInt();
		System.out.println("num1: "+num1+", num2: "+num2);
		if(num1>num2 && num1%2 == 0)
			System.out.println(num1+"�� ũ�鼭 ¦����");
		else if(num2>num1 && num2%2 ==0)
			System.out.println(num2+"�� ũ�鼭 ¦����");
		
		
		int sum;
		
		System.out.println("�μ��Է�-����¦���̸� 3�� ����� ���");
		System.out.println("ù �� �Է�: ");
		num1 = scan.nextInt();
		System.out.println("�ι�°�� �Է�: ");
		num2 = scan.nextInt();
		sum=num1+num2;
		if(sum %2==0 && sum%3==0)
			System.out.printf("%d�� %d�� ���� %d�� ¦����3�ǹ����",num1,num2,sum);

		
	}

}
