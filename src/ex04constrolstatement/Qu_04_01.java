package ex04constrolstatement;

import java.io.IOException;

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {

		System.out.print("문자 하나를 입력하세요 : ");
		int ascii = System.in.read();
		
		// 1)
		if('0' <= ascii && ascii <= '9') {
			if(ascii%2 == 0)		// '0'<=>48
				System.out.println("2의 배수입니다.");
			else
				System.out.println("2의 배수가 아닙니다.");
		}
		else
			System.out.println("숫자가 아닙니다.");
		
		
		
		// 2)
		// 숫자형 문자가 가지고 있는 아스키코드 값에서 48(0의 아스키코드)을 빼면
//		해당문자의 정수가 된다.
//		즉, '4' - '0' = 52 - 48 = 4(정수)
		boolean isNumber = (ascii >= '0' && ascii <= '9');
		
		if(isNumber == true) {
			if((ascii-'0')%2 == 0)
				System.out.println("2의 배수입니다.");
			else
				System.out.println("2의 배수가 아닙니다.");
				
		}else {
			
		}
	}

}
