package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1을 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2을 입력하세요 : ");
		int num2 = sc.nextInt();
		
		arithmetic(num1, num2);
	}
	
	static void arithmetic(int num1, int num2) {

		System.out.println("덧셈결과 -> " + (num1 + num2));
		if(num1>num2)
			System.out.println("뺄셈결과 -> " + (num1 - num2));
		else
			System.out.println("뺄셈결과 -> " + (num2 - num1));
		
		System.out.println("곱셈결과 -> " + (num1 * num2));
		System.out.println("나눗셈결과 -> " + (num1 / num2));
		System.out.println("나눗셈 나머지 -> " + (num1 % num2));
		
	}

}
