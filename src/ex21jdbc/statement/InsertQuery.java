package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
	
	// 멤버변수
	Connection con;		// <- DB연결을 위한 객체
	Statement stmt;		// <- 쿼리 전송 및 실행을 위한 객체
	
	//생성자
	public InsertQuery() {
		try {
			
			// 1. 오라클 드라이버로드
			Class.forName("oracle.jdbc.OracleDriver");
			// => 메모리에 로드된 드라이버가 "DriverManager"라는 클래스에 등록된다.
			
			// 2. Connection 객체를 통해 DB연결
			con = DriverManager.getConnection(
					"jdbc:oracle:thin://@localhost:1521:orcl",
					"kosmo",
					"1234");
			System.out.println("오라클 DB 연결성공");
		}
		catch(ClassNotFoundException e) {
			// ojdbc6.jar 파일이 없거나 연동되지 않았을 때 예외발생
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("알 수 없는 예외발생");
		}
	}// end of InsertQuery
	
	
	// 쿼리작성 및 실행 메소드
	private void execute() {
		try {
			
			// 3. Statement객체 생성을 위한 메소드 호출
			stmt = con.createStatement();
			
			// 4. SQL문(=쿼리문) 작성.
			String sql = "INSERT INTO member VALUES"
					+ " ('test2', '2222', '이길동', SYSDATE) ";
			
			// 5. 쿼리 실행 및 결과괎 반환.
			/*
			- executeUpdate() : 쿼리문이 insert/update/delete와 같이
								기존레코드에 영향을 미치는 경우에 사용된다.
							  :	실행 후 영향을 받은 행의 갯수가 int형으로 반환된다.
			- executeQuery()  : select 쿼리를 실행할 떄 호출하는 메소드로
								레코드에 영향을 미치지 않고 조회만 하는 경우 사용된다.
							  : 조회한 레코드를 반환값으로 받아야 하므로
								ResultSet 객체를 반환타입으로 사용한다.
			 */
			int affected = stmt.executeUpdate(sql);	// 업데이트된 행의 갯수 반환.
			System.out.println(affected + "행이 입력되었습니다.");
		}
		catch(SQLException e) {
			System.out.println("쿼리실행에 문제가 발생하였습니다.");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}// end of execute

	private void close() {

		try {
			if(stmt != null) stmt.close();
			if(con !=  null) con.close();
			System.out.println("DB자원반납완료");
		}
		catch(SQLException e) {
			System.out.println("자원반납시 오류가 발생하였습니다.");
		}
		
	}// end of close

	public static void main(String[] args) {

		// [실행방법1] : 객체생성후 참조변수에 대입후 메소드 호출
//		InsertQuery iQuery = new InsertQuery();
//		iQuery.execute();
		
		// [실행방법2] : 객체생성과 동시에 메소드 호출
		new InsertQuery().execute();
		
	}
	
}
