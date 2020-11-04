package ex04constrolstatement;

public class Qu_04_08 {

	public static void main(String[] args) {

		/*
			FLOOR-x+1
				: 변수 x가 증가함에 따라 점점 감소하는 y를 표현하기 위한 일반식 정의
		 */
		
		// 답
		
		// *를 출력한 층수를 표현하는 상수
		final int FlOOR = 5;
		
		// 세로(층) 반복
		for(int x = 1; x <= FlOOR; x++) {
			// 가로 반복
			for(int y = 1; y <= (FlOOR-x+1); y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("=============");
		
		// 내풀이
		// 1)
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; i + j <= 6; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("=============");
		
		// 2) 감소 연산자 사용
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
