package ex08class;

// 계좌번호, 전화번호는 사칙연산이 필요 없기 때문에 "String"으로!
/*
	[시나리오]
	은행계좌를 추상화 해보자
	 - 멤버변수 : 예금주(name)
	 			계좌번호(accountNumber)
	 			잔고(balance)
	 - 멤버메소드 : 입금하다(deposit())
	 			출금하다(withdraw())
	 			계좌잔고 출력하기(showAccount())
	 - 조건 1: 입금은 무제한으로 가능함
	 - 조건 2 : 잔고가 부족할 경우에는 출금불능 처리
 */

class Account{
	
	// [멤버변수]
	String name;
	String accountNumber;
	int balance;
	
	// [멤버메소드]
	void deposit(int money) {	// 입금처리 : 매개변수로 전달되는 금액만큼 입금처리
		balance += money;
		System.out.println(money + "원이 입금됨");
	}
	
	void withdraw(int money) {	// 출금처리
		if(balance >= money) {	// : 출금을 위해 잔고와 출금액을 비교해서 처리함.
			balance -= money;	// -> 잔고가 충분한 경우 출금으로 처리.
			System.out.println("계좌에서 " + money + "원이 출금됨");
		}
		else {
			System.out.println("잔고부족으로 출금불능");
		}
	}
	
	void showAccount() {		// 계좌조회
		System.out.println("계좌주 : " + name);
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("잔고 : " + balance);
	}
	
	void init(String n, String a, int b) {	// 초기화 메소드
		name = n;
		accountNumber = a;
		balance = b;
	}
}

public class E04AccountMain {

	public static void main(String[] args) {

		Account account = new Account();
		account.init("장동건", "111-21-8888", 1000);
		account.deposit(9000);
		account.withdraw(5000);
		account.showAccount();
		
		/////////////////////////////////////
		/// 두번째 통장 개설
		Account account2 = new Account();
		account2.name = "정우성";
		account2.accountNumber = "123-45-67890";
		account2.balance = 900000;
		account2.showAccount();
		
		
	}

}
