package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import ex17collection.common.Teacher;

class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}

	
	// 객체에게 부여된 주소값(참조값)을 숫자형태로 반환해주는 메소드
	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((heroName == null) ? 0 : heroName.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ((weapon == null) ? 0 : weapon.hashCode());
//		return result;
		
		int hc1 = name.hashCode();
		int hc2 = heroName.hashCode();
		int hc3 = weapon.hashCode();
		
//		System.out.println(hc1 + " " + hc2 + " + hc3");
		/*
		해당 객체가 보유한 모든 멤버변수를 이용해서 해시값을 구하고
		연산(사칙연산 등등)하여 결과를 반환하면 된다.
		 */
		return hc1 + hc2 + hc3;
	}

	@Override
	public boolean equals(Object obj) {
		
		Avengers other = (Avengers) obj;
		if (other.name.equals(this.name) &&
			other.heroName.equals(this.heroName) &&
			other.weapon.equals(this.weapon))
			return true;
		else
			return false;
	}

}

public class QuHashSet {

	public static void main(String[] args) {

		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 

		System.out.println("[최초 전체 정보출력]");
		for(Avengers av : set)
		{
			System.out.println(av.toString());			
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요 >>> ");
		String name = sc.nextLine();
		String result = "해당 영웅은 없어요ㅜㅜ";
		
//		Iterator itr = set.iterator();
//		while(itr.hasNext()) {
//			Avengers find = (Avengers) itr.next();
//			if(name.equals(find.name)) {
//				System.out.println(find.toString());
//				result = "요청하신 정보를 찾았습니다.";
//			}
//		}
		
//		Iterator<Avengers> itr = set.iterator();
//		while(itr.hasNext()) {
//			if(name.equals(itr.next().name)) {
//				// toString()을 오버라이딩했으므로 객체 출력이 가능.
//				System.out.println(itr.next());
//				result = "요청하신 정보를 찾았습니다.";
//			}
//		}
		
		Iterator<Avengers> itr = set.iterator();
		while(itr.hasNext()) {
			Avengers find = (Avengers) itr.next();
			if(name.equals(find.name)) {
				// toString()을 오버라이딩했으므로 객체 출력이 가능.
				System.out.println(find);
				result = "요청하신 정보를 찾았습니다.";
			}
		}

		System.out.println(result);
	}
}



