package ex12inheritance;

public class DeChild extends DeParent {
	
	String stNumber;
	
	public DeChild(String name, int age, String stNumber) {
		super(name, age);
		this.stNumber = stNumber;
	}
	
	// 자식클래스에서 새롭게 확장한 멤버메소드
	public void study() {
		System.out.println(getName() + "이(가) 공부한다.");
	}
	
	// private은 오버라이드가 안됨.
	/*
	부모클래스에서 private 멤버메소드로 선언하였으므로 자식에서는 보이지 않아 오버라이딩의 대상이 될 수 없다.
	해당 함수는 자식클래스에서 새롭게 확장한 함수가 된다.
	 */
	private void eat() {
		System.out.println("학생이 먹는다.");
	}
	
	/*
	메소드 오버라이딩의 조건
		: 부모클래스에서 선언될 때 와 비교해서 접근범위가 동일하거나 그보다 넓으면 가능하다.
		: 즉, 부모에서  default로 선언했다면 자식에선 default 혹은 public이면 오버라이딩이 가능하다.
	 */
	@Override
	public String sleep() {
		System.out.println("학생이 잔다.");
		return null;
	}
	public int walk(int age) {
		System.out.println("나이가 " + age + "살인 학생이  산책한다.");
		return 0;
	}
	
	@Override
	public void printParent() {
		/*
		super의 두 가지 사용법
		 - super() : 부모클래스의 생성자 메소드 호출
		 - super, 멤버메소드  : 부모클래스에 정의된 멤버메소드 혹은 멤버변수를 접근할 때 사용.
		 */
		super.printParent();
		System.out.println(", 학번" + stNumber);
		
	}
	/*
	static(정적) 메소드는 오버라이딩의 대상이 될 수 없다.
	클래스 외부(메소드영역)에 존재하므로 오버라이딩 되지 않고 호출할 때는 각 클래스명을 통해 호출해야 한다.
	 */
	public static void staticMethod() {
		System.out.println("학생의 정적메소드");
	}
}
