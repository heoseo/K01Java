package ex12inheritance;

// 부모클래스
public class DeParent {

	private String name;
	private int age;
	
	public DeParent() {
	}
	public DeParent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter 메소드(priavte 멤버를 반환할 때 사용)
	public String getName() {
		return name;
	}

	private void eat() {
		System.out.println("부모님이 드신다.");
	}
	
	String sleep() {
		System.out.println("부모님이 주무신다.");
		return null;
	}
	
	protected void walk() {
		System.out.println("부모님이 산책하신다.");
	}
	
	public void exercise() {
		System.out.println("부모님이 운동하신다.");
	}
	
	// 정보 출력용 메소드
	public void printParent() {
		System.out.printf("성함 : %s, 연세 : %d", name, age);
	}
}
