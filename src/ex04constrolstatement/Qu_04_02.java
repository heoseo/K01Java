package ex04constrolstatement;

import java.io.IOException;

public class Qu_04_02 {

	public static void main(String[] args) throws IOException {

		System.out.print("하나의 문자를 입력하세요 : ");
		int ascii = System.in.read();
		
		String result = ('0' <= ascii && ascii <= '9')?"숫자입니다":"숫자가 아닙니다";
		
		System.out.println(result);
		// 또는
//		System.out.println(('0' <= ascii && ascii <= '9')?"숫자입니다":"숫자가 아닙니다");
		
	}

}
