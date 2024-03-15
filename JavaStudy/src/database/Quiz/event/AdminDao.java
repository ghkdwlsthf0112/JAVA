package database.Quiz.event;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.JdbcConnection;

public class AdminDao {
	
	
	// 1. 새로운 상품을 추가하는 메서드
	public int addPrize(
			String prize_name, Double prize_rate, Integer init_qty) {
		
		try (
			Connection conn = JdbcConnection.getConnection();
		){
			conn.setAutoCommit(false);
			
		String sql = "INSERT INT eventprize(prize_id, prize_name,"
		+ "prize_rate, remain_qty, init_qtyt) VALUES("
				+ "event_prizez_id_seq.nextval, ?,?,?,?)";
		
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, prize_name);
			pstmt.setDouble(2, prize_rate);
			pstmt.setInt(3, init_qty);
			pstmt.setInt(4, init_qty);
			
			pstmt.executeUpdate();
		}
		
		String sql2 = "SELECT sum(prize_rate) AS \"total_rate\" "
				+ "FROM eventprizes";
		
		try (
			PreparedStatement pstmt = conn.prepareStatement(sql2);
			ResultSet rs = pstmt.executeQuery();	
		) {
			rs.next();
			Double total_rate = rs.getDouble(1);
			
			if (total_rate > 1) {
				System.out.println("총 확률이 100퍼센트가 넘어서 상품추가가 취소되었습니다");
				conn.rollback();
				throw new SQLException("rate error");
			} else {
				System.out.println("상품이 정상적으로 추가되었습니다");
				conn.commit();
			}
		}
		return 1;
	} catch (SQLException e) {
        e.printStackTrace();
    }
     return -1;
}
	
	// 2. 기존의 상품의 초기 수량을 변경하는 메서드
	public int daletePrize(int pk) {
		try (Connection conn = DBConnector.getConnection()) {
			String sql = "DELETE FROM eventprizes WHERE prize_id = ?";
			
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, pk);
				return pstmt.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	// 3. 기존의 상품 초기 수량을 변환하는 메서드
	public int updateQty(int pk, int qty) {
		try (Connection conn = DBConnector.getConnection()) {
			String sql = "UPDATE eventprizes SET init_qty = ? "
			+ "WHERE prize_id = ?";
			
			try (PreparedStatement pstmt = conn.prepareStatement(sql)){
				pstmt.setInt(1, qty);
				pstmt.setInt(2, pk);
				
				return pstmt.executeUpdate();
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return -1;
			}
	}
	
	// 4. 기존의 상품의 확률을 변경하는 메서드
	public int updateRate(int pk, double rate) {
		try (Connection conn = DBConnector.getConnection()) {
			String sql = "UPDATE eventprizes SET prize_rate = ? "
			+ "WHERE prize_id = ?";
			
			try (PreparedStatement pstmt = conn.prepareStatement(sql)){
				pstmt.setDouble(1, rate);
				pstmt.setInt(2, pk);
				
				return pstmt.executeUpdate();
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return -1;
			}
	}
	
	// 5. 기존의 상품 하나의 수량을 리셋하는 메서드
	public int reset(int pk) {
		try (Connection conn = DBConnector.getConnection()) {
			String sql = "UPDATE remain_qty = init_qty "
					+ "WHERE prize_id = ?";
			
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, pk);
				return pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	// 6. 기존의 모든 상품 수량을 리셋하는 메서드
	public int resetAll() {
		try (Connection conn = DBConnector.getConnection()) {
			String sql = "UPDATE eventprize SET remain_qty = init_qty ";
			
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				return pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public static void main(String[] args) {
//		AdminDao dao = new AdminDao();
//		
//		dao.addPrize("청소기", 0.08, 13);
//		dao.addPrize("컴퓨터", 0.02, 5);
//		dao.addPrize("냉장고", 0.02, 5);
	
	}
	
	
	
	
	

}
