package DAO;

import java.sql.SQLException;

public class MemberDAO extends DBconnect {

	public boolean userIdAndPassword(String mId, String mPw) {
		// 입력한 아이디와 비밀번호로 테이블 조회하기
		
		String sql = "select * from member1 where member_id='"+mId+"' and password='"+mPw+"'"; // 작은 따옴표는 필수
		
		try {
			st = conn.createStatement();  // 쿼리문 보낼 수 있게 statement 생
			rs = st.executeQuery(sql); // statement 로 쿼리 보내고 결과 받기
			if (rs.next()) {// 조회 결과가 있다면 next 는 true, 없다면 false
				return true; // 로그인 성공했으니까 true 반환
			}  // 오류가 난 상황에서도 대처를 해줘야하니, rs로 직접 하지 않고 if 문 사용
			
		} catch (SQLException e) {
			System.out.println("아이디 비번 조회 실패");
			e.printStackTrace();
		}
		return false; // 로그인 실패 (아이디 또는 비번 잘못) false 반환
		
	}

}
