package ex21jdbc.statement;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeleteQuery {
	
	private Connection con;
	private Statement stmt;
	
	// InsertQuery 와 다른점 : 생성자에서 드라이버에 대한 로드만 진행, 
	//						connect()는 excute()에서 진행.
	public DeleteQuery() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		}
		catch(ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	// connect() : excute()메소드에서 Oracle DB에 대한 연결을 진행한다.
	public void connect() {
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin://@localhost:1521:orcl",
					"kosmo",
					"1234");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 오류");
			e.printStackTrace();
		}
	}
	
	// DB연결, 쿼리작성, 쿼리 전송 및 실행을 위한 메소드
	private void execute() {
		
		// escute()-connect()에서 DB연결.
		connect();
		
		try {
			
			/* (현재 id=ko1, id=test2 입력됨)
			- test99 삭제시 입력되지 않은 데이터이므로 삭제되지 않음.
				데이터가 없는경우 예외는 발생하지 않는다.
			- ko1 삭제시 자식레코드가 있으므로 제약조건위배로 삭제되지 않음.
			 */
			stmt = con.createStatement();
			
			String query = "DELETE FROM member WHERE id = 'test2' ";
					
			
			int affected = stmt.executeUpdate(query);	// 업데이트된 행의 갯수 반환.
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
		new DeleteQuery().execute();
	}

}
