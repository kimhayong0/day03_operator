package day03_operator;

import java.util.Scanner;

public class Ex09_if {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("수 입력: ");
		num = scan.nextInt();
		if(num>10) 
			System.out.println("종속 문장 실행");
			System.out.println("1종속 문장 실행");
			System.out.println("2종속 문장 실행");
			System.out.println("3종속 문장 실행");
		
		System.out.println("다음문장들 실행");

	}

}
