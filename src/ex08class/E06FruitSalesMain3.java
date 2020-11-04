package ex08class;

// [과일 판매자를 추상화한 클래스]
class FruitSeller3{
	String name;
	int numOfApple;		// 판매자의 사과 보유 갯수
	int myMoney;			// 판매수익
	final int APPLE_PRICE;//사과의 단가
		// └▶ 생성자 선언과 동시에 초기화 안해도 됨.
	/*★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	상수는 값의 변경이 불가능하고, 단 한 번만 초기화되기 때문에 일반적인 멤버메소드에서는 초기화 불가능.
	하지만, 생성자 메소드에서는 초기화 가능.
	마음대로 호출할 수 없고, 객체 생성시 단 한 번만 호출되는 특성이 동일하기 때문에
	한 번 이상 초기화되지 않음이 보장됙 때문이다.
	 */
	
	public FruitSeller3(int money, int appleNum, int price, String name) {
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
class FruitBuyer3{
	
	// 멤버변수
	String name;
	int myMoney;	// 보유금액
	int numOfApple; // 구매한 사과의 갯수

/*
	apple_price를 상수에서 변수로 변경한 이유는 상수는 단 한번만 초기화되는 특성 때문에
	일반적인 멤버메소드 내에서는 초기화할 수 없다.
	멤버메소드는 개발자가 원할 때 언제든지 호출할 수 있으므로, 상수의 특성과는 맞지 않기 때문이다.
 */
	
	public FruitBuyer3(int _myMoney, int _numOfApple, String name) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		this.name = name;
	}
	
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	// 구매자의 현재 상태 출력
	public void showBuyResult() {
		System.out.println("[구매자" + name + "] 현재 잔액 : " + myMoney);
		System.out.println("[구매자" + name + "] 사과 갯수 : " + numOfApple);
	}
}

public class E06FruitSalesMain3 {

	public static void main(String[] args) {
		
//		* 생성자를 정의하였으므로, 각각 성격이 다른 객체들을 생성할 수 있다.
		// 판매자1
		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000, "seller1");
		
		// 판매자2
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 500, "seller2");
		
		
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0, "buyer");
		
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
	}

}
