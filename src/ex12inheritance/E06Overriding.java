package ex12inheritance;

/*
	* 오버라이딩(Overriding)
		: 클래스가 상속관계에 있을 떄 하위클래스에서 상위클래스의 멤버메소드와 동일한 모양으로 재정의하는 것을 말한다.
		: 오버로딩(Overloading)과 다른 점은 매개변수의 갯수, 반환타입 등이 완전히 똑같은 형태로 정의한다는 것이다.
		: 하위클래스에서 오버라이딩한 메소드는 상위클래스의 메소드를 가리게 되므로 항상 최하위 클래스에 서 오버라이딩한 메소드가 호출된다.
 */

// 일반적인 스피커를 추상화한 클래스
class Speaker{
	private int volumnRate;
	
	// setter메소드 정의
	public void setVolumn(int vol) {
		volumnRate = vol;
	}
	public void showState() {
		System.out.println("스피커의 볼륨크기 : " + volumnRate);
	}
}

class BaseSpeaker extends Speaker{
	private int baseRate;
	public void SetBase(int bas) {
		baseRate = bas;
	}
	@Override
	public void showState() {
		/*
		super를 통해 부모클래스에 정의된 멤버메소드들 호출한다.
		특히, 오버라이딩 된 메소드를 호출할 때 super가 없으면 재귀함수가 되므로 반드시 필요하다.
		 */
		super.showState();
		System.out.println("베이스의 볼륨크기 : " + baseRate);
	}
}

public class E06Overriding {

	public static void main(String[] args) {

		BaseSpeaker baseSpeaker = new BaseSpeaker();
		baseSpeaker.setVolumn(10);
		baseSpeaker.SetBase(20);
		baseSpeaker.showState();
		/*
		하위클래스에서 오버라이딩한 showState() 메소드가 호출된다.
		 */
		
		System.out.println();
		
		/*
		부모클래스이 참조변수가 자식클래스의 객체를 참조할 수 있다.
		이 경우 접근범위는 부모클래스로 제한된다.
		즉, 아래 호출 부분에서 speaker 참조변수를 통해서는 setBase()메소드를 호출할 수 없다.
		setBase()는 자식클래스에 정의된 멤버메소드이기 때문이다.
		단, 오버랑디ㅣㅇ 처리된 메소드가 있는 경우 하위클래스의 메소드가 호출된다.
		 */
		Speaker speaker = new BaseSpeaker();
		speaker.setVolumn(30);
//		speaker.setBase(40);
		speaker.showState();
		
	}

}
