package quiz;

import java.util.Scanner;

public class QuConvertTime {

	public static void main(String[] args) {

		System.out.print("시간으로 변환할 초(secondd)를 입력하세요 >>> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int h, m, s;
		
		h = num / 3600;
		m = (num - h * 3600) / 60;
		s = (num - h * 3600) % 60;
		
		
		System.out.println(String.format("[%d시간 %d분 %d초]", h, m, s));
		
	}

}
