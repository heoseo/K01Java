package quiz;

import java.util.Random;

/*
	버블정렬(Bubble Sort)
		: 정렬이 진행되는 과정이 거품이 보글보글 피어오르는 모습과 비슷하다 하여 지어진 명칭.
		: 정렬 알고리즘 중에서는 가장 단순하고 효율성이 떨어지는 알고리즘.
		: 데이터가 10개인 경우 45번의 비교가 필요하다.
 */

public class SortBubble {

	public static int[] bubbleSort(int[] arr) {
		
		int[] newArr = arr;
		
		for(int i = 0; i < newArr.length-1; i++) {
			for(int j = 0; j + i < newArr.length-1; j++) {
				System.out.println("i : " + i + " j : " + j);
				if(newArr[j] > newArr[j+1]) {
					int tmp = newArr[j];
					newArr[j] = newArr[j+1];
					newArr[j+1] = tmp;
				}
			}
			
		}
		
		return newArr;
	}
	
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
	
	public static void main(String[] args) {

		System.out.println("[중복 없이 생성된 크기 10의 난수 배열]");
		int[] arr = makeArr(6);
		printArr(arr);
		
		System.out.println("[버블정렬 후 배열 출력]");
		int[] sortedArr = bubbleSort(arr);
		printArr(sortedArr);
		
		/******************************************
		 * 내림차순 정렬도 해보기!
		 */
	}
	

}
