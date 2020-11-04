package ex02variable;

public class E02SilsuType {

	public static void main(String[] args) {

		// 정수 < 실수 (long < float)
		// cpu : 정수는 int를 좋아하고 실수는 double을 좋아함.
		
/*
			* 실수 자료형
			 - 정수형보다는 실수형이 더 큰 자료형이다. 
			 (0~1 사이에 무수히 많은 실수가 존재하기 때문)
			 - 따라서 long과 float를 연산하면 결과는 float가 된다. 
 */
		long long1 = 100;
		float float1 = 200;
		float result1 = long1 + float1; // long + float => float
		System.out.println("long1 + float1 = " + result1);
		System.out.println(long1 + float1);
		
//		=========================================================
		
/*
			* float과 long의 연산결과를 long으로 받고싶다면..?
			 - 방법1) float를 long으로 형변환 후 연산
			 - 방법2) 계산결과 전체를 long형으로 명시적(강제) 형변환한다.
 */
//		long result33 = long1 + float1; // [=> 에러발생!]
		long result2 = long1 +(long)float1;
		System.out.println("형변현 후 연산 = " + result2);
		long result3 = (long)(long1 + float1);
		System.out.println("계산 후 형변환 = " + result3);
		
		float f3 = 100;
		
//		=========================================================
		
/*
			 - 실수형에서 기본형은 double이다.
			 - 컴파일러는 소수점이 있는 데이터를 무조건 double로 인식한다.
			 - 단, 소수점이 없는 데이터는 float에 대입할 수 있다.
			 - 소수점이 있는 데이터를 float에 대입하려면 접미사(f/F)를 사용한다. 
 */
		
//		=========================================================
		
// 			* 실수를 float형으로 선언하기!
		
// 		1) 형변환하고 선언하기
//		float f4 = 3.14;	// => [=> 에러발생!]
		float f4 = (float)3.14;
		System.out.println("f4 = " + f4);
		
// 		2) 접미사 f를 통해 float임을 표현해서 선언하기. (<- 권장사항)
		float f5 = 3.14F;
		System.out.println("f5 = " + f5);
		
		float f6 = f3 + f4;
		System.out.println("f6 = " + f6);
		
		double d1 = 3.14;
		double d2 = f6 + d1; // float + double => double
		System.out.println("d2 = " + d2);
		
	}

}
