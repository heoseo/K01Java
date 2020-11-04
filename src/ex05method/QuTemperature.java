package ex05method;

import java.util.Scanner;

//섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 
//화씨를 입력받아서 섭씨로 변환하여 "리턴"하는 함수를 만들어라.

public class QuTemperature {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 입력 : ");
		int c = sc.nextInt();
		System.out.print("화씨 입력 : ");
		int f = sc.nextInt();
		
		System.out.println("섭씨 " + c + "도 => 화씨 " + celsiusToFahrenheit(c) + "도");
		System.out.println("화씨 " + c + "도 => 섭씨 " + fahrenheitToCelsius(f) + "도");
		
	}
	
	static double celsiusToFahrenheit(double c) {
		
		return 1.8 * c + 32;
	}
	
	static double fahrenheitToCelsius(double f) {
		
		return (f - 32) / 1.8;
	}
	
//	static double celsiusToFahrenheit(double c) {
//		
//		double result = 1.8 * c + 32;
//		
//		return result;
//	}
//	
//	static double fahrenheitToCelsius(double f) {
//		
//		double result = (f - 32) / 1.8;
//		
//		return result;
//	}

}
