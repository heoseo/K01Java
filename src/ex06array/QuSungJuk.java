package ex06array;

import java.util.Scanner;

public class QuSungJuk {
	public static final int SUBJECTS = 3;
	
	public static void main(String[] args) {

	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요 : ");
		int numOfStudent = sc.nextInt();
		String[] titles = {"국어", "영어", "수학"};
		
		double[][] grade = new double[numOfStudent][5];
		
		
		for(int i = 0; i < numOfStudent; i++) {
			System.out.printf("[%d번째 학생의 점수 입력]\n", i+1);
			for(int j = 0; j < SUBJECTS; j++) {
				System.out.println(titles[j] + " 점수 입력 : ");
				grade[i][j] = sc.nextInt();
				grade[i][SUBJECTS] += grade[i][j];
			}
			grade[i][SUBJECTS+1] = (grade[i][SUBJECTS]/SUBJECTS);
		}
		
		System.out.println("==========================");
		System.out.println(" NO KOR ENG MAT TOT AVG");
		System.out.println("==========================");
		for(int i = 0; i < numOfStudent; i++) {
			System.out.printf("%2d ", i+1);
			int j;
			for(j = 0; j <= SUBJECTS; j++) {
				System.out.printf("%3.0f ", grade[i][j]);
			}
			System.out.printf("%.2f\n", grade[i][j]);
		}
		System.out.println("==========================");
		
	}

}
