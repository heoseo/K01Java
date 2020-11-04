package ex08class;

// [과일 판매자를 추상화한 클래스]
class FruitSeller2{
	String name;
	int numOfApple;		// 판매자의 사과 보유 갯수
	int myMoney;			// 판매수익
	int apple_price;//사과의 단가
		// └▶ 상수에서 변수로 변경함.
		//	클래스이 멤버상수로 정의하는 경우 선언과 동시에 초기화해야 하므로
		//	상수는 초기값이 없는 형태로는 선언이 불가능함.
	
	public void initMembers(int money, int appleNum, int price, String name) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
		this.name = name;
	}
	
	public int saleApple(int money) {
		int num = money / apple_price;
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
class FruitBuyer2{
	
	// 멤버변수
	String name;
	int myMoney;	// 보유금액
	int numOfApple; // 구매한 사과의 갯수

/*
	apple_price를 상수에서 변수로 변경한 이유는 상수는 단 한번만 초기화되는 특성 때문에
	일반적인 멤버메소드 내에서는 초기화할 수 없다.
	멤버메소드는 개발자가 원할 때 언제든지 호출할 수 있으므로, 상수의 특성과는 맞지 않기 때문이다.
 */
	
	public void initMembers(int _myMoney, int _numOfApple, String name) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		this.name = name;
	}
	
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	// 구매자의 현재 상태 출력
	public void showBuyResult() {
		System.out.println("[구매자" + name + "] 현재 잔액 : " + myMoney);
		System.out.println("[구매자" + name + "] 사과 갯수 : " + numOfApple);
	}
}

public class E06FruitSalesMain2 {

	public static void main(String[] args) {
		
//		* 초기화 메소드를 정의하였으므로, 각각 성격이 다른 객체들을 생성할 수 있다.
		// 판매자1
		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initMembers(0, 100, 1000, "seller1");
		
		// 판매자2
		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initMembers(0, 80, 500, "seller2");
		
		
		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.initMembers(10000, 0, "buyer");
		
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
