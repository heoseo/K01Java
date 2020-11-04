package ex08class;

class Triangle{
	// 멤버변수
	int bottom, height;	// 밑변, 높이
	double area;
	
	// 매개변수 이름은 bottom / b / _bottom 셋 다 가능
	void init(int bottom, int height) {
		this.bottom = bottom;
		this.height = height;
	}
	
	// 밑변을 설정
	void setBottom(int _bottom) {
		bottom = _bottom;
	}
	
	// 높이를 설정
	void setHeight(int h) {
		height = h;
	}
	
	// 삼각형의 넓이를 구하는 멤버메소드
	double getArea() {
		return (bottom * height) * 0.5;
	}
	
}

public class QuTriangle {

	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());

	}

}
