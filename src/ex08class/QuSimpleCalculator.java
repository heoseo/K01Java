package ex08class;

class CalculatorEx{
	// 멤버변수
	// add, min, mul, div
	int[] operateCounter = new int[4];
	String[] operate = {"덧셈", "뺄셈", "곱셈", "나눗셈"};
	
	public void init() {
		for(int i = 0; i < operateCounter.length; i++)
			operateCounter[i] = 0;
	}
	
	public double add(double n1, double n2) {
		operateCounter[0]++;
		return n1 + n2;
	}
	
	public double min(double n1, double n2) {
		operateCounter[1]++;
		return n1 - n2;
	}
	
	public double mul(double n1, double n2) {
		operateCounter[2]++;
		return n1 * n2;
	}
	
	public double div(double n1, double n2) {
		operateCounter[3]++;
		return n1 / n2;
	}
	
	void showOpCount() {
		for(int i = 0; i < operateCounter.length; i++)
			System.out.println(operate[i] + " 결과 : " + operateCounter[i]);
	}
	
}

public class QuSimpleCalculator {


	public static void main(String[] args) {
		
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
		

	}

}
