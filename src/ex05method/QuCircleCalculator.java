package ex05method;

public class QuCircleCalculator {

	public static void main(String[] args) {

		double rad = 5.5;
		
		// 원의 넓이를 구하는 함수는 반환값이 없어 함수 내에서 즉시 결과 출력됨.
		circleArea(rad);
		// 원의 둘레를 구하는 함수는 반환값이 있으므로 값을 반환받아 출력함.
		System.out.println("원의 둘레(" + rad + ") : " + circleRound(rad));
//		System.out.println("원의 넓이(" + rad + ") : " + circleArea(rad));
		
	}
	
	// [circleArea]
	
// 1) 반환값으로 메인함수에서 출력하는 방법
//	static double circleArea(double rad) {
//
//		double result;
//		
//		round = 3.14 * rad * rad;
//		
//		return result;
//	}
	
// 2) 반환값 없이 함수내에서 출력하는 방법
	static void circleArea(double rad) {
		double result = 3.14 * rad * rad;
		System.out.println("원의 넓이(" + rad + ") : " + result);
	}
	
	
	// [circleRound]
	static double circleRound(double rad) {
		
		double area;
		
		area = 3.14 * rad * 2;
		
		return area;
	}
}
