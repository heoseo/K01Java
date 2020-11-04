package ex18lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Ex06Define2Supplier {

	// 난수를 생성해서 List로 반환
	public static List<Integer> makeRandomNum(Supplier<Integer> s, int cnt){
		// 난수를 생성하여 반환하는 람다식을 매개변수로 받아 cnt개의 난수를 반환함.
		List<Integer> li = new ArrayList<Integer>();
		// cnt크기 만큼 반복하면서 난수를 생성한 후 list에 저장함.
		for(int i = 1; i <= cnt; i++)
			li.add(s.get());
		
		return li;
	}
	
	/*
	Supplier<T>
		: 공급자란 의미를 가지고 있다.
		: 매개변수는 없으나 리턴값이 있는 get()메소드가 정의되어 있음.
		: 주로 실행 후 호출한 곳으로 데이터를 생성 후 반환한다.
	 */
	
	public static void main(String[] args) {

		/*
			Interface Supplier<T>{
				Object get();
			}
		 */
		
		//위의 get() 메소드르 ㄹ오버라이딩 하여 0~99 사이의 난수를 반환하는 람다식 정의
		Supplier<Integer> sup = () -> {
			Random random = new Random();
			return random.nextInt(100);
		};
		
//		get()메소드가 반환하는 Integer객체를 Auto Unboxing해서 int형 변수에 저장한다.
		int rNum = sup.get();
		System.out.println("생성된 난수 = " + rNum);
		
		// 10개의 난수를 생성해서 List 컬렉션으로 반환받음.
		List<Integer> list = makeRandomNum(sup, 10);
		System.out.println("### print문으로 출력1 ###");
		System.out.println(list);
		
		System.out.println("\n### foreach문으로 출력2 ###");
		for(Integer i : list)
			System.out.printf("%d ", i);
		
		System.out.println();
		
		System.out.println("\n### 이터레이터로 출력3 ###");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
		
	}

}
