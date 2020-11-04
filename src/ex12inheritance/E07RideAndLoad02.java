package ex12inheritance;

public class E07RideAndLoad02 {
	public static void main(String[] args) {
	
		System.out.println("Child형 참조변수로 Child객체 참조");
		DeChild child = new DeChild("율곡이이", 49, "00학번");
		
		/*
		오버라이딩 처리된 메소드이므로 참조변수에 상관없이 무조건 자식쪽 메소드가 호출된다.
		 */
		
		child.exercise();
		child.sleep();
		child.printParent();
		
		child.study();			// 자식에서 확장한 메소드(부모쪽엔 없음)
		child.walk();			// 오버로딩 - 부모쪽에 정의
		child.walk(25);			// 오버로딩 - 자식쪽에 정의
		DeChild.staticMethod();	// 정적메소드는 클래스명을 통해 호출. static의 기본규칙.
		
		
		System.out.println("\n\nParent형 참조변수로 Child객체 참조");
		DeParent parent = new DeChild("퇴계이황", 35, "99학번");
		
		// 오버라이딩 처리된 메소드이므로 참조변수에 상관없이 무조건 자식쪽 메소드가 호출됨.
		// 참조변수의 영향을 받지 않는다.
		parent.exercise();
		parent.sleep();
		parent.printParent();
	
//		parent.study();
		parent.walk();
//		parent.walk(20);
		
//		DeParent.staticMethod();
		
	}
}
