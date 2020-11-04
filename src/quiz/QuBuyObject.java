package quiz;

import java.util.Scanner;

public class QuBuyObject {

	public static void main(String[] args) {

		System.out.print("구매할 금액을 입력하세요(1600원이상) : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int b=0, g=0, d=0;	// 빵, 과자, 음료수
		int money = num;
		
		while(money != 0) {
			money = num;
			if(money/500 != 0) {
				money -= 500;
				b++;
			}
			if(money/700 != 0) {
				money -= 700;
				g++;
			}
			if(money%400 == 0) {
				while(money == 0) {
					money -= 400;
					d++;
				}
			}
			System.out.printf("빵 %d개, 과자 %d개, 음료 %d개\n", b, g, d);
		}
		System.out.println("위 방법 중 하나를 선택하세욤^^*");
		
	}

}
