package ex06array;

public class E02ArrayAndMethod {

	public static void main(String[] args) {
		
		
		int[] arr = {1, 2, 3, 4, 5};		// 배열을 선언과 동시에 초기화.
											// 요소의 갯수에 의해 크기가 결정됨.
											// (=> 크기 설정하지 않아도 됨)

		int[] ref;					// 배열 변수만 선언한 상태로 아직 참조하는 배열이 없음.
		
		System.out.println("초기화 직후 출력");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");	// -> 1, 2, 3, 4, 5
		}
		System.out.println();
		
		ref = addAllArray(arr, 7);	// 배열명을 매개변수로 전달하는 것은 
									// 배열의 참조값(주소값)을 전달하는 것이다.
									// 정수의 경우는 해당값이 그대로 전달된다.
		
//		★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		// addAllArray() 메소드에서 반환하는 값은 처음에 전달했던 배열의 주소값이므로, 
		// 결과적으로 ref도 동일한 배열을 참조하게 된다.
		// arr과 ref는 참조하는 주소를 동일하게 가지게 되었으므로 출력결과도 동일함.
		System.out.println("arr = " + arr + "\nref = " + ref); // 동일함.
		
		System.out.println("\n메소드 호출 후 출력");
		System.out.print("ref => ");
		for(int i = 0; i < ref.length; i++) {
			System.out.print(ref[i] + " ");	// -> 8 9 10 11 12
		}	
		System.out.println();
		System.out.print("arr => ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // -> 8 9 10 11 12 얘도 바뀜!!!★★★★★
		}
		
		
		
	}
	
/*
	매개변수로 전달된 참조값을 ar이 받게 되므로 결국 동일한 배열을 참조하게 된다.
 */
	static int[] addAllArray(int[] ar, int addVal) {
		for(int i = 0; i < ar.length; i++) {
			ar[i] += addVal;	// 배열의 각 요소의 값에 7을 더한 후 결과값을 다시 저장함.
								// 즉 7씩 증가시키는 연산이 수행됨.
		}
		return ar;
	}

}