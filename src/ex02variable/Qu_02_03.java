package ex02variable;

public class Qu_02_03 {

	public static void main(String[] args) {
		
		int rad = 10;	// radian
		final float PI = 3.14f;
		
		int area_int = (int)(rad * rad * PI);
		float area_float = (float)(rad * rad * PI);
		double area_double = (double)(rad * rad * PI);
		
		/*
			큰 자료형을 작은 자료형에 대입할 때는 자료의 손실이 있을 수 있으므로
			반드시 강제형변환(명시적형변환)을 통해 형변환 후 대입해야 한다.
		 */
		
		
		System.out.println("int형 넓이 : " + area_int);
		System.out.println("float형 넓이 : " + area_float);
		System.out.println("double형 넓이 : " + area_double);

	}

}
