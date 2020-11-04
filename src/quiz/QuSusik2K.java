package quiz;

import java.util.Scanner;

public class QuSusik2K {

	public static void main(String[] args) {

		System.out.print("정수n을 입력하세요(0이상의정수) : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = 0;
		
		
		while(num / 2 != 0) {
			num /= 2;
			k++;
		}
		System.out.println("공식을 만족하는 k값 : " + k);
		/*
		for(k=0; inc *2<=n; k++){
			inc = inc * 2;
		}
		 */
		
	}

}
