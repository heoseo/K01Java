package quiz;

import java.util.Random;

public class SortSelectioin {

	public static int[] makeArr(int num) {
		
		int[] arr = new int[num];
		Random rand = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (rand.nextInt(99)+1);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					arr[i] = (rand.nextInt(99)+1);
					continue;
				}
			}
		}
		
		return arr;
	}
	
	public static void printArr(int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static int[] selectionSort(int[] arr) {

		
		for(int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}

			if(arr[minIndex] < arr[i]) {
				int tmp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = tmp;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {

		System.out.println("[중복 없이 생성된 크기 10의 난수 배열]");
		int[] arr = makeArr(10);
		printArr(arr);
		
		System.out.println("[선택정렬 후 배열 출력]");
		int[] sortedArr = selectionSort(arr);
		printArr(sortedArr);
	}


}
