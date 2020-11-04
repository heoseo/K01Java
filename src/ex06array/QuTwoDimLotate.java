package ex06array;

public class QuTwoDimLotate {

	public static void main(String[] args) {

		int[][] twoDim = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		//값 증가전 출력
		System.out.println("<< 구조 변경 전 출력 >>");
		arrPrint(twoDim);
		
		rotateArr(twoDim);
		
		//증가후 출력
		System.out.println("\n<< 구조 변경 후 출력 >>");
		arrPrint(twoDim);
		
		
//		int[][] testArr = {
//				{1, 2, 3},
//				{4, 5, 6},
//				{7, 8, 9},
//				{10,11,12}
//		};
//		//값 증가전 출력
//		System.out.println("<< 구조 변경 전 출력 >>");
//		arrPrint(testArr);
//		
//		changeArr(testArr);
//		
//		//증가후 출력
//		System.out.println("\n<< 구조 변경 후 출력 >>");
//		arrPrint(testArr);
	}
	
	static void rotateArr(int[][] arr) {
	/*
		* 절차
		 1) 배열의 마지막 행을 1차원배열 변수에 임시로 저장
		 2) 배열의 2행을 3행으로, 1행을 2행으로 옮긴다.
		 3) 1번에서 임시로 저장했던 값을 1행으로 옮긴다.
		 
		 ※2차원배열에서 "배열이름[인덱스]"가 하나의 행(세로행)을 가리킨다는 것을 활용하는 문제임.
	 */
		
		
		int[] lastRow = arr[arr.length-1];
		
		for(int row = arr.length-1; row > 0; row--) {
			arr[row] = arr[row-1];
		}
		arr[0] = lastRow;
		
		
		// 뒤부터 앞의 배열과 swap
		for(int i = arr.length-1; i > 0; i--) {
//			for(int j = 0; j < arr[i].length; j++) {
//				int[] tmp = new int[arr.length];	
//				// [i]번째 배열과 [i-1]배열을 바꿈.
//				tmp[j] = arr[i][j];
//				arr[i][j] = arr[i-1][j];	
//				arr[i-1][j] = tmp[j];
//			}
			
			int[] tmp = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = tmp;
			
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
