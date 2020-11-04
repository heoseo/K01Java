package ex17collection;

import java.util.HashSet;

import ex17collection.common.Person;

public class Ex04HashSet2 {

	public static void main(String[] args) {

		HashSet<Person> hashSet = new HashSet<Person>();
		
		// hashCode(), equals() 오버라이드 안하면
		// 세 객체가 같든지 다르든지 상관없이 다 저장해버림.
		Person p1 = new Person("정우성1", 30);
		Person p2 = new Person("정우성2", 30);
		Person p3 = new Person("정우성3", 30);
		
		hashSet.add(p1);
		hashSet.add(p2);
		boolean b = hashSet.add(p3);
		System.out.println("p3객체 저장여부 : " + b);
		System.out.println("HashSet에 저장된 객체 수 : " + hashSet.size());
		
	}

}
