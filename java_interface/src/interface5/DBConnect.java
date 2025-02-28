package interface5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {  // 데이터베이스 연결작업
	
	private Connection conn; // 계정 로기인 상태 저장할 변수
	private Statement st; // 쿼리문 보내기 위한 변수
	private ResultSet rs; // 조회결과 받기


	protected DBConnect() {
		connection();  // DB 연결 메서드
	}
	
	private void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // 드라이버 로드
			
			String user = "peh"; // 이름
			String password="1234";  // 비밀번호
			String url = "jdbc:mysql://localhost:3306/peh"; //DB주소/DB
			
			
			conn = DriverManager.getConnection(url, user, password);
			
			
		} catch(Exception e) {
			System.out.println("드라이버 로드 실패 또는 연결 실해");
		}
	}
}
