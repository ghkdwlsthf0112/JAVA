package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J03_ExecuteUpdate {

	/*
	 	pstmt.executeQuery
	 	
	 	- SELECT문에만 사용한다. 결과로 ResultSet이 나온다
	 	
	 	# pstmt.executeUpdate
	 	
	 	- INSERT, UPDATE, DELETE문에 사용한다. 결과로 int값이 나온다
	 	- int 값으로는 반영된 행의 개수가 리턴된다
	*/
	public static void main(String[] args) {
		
		try (
			Connection conn = JdbcConnection.getConnection();
		) {
			String sql1 = "INSERT INTO " 
					+ "fruits(fruit_id, fruit_name, fruit_price) "
					+ "VALUES(fruit_id_seq.nextval,?,?)";
			
			try (PreparedStatement pstmt = conn.prepareStatement(sql1)) {
				pstmt.setString(1, "Peach");
				pstmt.setInt(2, 1500);
				
				int row = pstmt.executeUpdate();
				System.out.println(row + "행이 변경되었습니다...");
			}
			
			String sql2 = "UPDATE fruits SET fruit_price=fruit_price+100 "
					+ "WHERE fruit_id < 150";
			
			try (PreparedStatement pstmt = conn.prepareStatement(sql2)) {
				int row = pstmt.executeUpdate();
				System.out.println(row + "개의 과일 가격이 100원 올랐습니다...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
