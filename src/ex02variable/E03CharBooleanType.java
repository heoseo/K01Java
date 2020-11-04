package ex02variable;

public class E03CharBooleanType {

	public static void main(String[] args) {

		// 문자는 char형 변수에 저장. (실제 유니코드 값으로 저장)
		
		
/*
			* char형 
			 - 하나의 문자를 저장할 수 있는 자료형으로 값을 저장할 때
			   '(Single quotation)으로 감싸서 표현한다.
			 - 만약 "(Double quotation)으로 감싸면 문자열로 인식하므로
			   String형으로 선언해야 한다.
 */
		
		char ch1 = '가';
//		char ch1 = "가";			// [에러발생!]
//		char chStr = '가나다라'; 	// [에러발생!] -> 문자열이므로 char로 선언 불가.
		String chStr = "가나다라";
		System.out.println("ch1 = " + ch1);
		System.out.println("chStr = " + chStr);
		
//		==================================================================
		
/*
			* 아스키코드 
			 - 1byte로 표현할 수 있는 문자(영문, 숫자)를 십진수 코드로 정의한 것
			   Ex) A => 65     a => 97
			   
			* 유니코드
			 - 1byte로 표현이 안되는 문자(한글, 한자 등)는 2byte가 필요하고
			      이를 16진수로 정의한 값을 말한다.
 */
		
		char ch2 = 'A';
		int num1 = 2;
		int num2 = ch2 + num1;
		System.out.println("num2 = " + num2);
		
		char ch3 = (char)(ch2 + num1);
		System.out.println("ch3(문자출력) = > " + ch3);
		System.out.println("ch3(아스키코드 출력) => " + (int)ch3);
		
		char ch4 = '1';			// 숫자가 아니라 문자 1이므로 49로 저장된다.
		char ch4_1 = '1' + 1;	// 49 + 1 = 50 ===> '2'
		System.out.println("ch4 = " + ch4 + " ch4_1 = " + ch4_1
							+ " (int)ch4_1 = " + (int)ch4_1);
		
//		==================================================================
		
/*
			* boolean형
			 - true 혹은 false 두 가지의 값만 가질 수 있는 자료형으로,
			      산술연산(+, - 등) 이나 비교연산(<, >= 등) 에는 사용할 수 없다.
			 - 단, 논리연산은 가능하다.
 */
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1 = " + bn1 + ", bn2 = " + bn2);
		
//		==================================================================

/*
 			* 논리연산자
 			 - && : 논리 AND 연산으로 양쪽 모두 참일 때 참을 반환한다.
 			 		나머지는 거짓을 반환한다.
	 		 - || : 논리 OR연산으로 둘 중 하나만 참이면 참을 반환한다.
	 		 		둘 다 거짓일 때만 거짓을 반환한다.
 */
		boolean bn3 = bn1 && bn2;	// AND
		System.out.println("bn1 && bn2 => " + bn3);		// false 반환
		bn3 = bn1 || bn2;			// OR
		System.out.println("bn1 || bn2 => " + bn3);		// true 반환
		
		bn3 = '가' > 30000; // 가 => 유니코드 44032 이므로 true.
		System.out.println("'가' > 30000 => " + bn3);
		
	}

}
