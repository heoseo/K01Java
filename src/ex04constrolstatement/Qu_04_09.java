package ex04constrolstatement;

public class Qu_04_09 {

	public static void main(String[] args) {

		// E05For.java [연습문제]와 비교.

/*
		// 단이 고정된 상태에서 수가 증가.
		for(int dan = 2; dan <= 9; dan++) {		// 단
			for(int su = 1; su <= 9; su++) {	// 수
				System.out.printf("%-2d * %-2d = %2d | ", dan, su, (dan*su));
			}
			System.out.println();
		}
*/	
		
		// 수가 고정된 상태에서 단이 증가.
		for(int su = 1; su <= 9; su++) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d * %d = %d\t", dan, su, dan * su);
			}
			System.out.println();
		}
		
	}

}
