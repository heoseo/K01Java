package ex04constrolstatement;

public class Qu_04_06 {

	public static void main(String[] args) {

		// i번째 줄에서 i번 반복.
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		
		
		int i = 1;
		
		while(i <= 5) {
			int j = 1;
			// j는 i의 개수만큼 출력한다.
			while(j <= i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();	// 한 줄 출력 후 줄바꿈.
			i++;
		}
		
	}

}
