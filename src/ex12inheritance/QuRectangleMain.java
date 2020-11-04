package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle{
	protected int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 사각형의 넓이 출력
	public void showAreaInfo() {
		System.out.println("직사강형 면적 : " + width*height);
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle{
//	생성자 : 정사각형은 가로,세로의 길이가 동일하므로 
//			인자값 1개로 부모의 멤버변수 2개를 초기화할 수 있도록 구성한다.
	public Square(int width) {
		super(width, width);
	}
	
	// 사각형의 넓이를 구하는 공식은 동일하나 직사각형, 정사각형의 면적을 출력해야 하므로 오버라이딩 처리한다.
	@Override
	public void showAreaInfo() {
		System.out.println("정사각형 넓이 : " + width * height);
	}
} 
class QuRectangleMain{
	/*
	 직사각형 면적: 12
	정사각형 면적: 49

	 */
	public static void main(String[] args)
	{
     	Rectangle rec = new Rectangle(4, 3);
     	rec.showAreaInfo();

     	Square sqr = new Square(7);
     	sqr.showAreaInfo();
 	}
}
