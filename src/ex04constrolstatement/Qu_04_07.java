package ex04constrolstatement;

public class Qu_04_07 {

	public static void main(String[] args) {

		int sum = 0;
		int max = 0; // 100까지의 수 중 가장 큰 배수(공배수 제외)
		
		for(int i = 1; i <= 100; i++) {
			if(i%3 == 0 || i%7 == 0)
				if(!(i%3 == 0 && i%7 == 0))
					max = i;
		}
		
		for(int i = 1; i <= 100; i++) {
			if(i%3 == 0 || i%7 == 0) {
				if(i==max) {			// 제일 마지막 숫자에서 + 안쓰고 합 표시하고 끝내기.
					sum+=i;
					System.out.print(i + " = " + sum);
				}
				else if(!(i%3 == 0 && i%7 == 0)) {
					System.out.print(i + " + ");
					sum += i;
				}
			}
		}
		
		//답 (끝에 +하나 없애는건 안돼있음.)
		
		System.out.println();
		sum=0;
		for(int i = 1; i <= 100; i++) {
			if(i%3==0||i%7==0) {
				if(i%(3*7)!=0) {
					sum+=i;
					System.out.print(i+" + ");
				}
			}
		}
		System.out.println(" = "+sum);
		
		
	}

}
