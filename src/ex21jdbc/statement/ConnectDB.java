package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 객체생성의 목적이 아닌 상속의 목적으로 정의된 추상클래스.
public abstract class ConnectDB {
	
	/*
	멤버변수 : 상속받은 하위클래스에서의 접근을 허용하기 위해
			접근지정자는 protected로 선언
	 */
	protected Connection con;	// 연결
	protected Statement stmt;	// 쿼리전송 및 실행
	protected ResultSet rs;		// 쿼리 실행 결과 반환
	
	public ConnectDB(String id, String pw) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl",id, pw);
			
			System.out.println("Oracle DB 연결 성공");
			
			
		}
		catch( SQLException e) {
			System.out.println("SQLExceptio 예외발생");
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException 예외발생");
			e.printStackTrace();
		} 
		catch (Exception e) {
				System.out.println("DB연결시 예외발생");
				e.printStackTrace();
		}
	}
	
	public ConnectDB() {

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String userid = "kosmo";
			String userpw = "1234";
			
			con = DriverManager.getConnection(url,userid, userpw);
			
		
		} catch( SQLException e) {
			System.out.println("SQLExceptio 예외발생");
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException 예외발생");
			e.printStackTrace();
		} 
		catch (Exception e) {
			System.out.println("DB연결시 예외발생");
			e.printStackTrace();
		}
		
	}
	
	// 자원 반납을 위한 메소드
	public void close() {
		try {
			if(stmt!=null) stmt.close();
			if(con!=null) stmt.close();
			if(rs!=null) con.close();
			System.out.println("DB자원반납완료");
		} catch (SQLException e) {
			System.out.println("자원반납시 오류가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	
	// 오버라이딩의 목적으로 생성한 추상메소드
	abstract void execute();

}
