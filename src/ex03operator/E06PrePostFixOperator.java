package ex03operator;

public class E06PrePostFixOperator {
	
/*
			* 증감연산자
			  : 변수를 +1 혹은 -1 한 것과 같은 결과를 반환한다.
			 	주로 반복문에서 사용한다.
			 
			 - Prefix(전위 증가 혹은 감소) : 연산자가 변수 앞에 있음
			 	1) 변수의 값이 먼저 증가
			 	2) 증가한 값이 좌측을오 혹은 다른 코드에 반영됨
		 	 - Postfix(후위 증가 혹은 감소) : 연산자가 변수 뒤에 있음
		 	 	1) 변수의 값이 먼저 다른 코드에 반영됨
		 	 	2) 그 후 변ㄴ수의 값이 변경됨
 */
	

	public static void main(String[] args) {

		int num1 = 7;
		int num2, num3;		// 초기화하지 않으면 출력 불가.
		
		num2 = ++num1;	/*	
							8로 초기화.
						 	1. num1의 값이 먼저 1 증가
						 	2. 증가된 값이 num2에 대입됨.
						 */
		num3 = --num1;	/*	
						 	7로 초기화.
							1. num1의 값이 먼저 1 감소
							2. 감소된 값이 num3에 대입됨.
						 */
		System.out.println("전위증가/감소시");
		System.out.printf("num1 = %d, num2 = %d, num3 = %d %n%n"
				, num1, num2, num3);
		
//		========================================================================
		
		num1 = 7;
		
		num2 = num1++;	// num2 = 7, num1 = 8
		num3 = num1--;	// num3 = num1 = 8, num1 = 7.
		/*
		1. num1의 값이 num2, num3에 먼저 대입됨.
		2. num1의 값이 증가 혹은 감소함.
		최종겨로가 : 7, 7, 8
		 */
		System.out.println("전위증가/감소시");
		System.out.printf("num1 = %d, num2 = %d, num3 = %d %n%n"
				, num1, num2, num3);		
	}

}
