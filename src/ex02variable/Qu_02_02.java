package ex02variable;

public class Qu_02_02 {

	public static void main(String[] args) {

		int kor = 99;
		int eng = 80;
		int math = 96;
		
		double avg = (double)(kor + eng + math) / 3;		// 실수형
		double avg2 = (kor + eng + math) / 3.0;

		System.out.println("평균점수(실수형) = " + avg);
		System.out.println("평균점수(실수형) = " + avg2);
		System.out.println("평균점수(정수형) = " + (int)avg);	
		
	}

}
