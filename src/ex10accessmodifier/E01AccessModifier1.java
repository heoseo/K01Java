package ex10accessmodifier;

/*
	* 클래스를 정의할 는 반드시 default(생략형), public만 사용해야 함.
 */
//private class PrivateClass1{
//	
//	void myFunc() {
//		System.out.println("DefaultClass 클래스의 myFunc()메소드 호출");
//	}
//}


/*
 1.public 클래스
  - 접근 지정자를 생략했으므로 default클래스로 지정된다.
  - 해당 클래스는 동일 패키지 내에서만 접근가능하다.
 */
class DefaultClass1{
	
	void myFunc() {
		System.out.println("DefaultClass 클래스의 myFunc()메소드 호출");
	}
}

/*
 2. public 클래스 
  - public클래스는 해당 java파일을 대표하는 클래스로, 
  	파일명과 동일해야 하고 다른 패키지에서도 접근이 가능하다.
  - 하나의 자바파일에 하나만 정의할 수 있다.
*/
public class E01AccessModifier1 {

	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	
/*	1) private 메소드
 	 : 동일 클래스 내에서는 private 멤버라 할지라도 접근이 가능하다.
 	 : 즉 동일클래스이면 접근지정자에 영향을 받지 않는다.
 */
	private void privateMethod() {
		privateVar = 100;
		System.out.println("privateMethod() 메소드 호출");
	}
	void defaultMethod() {
		privateVar = 200;
		System.out.println("defaultMethod() 메소드 호출");
	}
	
/*	2) public 메소드
	 : private으로 선언된 멤버(변수 혹은 메소드) 를 외부클래스에서 접근하고 싶을 때는 
	 public으로 선언된 멤버메소드를 이용해서 간접적으로 접근할 수 있다.
 */	
	public void publicMethod() {
		privateVar = 300;
		System.out.println("publicMethod() 메소드 호출");
		privateMethod();
	}
}
