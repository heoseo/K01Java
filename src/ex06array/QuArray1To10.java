package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int sum = 0;
		
		System.out.println("초기화된 배열 요소");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println("\n배열 전체 요소의 합 : " + sum);
		
	}

}
