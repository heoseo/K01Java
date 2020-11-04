package ex20io;

import java.io.BufferedReader;
import java.io.FileReader;

public class E09StringReader {

	public static void main(String[] args) {

		try {
			
			BufferedReader in = new BufferedReader(new FileReader("src/ex20io/string.txt"));
			
			String str;
			while(true) {
				/*
				개행(줄바꿈)이 등장하기 전 까지의 데이털르 한 번에 읽어온다.
				즉, 한 줄씩 읽어온다.
				 */
				str = in.readLine();
				
				if(str==null) {
					break;
				}
				
				/*
				입력시 newLine9)을 통해 개행정보가 입력되지만, 읽어온 문자열에서는 개행정보가 존재하지 않는다.
				따라서 개행으 ㄹ하라면 rpintln()을 사용해야한다. 
				즉, 개행정보는 문자열을 라인별로 구분한느 용도로만 사용한다.
				 */
//				System.out.println(str);
				System.out.print(str);
			}
			
			in.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
