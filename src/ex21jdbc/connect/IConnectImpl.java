package ex21jdbc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class IConnectImpl implements IConnect {
	

	// 동적퀴리를 위한 객체
	public PreparedStatement psmt;
	public Connection con;
	public ResultSet rs;
	
	public IConnectImpl() {
		System.out.println("IconnectImpl 기본생성자 호출");
	}
	public IConnectImpl(String user, String pass) {
		System.out.println("IConnectImpl 인자생성자 호출");
		try {
			Class.forName(ORACLE_DRIVER);
			connect(user, pass);
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	public IConnectImpl(String driver, String user, String pass) {
		System.out.println("IConnectImpl 인자생성자 호출");
		try {
			Class.forName(driver);
			connect(user, pass);
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public void connect(String user, String pass) {

		try {
			con = DriverManager.getConnection(ORACLE_URL, user, pass);
		}
		catch(SQLException e) {
			System.out.println("데이터베이스 연결 오류");
			e.printStackTrace();
		}
		
	}
	
	// 오버라이딩의 목적으로 정의한 메소드.
	// 쿼리실행은 각각의 클래스에 진행하게 될 것임.
	@Override
	public void execute() {
//		하는일없음
	}
	
	// 자원해제
	@Override
	public void close() {

		try {
			if(con!= null)con.close();
			if(psmt!=null)psmt.close();
			if(rs!= null)rs.close();
			System.out.println("자원반납 완료");
		}
		catch(Exception e) {
			System.out.println("자원 반납시 오류발생");
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String scanValue(String title) {

		Scanner scan  = new Scanner(System.in);
		System.out.print(title + "을(를) 입력(exit -> 종료) : ");
		String inputStr = scan.nextLine();
		
		
		/*
		equalsIgnoreCase()
			: equal()메소드와 동일하게 문자열이 같은지 비교하는 메소드로 
			다른 점은 대소문자를 구분하지 앟는다는 점이다.
		 */
		if("EXIT".equalsIgnoreCase(inputStr)) {
			System.out.println("프로그램을 종료합니다.");
			close();
			System.exit(0);
		}
		return inputStr;
	}

}
