package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
	* HashMap<K, V>
		: Map<T> 인터페이스를 구현한 컬렉션 클래스로
		 - Key, Value의 쌍으로 객체를 저장한다.
		 - 키값은 중복될 수 없다. 중복될 경우 덮어쓰기 처리한다.
		 - 키값으로 검색하므로 다른 컬렉션보다 속도가 빠르다.
 */

public class Ex05HashMapMain {

	public static void main(String[] args) {

		// Map 컬렉션 완성. Key와 Value는 String형으로 선언함.
		// [해쉬맵의 스트링콤마 스트링 타입] or 해시맵의 매개변수는 스트링,스트링 이라고 읽는다.
		HashMap<String, String> map = new HashMap<String, String>();
		
		/*
		객체저장
			: 객체 저장시 기존에 저장된 동일한 key값이 존재하면 이전 객체각 반환된다.
			만약 처음이라면 null값이 반환된다.
		 */
		System.out.println("name이라는 키값으로 저장된 이전의 값 : " + map.put("name", "홍길동"));
		
		int number = 20;
//		map.put("age", number);		// [에러발생!] -> value타입이 맞지 않음.
		map.put("age", String.valueOf(number));
		map.put("gender", "남자");
		map.put("address", "가산디지털단지");
		
		/*
		3. 객체수
		 */
		System.out.println("3. 객체수");
		System.out.println("저장된 객체 수 : " + map.size());
		
		/*
		4. 중복저장
			: 기존에 입력된 name 키값이 있으므로 "홍길동"이 출력된다.
			그리고 기존의 값이 "최길동"으로 갱신된다. 덮어쓰기 된다.
		 */
		System.out.println("\n4. 중복저장");
		System.out.println("name이라는 키값으로 저장된 이전의 값 : " + map.put("name", "최길동"));
		System.out.println("키값으로 중복 저장 후 객체 수 : " + map.size());
		
		/*
		5. 출력
		(1) 키값을 알고 있을 때 출력하기 : get(키값)으로 출력.
		 */
		System.out.println("\n5. 출력");
		System.out.println("(1) 키값을 알 때 : " + map.get("name"));
		
		/*
		(2) 키값을 모를 때 출력하기
			1) Set<T> KeySet() 메소드 호출을 통해 키값들을 Set계열의 컬렉션으로 얻어온다.
			2) 키값을 얻어온 후 확장 for문을 통해 저장된 값을 출력한다.
			※ Map계열의 컬렉션은 처음부터 확장 for문을 사용하는 것이 불가능하다.
			  위처럼 key값을 먼저 얻어온 후 사용해야 한다.
			※ Set 타입이므로 순서는 뒤죽박죽!
		 */
		Set<String> keys = map.keySet();
		System.out.println("(2) 키값을 모를 때 : [확장for문 적용]");
		for(String key : keys) {
			String value = map.get(key);
			System.out.println(String.format("%s : %s", key, value));
		}
		
		/*
		(3) 반복자를 통한 출력
			: iterator를 통해 반복할 때도 keySet()으로 먼저 key를 얻어온 후 사용할 수 있다.
		 */
		System.out.println("(3) [반복자 사용하기]");
		Set<String> keys2 = map.keySet();
		Iterator<String> it = keys2.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(String.format("%s : %s", key, value));
		}
		
		/*
		(4) Value값만 얻어올 떄 : values() 메소드 사용
		 */
		System.out.println("(4) [value값들만 출력하기]");
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		/*
		6. 존재 유무 판단
			: key 혹은 value가 존재할 경우 true 반환
		 */
		System.out.println("\n6. 존재 유무 판단");
		System.out.println(map.containsKey("name") ? "name키값있음" : "name키값없음");
		System.out.println(map.containsKey("account") ? "account키값있음" : "account키값없음");
		System.out.println(map.containsValue("남자") ? "남자 있음" : "남자 없음");
		System.out.println(map.containsValue("여자") ? "여자 있음" : "여자 없음");
		
		/*
		7. 삭제
			: key를 통해 삭제하고, 삭제가 완료되면 해당 value가 반환된다.
		 */
		System.out.println("\n7. 삭제");
		System.out.println("삭제된 객체 : " + map.remove("age"));
		System.out.println("[age키값을 삭제한 후 출력]");
		for(String key : keys) {
			System.out.println(String.format("%s : %s", key, map.get(key)));
		}
		
		/*
		8. 전체삭제 : removeAll()은 없음.
		 */
		System.out.println("\n8. 전체삭제");
		map.clear();
		System.out.println("전체 삭제 후 객체 수 : " + map.size());
	}

}
