package ex08class;

class ChildProperty{
	
	// 멤버변수 : 어린이가 보유하고 잇는 구슬의 개수 정보
	int numOfBead;
	
	// 생성자 
	public ChildProperty(int num) {
		numOfBead = num;
	}
	
	public void showProperty() {
		System.out.println("보유 구슬의 개수 " + numOfBead);
	}
	

	public void obtainBead(ChildProperty child, int obtainedBead) {	// obtainedBead : 얻은 구슬 개수
		child.numOfBead -= obtainedBead;// 메소드 호출시 매개변수로 전달된 객체
		
//		numOfBead += obtainedBead;		
		this.numOfBead += obtainedBead;	// 해당 메소드를 호출한 객체
	}
}

public class QuMarbles {

	public static void main(String[] args)
	{        	
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();
	}

}
