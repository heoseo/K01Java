package ex04constrolstatement;

public class E03While {
	
/*
		* while 문
		 : 반복의 횟수가 정해져 있지 않을 때 주로 사용하는 반복문.
		 반복의 횟수가 명확할때는 주로 for문을 사용한다.
		 형식]
		 	반복을 윙한 변수의 초기값 선언;
		 	while(반복의 조건){
		 		실행문;
		 		반복을 위한 변수의 증감식; <= 반복문 탙출을 위한 ++, --와 같은 연산이 필요.
		 	★★★★★★★★★★★★★★★★★★★★★★ // <- 이걸 먼저 써줘야 까먹지 않음. 무한루프되지않음.
	 		}
	 		반복의 조건이 false일 때 while문을 탈출한다.
 */

	public static void main(String[] args) {

/*
			[시나리오 1]
			1~10까지의 합을 구하는 프로그램을 while문으로 작성하시오.
 */
		// 누적합을 저장하기 위한 변수 선언. 증가하는 i를 누적해서 더
		System.out.println("[ 시나리오1 ]");
		int sum = 0;
		
		// 반복을 위한 변수선언 및 초기화
		int i = 1;
		while(i <= 10) { // 반복의 조건 설정. i가 11이상이면 탈출.
			// 증가되는 i를 num에 누적해서 더함(1+2+3...)
			sum += i;
			// while문을 탈출하기 위한 조건을 위한 증가연산
			i++;
		}
		
		System.out.println("1~10까지의 합은 : " +  sum + "\n");	// 결과 : 55
		
//		======================================================================
		
		/*
		[시나리오 2] 구구단을 출력하는 프로그램을 작성하시오.
		단 while문을 이용하시오.
		
		 */
		System.out.println("[ 시나리오2 ]");
		int dan = 2;			// 단
		while(dan <= 9) {		// 단은 2~9까지 증가함
			int su = 1;			// 수(하나의 단을 출력한 후 단이 증가하면 수는 1로 초기화됨)
			while(su <= 9) {	// 수는 1~9까지 증가함.
				// 서식에 맞춰 출력할 때는 printf()문이 유리함.
				System.out.printf("%-2d * %-2d = %2d │ ", dan, su, (dan*su));
//				System.out.print(dan + " * " + su + " = " + (dan*su));
				System.out.print(" ");
				su++;			
			}
			System.out.println();
			dan++;				// 단 증가
			System.out.println("=================================================="
					+ "===============================================");
		}
		
		
		
		
		
		
		
/*
 		[시나리오 3] 
 		1부터 100까지의 정수중 3의 배수이거나 5의 배수인 수의 합을 구하는 프로그램을
 		while문을 이용해 작성하시오.
 */
		
		System.out.println("[ 시나리오3 ]");
		int num = 1;
		int total = 0;
		
		while(num <= 100) {
			if(num % 3 == 0 || num % 5 == 0)
				total += num;
			
			num++;
		}
		
		System.out.println(total);
		System.out.println();
		
		
		
		/*
		[시나리오 4]
		아래와 같은 모양을 출력하는 while문을 작성하시오
			출력 결과
				1 0 0 0
				0 1 0 0
				0 0 1 0
				0 0 0 1
		 */
		System.out.println("[ 시나리오4 ]");
		int m = 1;
		while(m <= 4) {
			int n = 1;
			while(n <= 4) {
				if(m == n)
					System.out.print("1 ");
				else
					System.out.print("0 ");
				n++;
			}
			System.out.println();
			m++;
		}
		
	}

}
