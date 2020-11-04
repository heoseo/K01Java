package ex09package.kosmo.seller;

public class FruitSeller4 {

		//String = name;
		String sellerName;
		int numOfApple;		// 판매자의 사과 보유 갯수
		int myMoney;			// 판매수익
		final int APPLE_PRICE;//사과의 단가
		
		public FruitSeller4(int money, int appleNum, int price, String name) {
			myMoney = money;
			numOfApple = appleNum;
			APPLE_PRICE = price;	// 상수 초기화!!!!!!!!!!!!!!!
			sellerName = name;
			//this.name = name;
		}
		



		public int saleApple(int money) {
			int num = money / APPLE_PRICE;
			numOfApple -= num;
			myMoney += money;
			return num;
		}
		
		
		// 판매자의 현재 상태를 출력하는 메소드
		public void showSaleResult() {
			System.out.println("[판매자 " + sellerName + "] 남은 사과 갯수 : " + numOfApple);
			System.out.println("[판매자 " + sellerName + "] 판매 수익 : " + myMoney);
		}


}
