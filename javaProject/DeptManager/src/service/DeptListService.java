package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import dao.DeptDao;
import domain.Dept;

public class DeptListService {

	DeptDao dao;

	public DeptListService(DeptDao dao) {
		this.dao = dao;
	}

	public List<Dept> getDeptList() {
		
		Connection conn = null;
		
		try {
			// Connection 객체 구하기
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dbUrl, "hr", "tiger");
			
			// 트랜젝션 시작
			conn.setAutoCommit(false);
			
			// insert(conn)
			// update(conn)
			// select(conn)
			// update(conn)
			// insert(conn)
			
			// commit
			conn.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;

	}

}
