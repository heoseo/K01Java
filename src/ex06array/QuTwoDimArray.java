package ex06array;

// 가로, 세로 길이 상관없이 동작
// 반드시 addOneArr() 사용
// 증가되기 전 후 모두 출력
class QuTwoDimArray
{
	public static void main(String[] args){		
		//배열선언 : 비어있는 부분은 null로 초기화 됨.
		int[][] arr = {
				{1, 2, 3, 4},
				{5, 6, 7},
				{8, 9}
		};
		//값 증가전 출력
		System.out.println("<< 값 증가 전 출력 >>");
		arrPrint(arr);		
		//2만큼 증가시키는 메소드 호출
		addTwoArr(arr, 2);
		//증가후 출력
		System.out.println("\n<< 값 증가 후 출력 >>");
		arrPrint(arr);
	}

	//문제에서 제시한 내용
	public static void addOneArr(int[] arr, int add)
	{
		//가로에 대한 반복
		for(int i=0; i<arr.length; i++){	
			arr[i] += add;
		}
	}
	//addOneArr() 메소드를 기반으로 2차원 배열을 증가시키는 메소드
	public static void addTwoArr(int[][] arr, int add)
	{
		// 세로에 대한 반복을 통해 한 행씩 addOneArr()로 전달한다.
		// (이차원배열에서는 배열의 이름을 통해 세로 길이를 알 수 있음.)
		for(int i = 0; i < arr.length; i++) {
			addOneArr(arr[i], add);
		}
	}
	
	
	//2차원 배열을 출력하기 위한 메소드
	static void arrPrint(int[][] arr) {

		for(int[] a : arr) {
			for(int b : a) {
				System.out.printf("%-2d ", b);
			}
			System.out.println();
		}
		
	}
}

