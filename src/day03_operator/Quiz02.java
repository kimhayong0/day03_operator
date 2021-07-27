package day03_operator;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, num1,num2;
		//1번
		System.out.println("3의 배수인 경우 출력: ");
		num = scan.nextInt();
		if(num%3==0) System.out.println(num+": 3의배수입니다");
		//2번
		System.out.println("절대값을 구해드려요: ");
		num = scan.nextInt();
		if(num<0) System.out.println(num+"절대값-> "+num*-1);
		else System.out.println(num+"절대값-> "+num);
		//3번
		System.out.println("두수를 입력받아 큰수 출력");
		System.out.println("첫 수 입력: ");
		num1 = scan.nextInt();
		System.out.println("두번째수 입력: ");
		num2 = scan.nextInt();
		System.out.println("num1: "+num1+", num2: "+num2);
		if(num1>num2) System.out.println(num1+": 큰수입니다");
		if(num2>num1) System.out.println(num2+": 큰수입니다");
		else System.out.println(num1+"과"+num2+"는 같은수입니다");
		
		//System.out.println("세수를 입력받아 큰수 출력");
		//System.out.println("첫 수 입력: ");
		//num1 = scan.nextInt();
		//System.out.println("두번째수 입력: ");
		//num2 = scan.nextInt();
		//System.out.println("세번째수 입력: ");
		//num3 = scan.nextInt();
		
		System.out.println("두수를 입력받아 큰수가 짝수면 출력");
		System.out.println("첫 수 입력: ");
		num1 = scan.nextInt();
		System.out.println("두번째수 입력: ");
		num2 = scan.nextInt();
		System.out.println("num1: "+num1+", num2: "+num2);
		if(num1>num2 && num1%2 == 0)
			System.out.println(num1+"이 크면서 짝수다");
		else if(num2>num1 && num2%2 ==0)
			System.out.println(num2+"이 크면서 짝수다");
		
		
		int sum;
		
		System.out.println("두수입력-합이짝수이며 3의 배수면 출력");
		System.out.println("첫 수 입력: ");
		num1 = scan.nextInt();
		System.out.println("두번째수 입력: ");
		num2 = scan.nextInt();
		sum=num1+num2;
		if(sum %2==0 && sum%3==0)
			System.out.printf("%d과 %d의 합인 %d는 짝수며3의배수다",num1,num2,sum);

		
	}

}
