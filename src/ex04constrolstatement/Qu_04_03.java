package ex04constrolstatement;

import java.util.Scanner;

public class Qu_04_03 {

	public static void main(String[] args) {

		// switch, Scanner
	
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math;
		
		System.out.print("국어 : ");
		kor = scanner.nextInt();
		System.out.print("영어 : ");
		eng= scanner.nextInt();
		System.out.print("수학 : ");
		math = scanner.nextInt();
		
		int avg = (int)(kor+eng+math)/3;
		
		switch(avg/10) {
		case 10:case 9:
			System.out.printf("평균점수 : %d%n학점 : A", avg);
			break;
		case 8:
			System.out.printf("평균점수 : %d%n학점 : B", avg);
			break;
		case 7:
			System.out.printf("평균점수 : %d%n학점 : C", avg);
			break;
		case 6:
			System.out.printf("평균점수 : %d%n학점 : D", avg);
			break;
		default:
			System.out.printf("평균점수 : %d%n학점 : F", avg);
		}
		
	}

}
