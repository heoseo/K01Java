package ex03operator;

public class E02BokhapOperator {

/*
			* 복합대입연산자
			   : 산술연산자와 대입연산자를 연결해 놓은 형태로
			          좌우측의 값을 연산하여 좌측의 변수에 대입하는 형태의 구조를 가진다.
			          문법구조상 항상 현재 타입을 유지하는 특성을 가지고 있다.
 */
	
	public static void main(String[] args) {

		double e = 3.1;
		e += 2.1;	//5.2
		e *= 2;		//10.4
		e = e + e;	//20.8
		System.out.println("e의 결과값 : " + e);
		
		e += e;		//41.6
		System.out.println("e의 결과값 : " + e);
		
//		========================================================================
		
		int n = 5;
//		n = n * 2.7;	// [에러발생!] => 연산의 결과가 double이므로 대입불가함.
		n = (int)(n*2.7);	// int <= (int)double // 명ㅇ시적 형변환 후 int형 변수에 대입함.
		System.out.println("n의 결과값 : " + n);	//13

		n *= 2.7;		// 연산결과가 int로 유지됨. (데이터 손실은 있을 수 있음)
						/*
							정상실행됨. 복합대입연산자는 문법의 구조상 기존 자료형을 그대로 유지하는
							특성을 가지고 있음 따라서 결과는 정수인 35이고, 소수 이하는 버려짐.
						 */
		System.out.println("n의 결과값 : " + n);
		
	}

}
