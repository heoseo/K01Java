package quiz;

import java.util.Scanner;

public class QuFibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 피포나치수열의 학목갯수를 입력하세요 : ");
		int num = sc.nextInt();
		
		fibonacciSeries(num);
		
	}
	
	public static void fibonacciSeries(int num) {
		
		int num1 = 0;
		int num2 = 1;
		
		
		System.out.print(num1 + " " + num2 + " ");

		if(num <= 2) {
			return;
		}
		
		for(int i = 3; i <= num; i++) {
			int tmp = num2;
			num2 = num1 + num2;
			num1 = tmp;
			System.out.print(num2 + " ");

			if(i%10 == 0)	// 10번째마다 줄바꾸기
				System.out.println();
		}
		
	}

}
