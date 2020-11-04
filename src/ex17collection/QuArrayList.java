package ex17collection;

import java.util.LinkedList;
import java.util.Scanner;

//import ex17collection.common.Student;

class Student{
	private String name;
	private int age;
	private String year;
	public Student(String name, int age, String year) {
		super();
		this.name = name;
		this.age = age;
		this.year = year;
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("학번 : " + year);
	}
	
	@Override
	public String toString() {
		return String.format("이름 : %s, 나이 : %d, 학번 : %s", name, age, year);
	}
	
}

public class QuArrayList {

public static void main(String[] args) {
		
		//ArrayList<Student> list = new ArrayList<Student>();
		LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
			
		//1.검색할 이름을 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요 >>> ");
		String name = sc.nextLine();
		
		//2.확장for문으로 컬렉션 전체를 접근
		int index=-1;
		for(Student st : list) {
			if(name.equals(st.getName()))
			{
				index = list.indexOf(st);
				break;
			}
		}

		//3.검색결과 유/무에 따라 
		
		//검색결과 있을때…검색된 데이터 삭제
		//검색결과 없을때...검색결과가 없다고 출력
		if(index >= 0)
		{
			System.out.println("검색결과 있음");
			System.out.println("객체 삭제 후 정보 출력");
			list.remove(index).showInfo();
		}
		else
			System.out.println("검색 결과가 없습니다.\n");

		//4.전체정보 출력
		System.out.println("\n전체 정보 출력");
		for(Student st : list)
//			st.showInfo();
			System.out.println(st);

	}


}
