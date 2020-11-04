package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import ex17collection.common.Teacher;

public class Ex04HashSet1 {
/*
 	* HashSet컬렉션
 		: Set계열의 인터페이스를 구현한 컬렉션으로
 		 - 객체가 순서없이 저장된다.
 		 - 객체의 중복저장을 기본적으로 허용하지 않는다.
 		 	단, 기본클래스가 아닌 새롭게 정의한 클래스라면
 		 	hashCode(), equals()를 적절히 오버라이딩해야 한다.
 		 - List가 배열의 성격이라면, Set은 집합의  성격을 가진다.
 */

	public static void main(String[] args) {

		/*
		[1] set컬렉션 생성
		 */
		HashSet<Object>	set = new HashSet<Object>();
		
//		[2] 다양한 객체 생성
		String strObject1 = "JAVA";
		String strObject2 = new String("KOSMO61기");
		Date dateObject = new Date();
		int number = 100;	// <- Integer객체로 Boxing처리후 저장됨!
		Teacher teacher = new Teacher("김봉두", 55, "체육");
		
		/*
		[3] 객체 저장
			: add()를 통해 객체가 정상적으로 저장되면 true를 반환한다.
		 */
		System.out.println("[3] 객체 저장");
		System.out.println(set.add(strObject1));
		set.add(strObject2);
		set.add(dateObject);
		set.add(number);	// <- new Integer(number)로 생성 후 저장됨.!!!
		set.add(teacher);
		
		/*
		[4] 저장된 객체 수 얻기
		 */
		System.out.println("\n[4] 저장된 객체 수 얻기");
		System.out.println("[중복저장 전 객체 수] : " + set.size());
		
		/*
		[5-1] 기본 클래스형 객체 중복 저장
			: 기본 클래스의 경우 별도의 오버라이딩 처리 없이 중복이 제거된다.
				따라서 아ㅐㄹ의 경우는 false가 반환된다.
		 */
		System.out.println("\n[5-1] 기본 클래스형 객체 중복 저장");
		System.out.println(set.add(strObject2) ? "저장성공" : "저장실패");
		System.out.println("[중복(String) 저장 후 객체 수] : " + set.size());
		
		/*
		[5-2] 개발자가 정의한 객체 중복 저장
			: 직접 정의한 클래스인 경우 hashCode(), equals()메소드를 오버라이딩 하지 않으면
			중복저장이 허용된다. 아래의 경우 저장에 성공하여 true반환됨.
		 */
		System.out.println("\n[5-2] 개발자가 정의한 객체 중복 저장");
		Teacher teacher2 = new Teacher("김봉두", 55, "체육");
		System.out.println(set.add(teacher2) ? "저장성공" : "저장실패");
		System.out.println("[중복(teacher2) 저장 후 객체 수] : " + set.size());
		
		/*
		[6] 저장된 객체 출력
			: 출력된 결과는 순서를 알 수 없음.
		 */
		System.out.println("\n[6] 저장된 객체 출력");
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Object object = itr.next();
			
			if(object instanceof String)
				System.out.println("String타입 : " + object);
			else if(object instanceof Date)
				System.out.println("Date타입 : " + object);
			else if(object instanceof Integer)
				System.out.println("Integer타입 : " + object);
			else if(object instanceof Teacher)
				System.out.println("Teacher타입 : " + ((Teacher)object).getInfo());
			else
				System.out.println("넌 뭐임??-_-;");
		}// end of while
		
//		[7] 존재여부 확인
		System.out.println("\n[7] 검색");
		System.out.println(set.contains(strObject1) ? "strObject1있음" : "strObject1없음");
		System.out.println(set.contains("Java") ? "Java있음" : "Java없음");
		
//		[8] 삭제
//			: Set은 index가 없으므로 참조값으로만 삭제가능
		System.out.println("\n[8] 삭제");
		System.out.println(set.remove(strObject2) ? "strObject2삭제성공" : "strObject2삭제실패");
		System.out.println(set.remove("Android") ? "Android삭제성공" : "Android삭제실패");
		System.out.println("[삭제 후 객체수] : " + set.size());
		
//		[9] 전체삭제
		//set.clear();
		System.out.println("\n[9] 전체삭제");
		System.out.println("전체삭제 : " + set.removeAll(set));
		System.out.println("[전체 삭제 후 객체 수] : " + set.size());
		
		
		
	}

}
