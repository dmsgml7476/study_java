package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnect {
	
	protected Connection conn;
	protected Statement st;
	protected ResultSet rs;
	
	
	protected DBconnect() {
		connection();
	}


	private void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user = "peh";  // 이름
			String password = "1234"; // 비밀번호
			String url="jdbc:mysql://localhost:3306/peh"; // DB 주소
			
			try {
				conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				System.out.println("연결실패!");
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("로드실패!");
			e.printStackTrace();
		}
		
		
	}
	

}
