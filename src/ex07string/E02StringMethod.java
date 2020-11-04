package ex07string;

public class E02StringMethod {

	public static void main(String[] args) {

		System.out.println("String 클래스의 주요 메소드");
		
		String str1 = "Welcome to java";
		String str2 = "자바야 놀자!";
		
//		[1] length()
//			: 문자열의 길이를 반환한다.
		System.out.println("[1] length()");
		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str2의 길이 : " + str2.length());
		
		
		
//		[2] charAt(인덱스)
//			:문자열에서 특정 index에 해당하는 문자 하나를 반환한다.
//			index는 0부터 시작한다.
		System.out.println("\n[2] charAt(인덱스)");
		System.out.println("str1의 두 번째 문자 : " + str1.charAt(1));
		System.out.println("str2의 두 번째 문자 : " + str2.charAt(1));
		
		
		
//		[시나리오1] 
//		주민등록번호를 이용하여 성별을 판단하는 프로그램을 작성하시오.
//		190419-3000000 -> 남자	/ 190419-4000000 -> 여자
		System.out.println("\n[시나리오1]");
		String juminNum = "190419-5000000";
		if(juminNum.charAt(7)=='1' || juminNum.charAt(7)=='3') {
			System.out.println("남자입니다");
		}
		else if (juminNum.charAt(7)=='2' || juminNum.charAt(7)=='4') {
			System.out.println("여자입니다.");
		}
		else if(juminNum.charAt(7) == '5' || juminNum.charAt(7) == '6') {
			System.out.println("외국인입니다.");
		}
		else {
			System.out.println("주민번호가 잘못되었습니다.");
		}
		
		
		
//		[4] compareTo()
//			: 두 문자열의 첫 번째 문자부터 순차적으로 비교하면서 앞의 문자열의 아스키코드가 크면 양수를 반환,
//			뒤의 문자열의 아스키코드가 크면 음수를 반환, 같으면 0을 반환한다.
		System.out.println("\n[4] compareTo()");
		String str3 = "A";
		String str4 = "B";
		System.out.println("str3.compareTo(str4) => " + str3.compareTo(str4));	// -1
		System.out.println("str4.compareTo(str3) => " + str4.compareTo(str3));	// 1
		System.out.println("ABC와 ABC : " + ("ABC".compareTo("ABC")== 0 ? "문자열이 같다" : "문자열이 다르다"));
		
		
		
//		[5] concat()
//			: 두 개의 문자열을 연결할 때 사용한다. + 기호와 동일한 역할을 한다.
		System.out.println("\n[5] concat()");
		System.out.println("JAVA".concat(" WORLD".concat(" GO")));
		System.out.println("JAVA" + " WORLD" + " GO");
		
		
		
//		[6] contains()
//			: 문자열에 특정 문자열이 포함되어있는지를 판단하여 true/false를 반환한다.
		System.out.println("\n[6] contains()");
		System.out.println("str1 contains \"To\" => " + str1.contains("To"));
		System.out.println("str1 contains \"to\" => " + str1.contains("to"));
		
		
		
/*
		[시나리오2]
		해당 문자열이 이메일 형식인지 검사하는 프로그램을 작성하시오.
		hong@ikosmo.co.kr => 이메일 형식임
		not@naver -> 이메일 형식이 아님
 */
		System.out.println("\n[시나리오2]");
		String email1 = "hong@ikosmo.co.kr";
		
		System.out.print(email1 + " => ");
		if(email1.contains("@") && email1.contains(".")) {
			System.out.println("이메일 형식임");
		}
		else {
			System.out.println("이메일 형식이 아님");
		}
		
		
		
//		[7] endsWith()
//			: 문자열이 특정 문자열로 끝나면 true, 아니면 false를 반환한다.
//		[8] startsWith()
//			: 특정 문자열로 시작하면 true를 반환한다.
		System.out.println("\n[7]endsWith()\n[8]startsWith()");
		System.out.println("\"www.daum.net\".endsWith(\"net\") => " + "www.daum.net".endsWith("net"));
		System.out.println("\"naver.com\".startsWith(\"http\") => " + "naver.com".startsWith("http"));
		
		
		
//		[9] format()
//			: 출력형식을 지정하여 문자ㅕㅇㄹ로 반환하고 싶을 때 사용한다.
//			printf()와 사용법은 동일하고 주로 웹어플리케이션(JSP)를 제작할 때 많이 사용된다.
		System.out.println("\n[9] format()");
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d\n", 81, 92, 100);
		String formatStr = String.format("국어 : %d, 영어 : %d, 수학 : %d\n", 81, 92, 100);
		System.out.println(formatStr);
		
		
		
//		[10] indexOf()
//			: 문자열에서 특정 문자열의 시작인덱스를 반환한다.
//			먄약 찾는 문자열이 없다면 -1을 반환한다.
		System.out.println("\n[10] indexOf()");
		System.out.println("\"Welcome to java\"에서 \"ava\"의 위치 => " + str1.indexOf("ava"));
		System.out.println("\"Welcome to java\"에서 \"J\"의 위치 => " + str1.indexOf("J"));
		System.out.print(email1 + " => ");
		System.out.println(email1.indexOf("@") != -1 ? "이메일형식 맞음" : "이메일형식 아님");

//		[시나리오3]
//		주민등록번호를 indexOf를 사용하여 성별을 구분하는 프로그램을 작성하시오.
		
		// '-'의 위치를 찾아 +1 하면 성별을 구별하는 문자를 얻을 수 있음.
		System.out.println("\n[시나리오3]");
		juminNum = "120403-3012345";
		int index = juminNum.indexOf("-") + 1;
		if(juminNum.charAt(index) == '3') {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
		
		
		
//		[11] lastIndexOf()
//			: 사용법은 indexOf()와 동일하나 문자열의 맨 뒤부터 문자열을 찾아서 인덱스를 반환한다.
		System.out.println("\n[11] lastIndexOf()");
		System.out.println("\"Welcome to java\"에서 \"ava\"의 위치 => " + str1.lastIndexOf("ava"));
		System.out.println("\"Welcome to java\"에서 \"J\"의 위치 => " + str1.lastIndexOf("J"));
		System.out.println("\"Welcome to java\"에서 \"a\"의 위치 (indexOf) => " + "indexOf : " + str1.indexOf("a"));
		System.out.println("\"Welcome to java\"에서 \"a\"의 위치 (lastIndexOf) => " + "lastIndexOf : " + str1.lastIndexOf("a"));
		
		
		
//		[12] replace
//			: 특정 문자열을 찾아서 지정된 문자열로 변경한다.
//			만약 찾는 문자열이 없다면 변경만 되지 않을 뿐 에러가 발생하지는 않는다.
		System.out.println("\n[12] replace");
		System.out.println("\"Welcome to java\"에서" + "J를 G로 변경하기");
		System.out.println(str1.replace("J", "G"));
		System.out.println("\"Welcome to java\"에서" + "java를 KOSMO로 변경하기");
		System.out.println(str1.replace("java", "KOSMO"));
		
		
		
//		[13] split()
//			: 문자열을 구분자를 통해 분리해서 String타입의 배열로 반환한다.
//			해당 구분자가 없는 경우에는 크기가 1인 배열로 반환한다.
		System.out.println("\n[13] split()");
		System.out.println("\"010-1234-5678\"를 \"-\"로 split \n=> ");
		String phoneNumber = "010-1234-5678";
		String[] phoneArr = phoneNumber.split("-");
		for(int i = 0; i < phoneArr.length; i++) {
			System.out.printf("phoneArr[%d] = %s\n", i, phoneArr[i]);
		}
		
		System.out.print("\n\"010-1234-5678\"를 \"%\"로 split \n=> ");
		phoneArr = phoneNumber.split("%");
		for(int i = 0; i < phoneArr.length; i++) {
			System.out.printf("phoneArr[%d] = %s\n", i, phoneArr[i]);
		}
		System.out.println("%로 구분한 결과 phoneArr 배열의 크기 : " + phoneArr.length);
		
		
		
		
//		[14] substring()
//			: 시작인덱스와 끝인덱스 사이의 문자열을 잘라서 반환해줌.
//			즉 문자열을 자를 때 사용하는 메소드임.
//			사용1 ) substring(index) -> index부터 문자열의 끝까지 잘라서 반환함.
//			사용2 ) substring(index1, index2) -> index1부터 index2-1 까지 반환함.
		System.out.println("\n[14] substring()");
		System.out.println("\"Welcome to java\"에서 3번부터 자르기 => " + str1.substring(3));
		System.out.println("\"Welcome to java\"에서 3번부터 6번까지 자르기 => " + str1.substring(3,7) + ".");
		
		
		
		
/*
		[시나리오4]
		다음 파일명에서 확장자를 잘라내는 프로그램을 작성하시오.
		파일명 : my.file.images.jpg
 */
		System.out.println("\n[시나리오4]");
		String filename = "my.file.images.jpg";
		// indexOf()를 사용하면 앞에 있는 .의 인덱스가 검색되므로 last(뒤)부터 검색.
		int beginIndex = filename.lastIndexOf(".") + 1;
		System.out.println("\"my.file.images.jpg\" 파일의 확장자는 : " + filename.substring(beginIndex));
		
	}

}
