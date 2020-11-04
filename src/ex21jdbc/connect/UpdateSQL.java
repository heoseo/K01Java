package ex21jdbc.connect;

import java.sql.SQLException;

public class UpdateSQL extends IConnectImpl{

	// 생성자에서 DB연결
	public UpdateSQL() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {

		String sql = "UPDATE member "
				+ " SET name=?, pass=? "
				+ " WHERE id=?";
		try {
			psmt = con.prepareStatement(sql);
			while(true) {
				// 인파라미터 설정시 해당 인덱슴나 맞으면 순서는 상관없음.
				psmt.setString(3, scanValue("수정할 아이디"));
				psmt.setString(1, scanValue("이름"));
				psmt.setString(2, scanValue("패스워드"));
				
				int affected = psmt.executeUpdate();
				System.out.println(affected + "행이 업데이트 되었습니다.");
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {

		new UpdateSQL().execute();
		
	}

}
