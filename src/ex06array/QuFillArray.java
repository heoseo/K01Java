package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		int[] num = {2, 4, 5, 3, 2, 9, 7, 8, 5, 1};
		
		int[] num = new int[10];
		int[] arr = new int[num.length];
		
		
		int indexStart = 0, indexEnd = arr.length-1;// 홀수 시작 인덱스 : 0, 짝수 시작 인덱스 : 9
		for(int i = 0; i < num.length; i++) {
			System.out.print(i+1 + "번째 정수를 입력하세요 : ");
			num[i] = sc.nextInt();
			
			if(num[i] % 2 == 1) {	// 홀수면 인덱스++
//				System.out.println("i = " + i + ", start = " + start);
//				arr[indexStart] = num[i];
//				indexStart++;
				arr[indexStart++] = num[i];
			}
			else if(num[i] % 2 == 0) {// 짝수면 인덱스--
//				System.out.println("i = " + i + ", end = " + end);
//				arr[indexEnd] = num[i];
//				indexEnd--;
				arr[indexEnd--] = num[i];
			}
				
		}
		
		System.out.println("순서대로 입력된 결과");
		for(int i = 0; i < num.length; i++)
			System.out.print(num[i] + " ");
		System.out.println("\n홀수/짝수 구분 입력 결과");
		for(int i = 0; i < num.length; i++)
			System.out.print(arr[i] + " ");
		
		
	}

}
