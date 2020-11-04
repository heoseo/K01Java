package ex07string;

public class E01StringBasic {

	public static void main(String[] args) {

		int num1 = 10, num2 = 20;
		String numResult = (num1 == num2) ? "데이터가 같다" : "데이터가 다르다";
		System.out.println("num1과 num2 비교 결과 => " + numResult);
		
		
// 		1. str1 vs str2 (new 사용)
		String str1 = new String("Hello JAVA");
		String str2 = new String("Hello JAVA");
		
// 		1) 참조주소 비교
		if(str1==str2) {
			System.out.println("str1과 str2는 참조주소 같음");
		}
		else {
			System.out.println("str1과 str2는 참조주소 다름");
		}
		
//		2) 내용 비교	
		
		/*
		 * equals()메소드
		 	: object 클래스로부터 상속받은 메소드로 실제 저장된 문자열을 비교하도록 만들어지 ㄴ메소드이다.
		 	즉 아래는 개게에 실제 저장된 무낮열에 대한 비교가 이루어진다.
		 */
		if(str1.equals(str2)) {
			System.out.println("str1과 str2은  동일하다");
		}
		else {
			System.out.println("str1과 str2은 다르다");
		}
		
		
		
		
		
// 		2. str3 vs str4 (new 사용 X)
		/*
		 	String 클래스의 객체생성 방법2 : "(더블퀘테잉션) 사용
		 		이 경우 내용이 동일하다면 같은 주소 사용.
		 */
		
		
		
		String str3 = "KOSMO";
		String str4 = "KOSMO";
//		1) 내용 비교
		System.out.println("equals()메소드로 str3과 str4 비교 => " + str3.equals(str4));
//		2) 주소 비교
		/* 자바에서 문자열객체를 생성할 떄 new를 사용하지 않고 "를 사용하면
		 * 동일한 문자열인 경우 메모리르 하나만 사용하여 공유하게 된다. 
		 */
		if(str3==str4) {
			System.out.println("str3과 str4는 주소가 같다");
		}
		else {
			System.out.println("str3과 str4는 주소가 다르다");
		}
		
	}

}
