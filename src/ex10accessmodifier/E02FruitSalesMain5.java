package ex10accessmodifier;

// [과일 판매자를 추상화한 클래스]
class FruitSeller5{
	String name;
	int numOfApple;		// 판매자의 사과 보유 갯수
	int myMoney;			// 판매수익
	final int APPLE_PRICE;//사과의 단가
	
	public FruitSeller5(int money, int appleNum, int price, String name) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;	// 상수 초기화!!!!!!!!!!!!!!!
		this.name = name;
	}
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	
	// 판매자의 현재 상태를 출력하는 메소드
	public void showSaleResult() {
		System.out.println("[판매자 " + name + "] 남은 사과 갯수 : " + numOfApple);
		System.out.println("[판매자 " + name + "] 판매 수익 : " + myMoney);
	}
}

// [구매자를 표현한 클래스]
class FruitBuyer5{
	
	// 멤버변수
	String name;
	int myMoney;	// 보유금액
	int numOfApple; // 구매한 사과의 갯수

	
	public FruitBuyer5(int _myMoney, int _numOfApple, String name) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		this.name = name;
	}
	
	public void buyApple(FruitSeller5 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	// 구매자의 현재 상태 출력
	public void showBuyResult() {
		System.out.println("[구매자" + name + "] 현재 잔액 : " + myMoney);
		System.out.println("[구매자" + name + "] 사과 갯수 : " + numOfApple);
	}
}

public class E02FruitSalesMain5 {

	public static void main(String[] args) {
		
		// 판매자1
		FruitSeller5 seller1 = new FruitSeller5(0, 100, 1000, "seller1");
		
		// 판매자2
		FruitSeller5 seller2 = new FruitSeller5(0, 80, 500, "seller2");
		
		
		FruitBuyer5 buyer = new FruitBuyer5(10000, 0, "buyer");
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		/*
		구매자가 판매자에게 5000원을 지불하고 사과를 구매한 행위를 코드로 표현
		 */
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("=======================");
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();

		
		
//		* 아래의 코드는 문법적으로는 오류가 없으나 지불금액과 구매한 사과의 관계가 전혀 맞지 않는 논리적 오류가 발생하였다.
//			즉, 코드(메소드)로 구현한 규칙이 완전히 무너지게 된다.
//			객체지향 프로그래밍에서는 이런 오류를 막기 위해 "정보은닉"하도록 규정하고 있다.
		// 판매자 1에게 1000원을 지불하고 사과 50개를 구매했다.
		// 판매자 2에게 1000원을 지불하고 사과 70개를 구매했다.
		// 하지만 구매자의 보유금액은 차감되지 않았다.
		seller1.myMoney += 1000;
		seller1.numOfApple -= 50;
		buyer.numOfApple += 50;
		
		seller2.myMoney += 1000;
		seller2.numOfApple -= 70;
		buyer.numOfApple += 70;
		
		
		System.out.println("=======================");
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}

}
