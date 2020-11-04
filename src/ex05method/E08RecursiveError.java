package ex05method;

public class E08RecursiveError {

	public static void showHi(int cnt) {
		System.out.println("Hi");
		System.out.println("cnt="+cnt);
		
		if(cnt==1) {
			return;
		}
		showHi(--cnt);
		/*
			감소연산자가 뒤에 있으면 cnt의 값이 감소하기전 함수르르 호출하게되므로
			무한루프에 빠지게 된다.
		 */
	}
	
	/*
	오류코드
	1. 감소영ㄴ산자로 인해 cnt의 값은 차감되었지만
	2. 조건식의 위치가 잘못되어
	3. 재귀호출을 하기전에 종료체크를 할 수 있도록 수정해야 한다.
	
	Stackoverflow
	: 스택은 ㅎ마수가 종료되기 전까지의모든 정ㅇ보를 저장하나ㅡ 메모리로 유한한 공간이미ㅡ로
	뭏나루프에 빠지게 되면 저장능력으 ㄹ초과하여 ㅊ해당 에러가 발생하게 된다.
	 */
	
	public static void main(String[] args) {

		showHi(3);
	}

}
