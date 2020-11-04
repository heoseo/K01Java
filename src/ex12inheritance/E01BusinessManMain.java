package ex12inheritance;

// 상위-하위 / 기초-유도 / 부모-자식 / Super-Sub

/*
	* 상속(Inheritance)
		: 기존에 정의된 클래스에 메소드와 변수를 추가하여 새로운 클래스 정의하는 것을 말한다.
		: 부모클래스를 자식클래스가 상속할 때는 extends 키워드를 사용한다.
 */
class Man{
	private String name;
	public Man() {
		System.out.println("Man클래스 디폴트 생성자 호출됨");
	}
	public Man(String name) {
		this.name = name;
		System.out.println("Man 클래스 인자 생성자 호출됨");
	}
	public void tellYourName() {
		System.out.println("내 이름은 " + name + " 입니다");
	}
}

// 자식클래스(하위, 유도, 서브) : Man 클래스를 상속받은 회사원 클래스
class BusinessMan extends Man{
	private String company;
	private String position;
	
	// 상속받은 자식클래스에 부모 클래스의 생성자를 호출하여 부모객체가 먼저 생성되도록 해야하는 책임을 가지고 있다.
	// super()는 부모클래스의 생성자를 호출하는 역할을 하며,
	// 만약 super()를 기술하지 않으면 디폴트(기본)생성자가 호출된다.ㅏ
	public BusinessMan(String name, String company, String position) {
		super(name);	// 부모클래스이 매개변수 1개인 생성자를 호출
		this.company = company;
		this.position = position;
		System.out.println("BusinessMan 생성자 호출");
	}
	
	public void tellYourInfo() {
		System.out.println("회사명은 " + company + " 입니다.");
		System.out.println("직급은 " + position + " 입니다.");
		// 부모클래스에 정의된 멤버메소드 호출. 상속받았으므로 즉시 호출 가능함.
		tellYourName();
	}
}


public class E01BusinessManMain {

	public static void main(String[] args) {

		BusinessMan man1 = new BusinessMan("김천국", "NAVER", "팀장");
		BusinessMan man2 = new BusinessMan("이낙원", "DAUM", "부장");
		
		man1.tellYourInfo();
		man1.tellYourName();
		
		man2.tellYourInfo();
		man2.tellYourName();
		
	}

}
