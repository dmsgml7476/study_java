package collection3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	
	public Connection conn;
	public Statement st;   // 얘가 데이터를 받아옴
	public ResultSet rs;
	
	public DBConnect() {
		connection();
	}
	
	private void connection() {
		// 드라이버로드
		// 계정로그인
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//계정 로그인
			String user = "peh";
			String password = "1234";
			String url = "jdbc:mysql://localhost:3306/peh";
			
			try {
				conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				System.out.println("접속 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		
		

	}

}
