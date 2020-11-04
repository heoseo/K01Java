package ex17collection;

class Orange{
	int sugar;
	public Orange(int sugar) {
		this.sugar = sugar;
	}
	
	public void showInfo() {
		System.out.println("오렌지의 당도는  " + sugar + "입니다.");
	}
}

// Orange 객체만 저장할 수 있음!
class OrangeBox{
	Orange item;
	public void store(Orange item) {
		this.item = item;
	}
	public Orange pullOut() {
		return item;
	}
}

// Object기반으로, 모든 객체(과일) 저장할 수 있음!!
class FruitBox{
	Object item;
	public FruitBox(Object item) {
		this.item = item;
	}
	public void store(Object item) {
		this.item = item;
	}
	public Object pullOut() {
		return item;
	}
}

public class Ex01GenericBasic {
	// 컬렉션 : list, set, map으로 구성됨.

	public static void main(String[] args) {

		// OrangeBox에 Orange객체를 생성한 후 저장하고 정보 출력
		OrangeBox oBox1 = new OrangeBox();
		Orange orange1 = new Orange(10);
		oBox1.store(orange1);
		orange1 = oBox1.pullOut();
		orange1.showInfo();
		
		/*
		상자 1은 오렌지 전용 박스이므로 다른 과일(객체)를 저장할 수 없다.
		컴파일 에러가 발생하므로 실행 자체가 불가능하다.
		-> 자료형에는 안전하지만, 구현에는 불편함이 있다.
		다른 객체를 저장하기 위해서는 또다른 Box클래스를 생성해야 한다.
		 */
//		oBox1.store("당도가 20인 오렌지");
//		Orange orange2 = oBox1.pullOut();	// [컴파일에러발생]
//		orange2.showInfo();
		
		/*
		Object를 기반으로 한 FruitBox는 구현에는 편리하나
		코드레벨에서 컴파일에러가 발생하지 않으므로, 오류를 찾아내기 훨씬 더 힘들다.
		따라서 자료형에는 안전하지 못한 코드가 된다.
		 */
		FruitBox fBox1 = new FruitBox(new Orange(20));
		Orange orange3 = (Orange)fBox1.pullOut();
		orange3.showInfo();
		
		FruitBox fBox2 = new FruitBox("당도가 30인 오렌지");
//		Orange orange4 = (Orange)fBox2.pullOut();	// [런타임에러](예외)잘생
//		orange4.showInfo();
		
//		fBox1.store(new Apple(10));
//		Apple apple = (Apple) fBox1.pullOut();
//		apple.showInfo();
//		// 담아둔 apple은 없어짐
//		fBox1.store(new Banana(10));
//		Banana banana = (Banana) fBox1.pullOut();
//		banana.showInfo();
//		
//		try {
//			// 현재 banana가 저장돼있기 대문에 오류남.
//			apple = (Apple) fBox1.pullOut();
//			apple.showInfo();
//		} catch (ClassCastException e) {
//			banana.showInfo();
//		}
	}

}
