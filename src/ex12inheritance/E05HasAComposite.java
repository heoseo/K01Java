package ex12inheritance;

class Gun{
	int bullet; // 총알의 갯수
	
	public Gun(int bNum) {
		bullet = bNum;
	}
	public void shutGun() {
		System.out.println("빵야~~!");
		bullet--;
	}
}

class Police{
	int handCuffs;
	Gun gun;
	
	public Police(int bNum, int hCuff) {
		
		handCuffs = hCuff;
		
		/*
		 권총 보유 여부 초기화
		 	: 만약 총알이 없는 상태라면 권총이 없는것으로 표현하기 위해 멤버변후를 null로 초기화한다.
		 	참조변수가 null값이란것은 아무것도 참조할 객체가 없다는 것이다.
		 */
		if(bNum <= 0) {
			gun = null;
		}
		else
			gun = new Gun(bNum);
	}
	
	// 수갑 채우는 행위를 표현
	public void putHandcuff() {
		System.out.println("수갑채움~!넌 콩밥~!");
		handCuffs--;
	}
	
	// 경찰이 권총을 발사하는 행위를 표현
	public void shut() {
		if(gun==null) {
			// 경찰이 권총을 소유하지 못했다면 발사할 수 없다.
			System.out.println("보유한 권총 없음. 헛빵~!");
		}
		else {
			gun.shutGun();
		}
	}
}

public class E05HasAComposite {

	public static void main(String[] args) {

		// 권총을 보유한 경찰을 표현
		System.out.println("==경찰1==");
		Police police1 = new Police(5,3);
		police1.shut();
		police1.putHandcuff();
		
		// 권총이 없는 경찰을 표현
		System.out.println("==경찰2==");
		Police police2 = new Police(0, 3);
		police2.shut();	// 총알을 발사할 수 없음.
		police2.putHandcuff();
		
	}

}
