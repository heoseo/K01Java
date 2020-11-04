package ex06array;

public class E05TwoDimArray02 {

	public static void main(String[] args) {

		
		// 세로크기 3, 가로크기 4인 배열 선언
		int[][] arr2Dim = new int[3][4];
		
		// 세로, 가로 크기만큼 반복하면서 초기화 진행
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				arr2Dim[i][j] = i + j;	// 00 01 02 03 => 0 1 2 3
										// 10 11 12 13 => 1 2 3 4 
										// 20 21 22 23 => 2 3 4 5
			}
		}
		
		// 초기화된 데이터를 출력.
		showArray(arr2Dim);
//		for(int n = 0; n < arr2Dim.length; n++) {
//			for(int m = 0; m < arr2Dim[n].length; m++) {
//				System.out.print(arr2Dim[n][m] + " ");
//			}
//			System.out.println();
//		}
		System.out.println(arr2Dim);
		System.out.println(arr2Dim[1]);
		System.out.println(arr2Dim[2]);
		System.out.println("\n[시나리오1]");
		
/*
		[시나리오1]
		다음 절차에 따라 프로그램을 작성하시오.
		1) 2차원 배열을 선언한다. 세로2, 가로4
		2) 난수를 이용하영 배열을 초기화한다.
		3) 배열전체요소를 매개변수로 전달된 정수만큼 증가시킨다.
		4) 증가되기 전, 후 배열을 출력한다.
		5) 다음 메소드명으로 구현한다. twoDimPlus()
*/
		
		// 세로2, 가로4인 배열 선언
		int[][] twoArray = new int[2][4];
		// 세로(행) 크기만큼 반복
		for(int i = 0; i <twoArray.length; i++) {
			// 가로(열) 크기만큼 반복
			for(int j = 0; j < twoArray[i].length; j++) {
				// 난수를 이용해서 각 요소를 초기화
				twoArray[i][j] = (int)(Math.random() * 100);
			}
		}
		
		System.out.println("====초기화 후=====");
		showArray(twoArray);
		
		twoDimPlus(twoArray, 10);
		
		System.out.println("===메소드 출력 후===");
		showArray(twoArray);
		
	}
	
	
	// 2차원 배열 출력용 함수
	static void showArray(int[][] arr2) {
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.printf(" %-3d", arr2[i][j]);
			}
			System.out.println();
		}
	}
	
	// 2차원 배열에 전된 매개변수 만큼 각 요소를 증가시키는 함수
	static void twoDimPlus(int[][] arr2, int plusNum) {
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				// 매개변수로 전달된 plusNum만큼 각 요소에 더함.
				arr2[i][j] += plusNum;
			}
		}
	}

}
