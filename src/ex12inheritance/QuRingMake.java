package ex12inheritance;
class Point{
   	protected int xDot, yDot;
   	
   	public Point(int x, int y)
   	{
   		xDot=x;
   		yDot=y;
   	}
   	public void showPointInfo()
   	{
        System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;

	// 생성자
	// 반지름을 표현하는 radian과 중심좌표를 표현한 Point객체 생성을 위해 총 3개의 인자가 필요
	public Circle(int x, int y, int rad) {
		radian = rad;
		center = new Point(x, y);
	}
	
	public void showCircleInfo() {
		/*
		반지름과 중심좌표를 출력할 때 중심좌표는 Point클래스에서 정의된 메소드를 호출한다.
		 */
		System.out.println("반지름 : "+ radian);
		center.showPointInfo();
	}
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	public Ring(int innerX, int innerY, int innerRad, int outerX, int outerY, int outerRad) {
		
		innerCircle = new Circle(innerX, innerY, innerRad);
		outerCircle = new Circle(outerX, outerY, outerRad);
		
	}

	public void showRingInfo() {
		/*
		각가의 객체가 상속관계가 아니므로 각 객체를 통해 멤버멤소드를 호출해야 한다.
		 */

		System.out.println("====안쪽 원의 정보====");
		innerCircle.showCircleInfo();
		System.out.println("====바깥쪽 원의 정보====");
		outerCircle.showCircleInfo();
	}
}
class QuRingMake {
	/*
	안쪽원의 정보 :
	반지름 : 3	
	[x좌표:1, y좌표1]
	바깥쪽원의 정보 :
	반지름 : 9
	[x좌표:2, y좌표2]
	 */
	public static void main(String[] args) {
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}

