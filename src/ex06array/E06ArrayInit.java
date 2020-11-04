package ex06array;

public class E06ArrayInit {
	
/*
 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	* 1,2차원 배열의 초기화 이슈
		- 1차원배열, 2차원배열은 최초 생성시 크기가 지정된 경우에는 전체 요소가 0으로 채워진다.
		- 2차원배열은 요소의 갯수가 가장 많은 행에 의해 크기가 결정되므로 자리수가 부족한 경우 null로 채워진다. 
	
	double[] arr = new double[3] -> 0.0으로 채워짐.
	int[][] arr2Dim = {{1}, {2,3}}; -> [0][1] 은 null로 채워짐.
	int[][] arr2Dim = new int[2][2]; -> [1][1] 은 0으로 초기화 됨.
*/

	public static void main(String[] args) {
		
// 		1. 크기 임의로 지정
//		 - 1차원, 2차원 배열은 크기가 지정된 경우에는 전체요소가 0으로 초기화된다.
		
// 		1) 1차원 배열
		int[] arr = new int[3];
		System.out.println("arr[0] = " + arr[0]);
		
// 		2) 2차원 배열
		int[][] arr2 = new int[3][4];
		System.out.println("arr2[0][0] = " + arr2[0][0]);
		

// 		2. 크기 자동으로 지정
// 		 - 1차원 배열은 요소의 갯수에 의해 전체 크기가 결정된다.
// 		 - 2차원 배열도 마찬가지이나 다른점은 가장 큰 요소의 갯수에 의해크기가 결정된다는 것.
// 		 	 초기화될때 빈 부분은 0으로 채울 수 없고 null로 채워진다.
		
// 		1) 1차원배열
		int[] arrDim = {1, 2, 3};
		System.out.println("arrDim[0] = " + arrDim[0]);
		
// 		2) 2차원 배열
		int[][] arr2Dim = {
				{1},
				{2,3}
		};
		System.out.println("arr2Dim[0][0] = " + arr2Dim[0][0]);
		System.out.println("arr2Dim[0][1] = " + arr2Dim[0][1]);
		// => 해당 index는  null이므로 출력이 불가능하다.
	}

}
