package ex17collection.common;

public class Person {

	public String name;
	public int age;
	
	public Person() {
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 객체의 정보 반환용 메소드
	public String getInfo() {
		return String.format("이름 : %s, 나이 : %d", name,age);
	}
	
	// 겍체의 정보 출력용 메소드
	public void showInfo() {
		System.out.println(getInfo());
	}
	
	
	
	/*
	Set컬렉션에서 객체 저장시 동일한 객체인지 확인하기 위해 아래 2개의 메소드를 자동호출.
	따라서 개발자가 정의한 객체인 경우 중복제거를 위해 반드시 오버라이딩 해야 한다.
	 */
	
	
	
	// 우클릭->소스->generate 어쩌구
	@Override
	public int hashCode() {
//		//자동완성
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
		
		
		System.out.println("hash : " + name.hashCode());
		System.out.println("=> " + name.hashCode()%3);
		
		//(1) 이름, 나이 둘 다 비교
//		return (name.hashCode() + age)%3;// 둘다 비교
		//(2) 이름만 비교
//		return name.hashCode() % 3;		// 이름만 비교
		//(3) 나이만 비교
		return age % 3;					// 나이만 비교
	}
	
	@Override
	public boolean equals(Object obj) {
//		//자동완성
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
		
		Person comparePerson = (Person)obj;
		System.out.println("오버라이딩한 equals()메소드 호출됨");
		
		//(1) 이름, 나이 둘 다 비교
//		if(comparePerson.age == this.age && comparePerson.name.equals(this.name))
		//(2) 이름만 비교
//		if(comparePerson.name.equals(this.name))
		//(3) 나이만 비교
		if(comparePerson.age == this.age)
			return true;	// false가 아님!
		else
			return false;
		
//		if(comparePerson.age == this.age)
//		 -> 나이만 똑같으면 같은 객체로 취급하겠다!
	}
	
	
	
}
