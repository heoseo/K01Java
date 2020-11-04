package ex10accessmodifier;

// [과일 판매자를 추상화한 클래스]
class FruitSeller{
	private String name;
	private int numOfApple;		// 판매자의 사과 보유 갯수
	private int myMoney;			// 판매수익
	private final int APPLE_PRICE;//사과의 단가
	
	public FruitSeller(int money, int appleNum, int price, String name) {
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
class FruitBuyer{
	
	// 멤버변수
	private String name;
	private int myMoney;	// 보유금액
	private int numOfApple; // 구매한 사과의 갯수

	
	public FruitBuyer(int _myMoney, int _numOfApple, String name) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		this.name = name;
	}
	
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	// 구매자의 현재 상태 출력
	public void showBuyResult() {
		System.out.println("[구매자" + name + "] 현재 잔액 : " + myMoney);
		System.out.println("[구매자" + name + "] 사과 갯수 : " + numOfApple);
	}
}

public class E03InfomationHiding {

	public static void main(String[] args) {
		
		// 판매자1
		FruitSeller seller1 = new FruitSeller(0, 100, 1000, "seller1");
		
		// 판매자2
		FruitSeller seller2 = new FruitSeller(0, 80, 500, "seller2");
		
		
		FruitBuyer buyer = new FruitBuyer(10000, 0, "buyer");
		
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

		
//		* 멤버변수를 private으로 선언하면 외부클래스에서는 접그이 불가능하므로 아래 코드는 에러 발생.
//			즉, 멤버변수의 정보은닉을 통해 비정상적인 접근 차단하고, 멤버메소드를 통해서만 구매가 이뤄질 수 있도록 구현.
//		seller1.myMoney += 1000;
//		seller1.numOfApple -= 50;
//		buyer.numOfApple += 50;
//		
//		seller2.myMoney += 1000;
//		seller2.numOfApple -= 70;
//		buyer.numOfApple += 70;
		
		
		System.out.println("=======================");
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}

}
