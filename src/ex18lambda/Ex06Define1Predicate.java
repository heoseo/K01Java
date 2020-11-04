package ex18lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
JAVA 에서 제공하는 기본 함수형 인터페이스는 다음과 같은 종류가 있다.
큰 차이점이라면 매개변수의 유무, 리턴값의 유무 정도 이다.

Predicate	: 매개변수 O, 리턴값 O(boolean타입)
Consumer	: 매개변수 O, 리턴값 X
Supplier	: 매개변수 X, 리턴값 O
Function	: 매개변수 O, 리턴값 O
 */

public class Ex06Define1Predicate {

	/*
		Interface A{
			boolean test(Object obj);
		}
	 */
	public static void main(String[] args) {
		
		/*
		Predicate
			- 사전적의미 : ~에 근거를 두다
			- 매개변수와 boolean리턴값이 있는 test() 계열의 추상메소드를 가지고 있다.
			- 파라미터를 조사해 true or false값을 리턴한다.
			
		interface Predicate<E> {
			boolean test(T t);
		}
		 */
		Human p1 = new Human("케이윌", "남", 80);
		Human p2 = new Human("에일리", "여", 77);
		
		
		// 전달된 객체의 성별이 "남 : "인지 판단하여 boolean값을 반환하는 람다식을 정의함.
//						test() 메소드를 오버라이딩하여 정의하였으므로 아래처럼 호출가능
		Predicate<Human> pre = (Human h) ->{
			return h.getGender().equals("남");
		};
		System.out.println("p.test(p1) => " + pre.test(p1));
		System.out.println("p.test(p2) => " + pre.test(p2));
		
		System.out.println("================================");
		
		
		
		
		
		
		Human p3 = new Human("임재범", "남", 97);
		Human p4 = new Human("아이유", "여", 99);
		
		List<Human> list1 = Arrays.asList(p1, p2, p3, p4);

		
		// 람다식 자체를 매개변수로 전달		
		/*
		(Human a) -> {
			return a.getGender().equals("남")
		}
		이와 같은 람다식을 아래와 같이 기술할 수 있다.
		 - 매개변수의 타입을 유추할 수 있어 생략하고
		 - 실행문장이 하나라서 {}를 생략하였다.
		 double maleAvg = avg(a->a.getGender().equals("남"), list1);
		 */
		// 매개변수 객체가 남자일 때 true를 반환하는 람다식을 전달함.
		double maleAvg = avg(a->a.getGender().equals("남"), list1);
		System.out.println("남자 평균 : " + maleAvg);
		// 매개변수 객체가 여자일 때 true를 반환하는 람다식을 전달함.
		double femaleAvg = avg((Human b) -> b.getGender().equals("여"), list1);
		System.out.println("여자 평균 : " + femaleAvg);
		
		System.out.println("================================");
		
		
		
		
		List<Integer> list = Arrays.asList(1, 3, 5, 6, 7, 11, 12, 14);
		
		// 주어진 인자가 짝수인지 홀수인지 판단하여 true를 반환하는 람다식을 매개변수로 전달한다.
		int total;
		total = sum((Integer n) -> n%2 == 0, list);
		System.out.println("짝수 합 : " + total);
		
		total = sum((Integer n) -> n%2 != 0, list);
		System.out.println("홀수 합 : " + total);
	
		/*
		(Integer n) -> n%2 == 0은 다음과 같다.
		
		Predicate<Human> pre = (Integer n) ->{
			return n%2 != 0;
		};
		*/
		
	} // end of main
	
	// 매개변수로 성별을 판단하는 람다식과 List컬렉션을 전달받아서 평균값을 반환하는 메소드
	public static double avg(Predicate<Human> ph, List<Human> li) {
		int pCount = 0;
		int tCount = 0;
		for(Human h : li) {	// li 컬렉션의 크기만큼 반복
			/*
			 * 
			 */
			// 첫 번째 호출에서는 남자일 때 true를 반환하므로 남자의 pCount, tCount 증가.
			if(ph.test(h) == true) {
				pCount++;
				tCount += h.getScore();
			}
		}
		return (double)tCount / pCount;
	
	} // end of avg
	
	public static int sum(Predicate<Integer> p, List<Integer> list) {
		int sum = 0;
		for(int a : list) {
//			System.out.println(a + "의 p.test(a) => " + p.test(a));
			// test()를 통해 홀/짝 여부를 판단한다.
			if(p.test(a)) {
				sum += a;
			}
		}
		return sum;
	}

}
