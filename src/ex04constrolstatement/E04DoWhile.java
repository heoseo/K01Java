package ex04constrolstatement;

import java.io.IOException;
import java.util.Scanner;

public class E04DoWhile {

/*
			* do~while
			 : 반드시 한 번은 실행해야 할 경우 사용하는 반복문.
			 즉 조건검사 없이 무조건 한 번은 실행된다.
			 	형식]
			 		반복을 위한 초기값;
			 		do{
			 			실행문장;
			 			반복문을 벗어나기 위한 증감식;
		 			}while(조건식);	<- 반드시 ;(세미콜론)으로 마무리한다.
 */
	
	public static void main(String[] args) throws IOException{

		// while문 조건에 만족하지 않아도 일단 괄호안은 한번은 실행됨을 보여줌.
		int test = 1;
		do {
			test++;
			System.out.println("무조건 한 번 실행!");
		}while(test<0);
		
		System.out.println("실행은 했으니까  test++ => " +test);

//		====================================================================
		
/*
		[시나리오1]
		E03 예제의 수열문제를 do~while문으로 변경하여 구현하시오.
 */
		
		System.out.println("[시나리오1]");
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		}while(i<=10);
		System.out.println("1~10까지의 누적합 : " + sum);
		
//		====================================================================
		
/*
		[시나리오2]
		1부터 1000까지의 정수 중 4의 배수이거나 7의배수인 수의 합을 구하여 출력하는 프로그램을 작성하시오.
		단, do~while문을 사용해야 한다.
 */
		System.out.println("[시나리오2]");
		int total = 0;
		int j = 1, line;
		do {
			line = 1;
			while(line <= 10) {
				
				if(j%4 == 0 || j%7 == 0) {
					System.out.printf("j = %-4d ", j);
					total += j;
					line++;
				}
				j++;
			}
			System.out.println();
		}while(j <= 1000);
		
		System.out.println("1~1000사이 4or7의 배수합 : " + total);
		
		
//		====================================================================
		
/*
		[시나리오3]
		국어, 영어, 수학 점수를 사용자로부터 입력받은 후 평균을 구해 A~F학점을 판단하여 출력하는 프로그램을 작성하시오.
		단, 사용자가 X,x(대소문자 구분없음)를 입력하면 프로그램이 종료되어야 하며 do~while문으로 구현해야 한다.
 */
		System.out.println("[시나리오3]");
		Scanner scanner = new Scanner(System.in);
		
		int kor, eng, math, avg;
		int exitCode;
		
		do {
			System.out.print("국어점수 : ");
			kor = scanner.nextInt();
			System.out.print("영어점수 : ");
			eng = scanner.nextInt();
			System.out.print("수학점수 : ");
			math = scanner.nextInt();
			
			/*
				switch문은 if문과 같은 조건식을 사용할 수 없고 산술식만 사용할 수 있으므로 
				점수의 구간을 구하기 위해 총점을 30(3*10)으로 나눠준다.
				-> 88점 / 10 => 8. 81점 / 10 => 8. 100 / 10 == > 10. 
			 */
			avg = (kor + eng + math) / (3*10);
			switch(avg) {
			case 10: case 9:
				System.out.println("A학점");break;
			case 8:
				System.out.println("B학점");break;
			case 7:
				System.out.println("C학점");break;
			case 6:
				System.out.println("D학점");break;
			default:
				System.out.println("F학점");
			}

			System.out.println("종료하려면 x(X)를 입력하세요.");
			System.out.println("계속하려면 아무키나 입력하세요.");
			exitCode = System.in.read();
		}while(!(exitCode=='x' || exitCode=='X'));
		
		System.out.println("시나리오 종료");
		/*
		x를 입력한 경우
			: (true OR false ) => ! true => false 반환.
			즉 do~while문을 탈출함.
		a를 입력한 경우
			: 위 경우와는 반대이므로 Loop를 반복함.
		 */
		
		
		
		
	}

}
