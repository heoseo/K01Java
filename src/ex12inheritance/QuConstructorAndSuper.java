package ex12inheritance;

class Car{
   	int gasoline;
   	
   	public Car(int gasoline) {
   		this.gasoline = gasoline;
   		System.out.println("Car 생성자 호출");
	}
}

class HybridCar extends Car{
   	int electric;
   	
   	public HybridCar(int gasoline, int electric) {
   		super(gasoline);
   		this.electric = electric;
   		System.out.println("HybridCar 생성자 호출");
   	}
}

class HybridWaterCar extends HybridCar{
   	int water;
 
   	public HybridWaterCar(int gasoline, int electric, int water) {
   		super(gasoline, electric);
   		this.water = water;
   		System.out.println("HybridWaterCar 생성자 호출");
   	}

	public void showNowGauge(){
     	System.out.println("남은가솔린:"+gasoline);
     	System.out.println("남은전기량:"+electric);
     	System.out.println("남은워터량:"+water);
   	}
}

public class QuConstructorAndSuper {

	/*
	남은가솔린:10
	남은전기량:20
	남은워터량:30
	 */
	public static void main(String[] args)
	{
		// 최하위 클래스를 통해 객체 생성시 3개의 매개변수 필용함.
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}
}
