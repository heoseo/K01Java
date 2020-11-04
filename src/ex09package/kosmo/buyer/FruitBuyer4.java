package ex09package.kosmo.buyer;

import ex09package.kosmo.seller.FruitSeller4;

public class FruitBuyer4 {
	// 멤버변수
			String name;
			int myMoney;	// 보유금액
			int numOfApple; // 구매한 사과의 갯수

		/*
			apple_price를 상수에서 변수로 변경한 이유는 상수는 단 한번만 초기화되는 특성 때문에
			일반적인 멤버메소드 내에서는 초기화할 수 없다.
			멤버메소드는 개발자가 원할 때 언제든지 호출할 수 있으므로, 상수의 특성과는 맞지 않기 때문이다.
		 */
			
			public FruitBuyer4(int _myMoney, int _numOfApple, String name) {
				myMoney = _myMoney;
				numOfApple = _numOfApple;
				this.name = name;
			}
			
			public void buyApple(FruitSeller4 seller, int money) {
				numOfApple += seller.saleApple(money);
				myMoney -= money;
			}
			
			// 구매자의 현재 상태 출력
			public void showBuyResult() {
				System.out.println("[구매자" + name + "] 현재 잔액 : " + myMoney);
				System.out.println("[구매자" + name + "] 사과 갯수 : " + numOfApple);
			}
			
}
